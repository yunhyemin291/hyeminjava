/*수강 테이블에 이수한 수강정보를 추가하세요
예를 들면 2019년도 수강을 추가
1. 학생과 강의 정보
2. 2019년도 이전(포함)에 입학한 학생
3. 강의 정보 교수정보와 과목정보
4. 2019년 이전에(포함) 교수가 된 교수정보*/
/* 2015110011학번 학생이 현재까지 이수한 학점을 출력하는 SQL문을 작성하세요.*/
select sum(su_point) from university.attend
	join university.course
		on at_co_code=co_code
	join university.subject
		on co_su_num=su_num
	where at_st_num=2015110011 and at_complete = 'Y';

use university;

drop trigger if exists update_attend;

delimiter //
-- attend 테이블에 update 이벤트가 발생된 후에 동작하는 트리거
-- 데이터가 추가된 후에 동작하며 추가된 데이터는 new를 통해 접근할 수 있다.
create trigger update_attend after update on attend
-- for each row는 update나 delete와 같이 조건에 의해 여러 행이 수정되거나 삭제될때 변경되는 각행을 의미
for each row
begin
	-- 변수 선언
	declare _point int default 0;
    declare _total int default 0;
    if new.at_complete='Y' then 
    set _point =
		(select ifnull(sum(su_point),0) 
			from attend
		join university.course
			on at_co_code=co_code
		join university.subject
			on co_su_num=su_num
		where at_st_num=new.at_st_num AND at_complete = 'Y');
         update student
			set st_point = _point
			where st_num=new.at_st_num;
        end if;
        if old.at_complete ='Y' and new.at_complete = 'N' then
			set _total=(select st_point from student where st_num =new.at_st_num);
			set _point = (select su_point 
				from attend
					join course
						on at_co_code=co_code
					join university.subject
						on co_su_num=su_num
				where at_st_num=new.at_st_num and new.at_co_code = at_co_code);
        set _point=_total -_point;
         update student
			set st_point = _point
			where st_num=new.at_st_num;
        end if;
       
    
end//
delimiter ;
show triggers;
# 트리거의 실행문 안에서 트리거 이벤트가 발생한 테이블을 수정할 수 없다.
# 위의 트리거는 ATTEND 테이블에서 이벤트가 발생할 때 실행되는 테이블이기 때문에
# 트리거 안에서 ATTEND 테이블을 수정할 수 없다. 

