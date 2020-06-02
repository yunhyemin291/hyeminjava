/* 과목코드,강의년도,강의학기,분반,강의실,강의시간,교수번호가 주어졌을때 
새로운강의를 등록하는 프로시저를 작성하세요
CONCAT함수:매개변수들을 이어서 하나의 문자열로 만드는 함수
CONCAT(1,'ABC','-')=>1ABC-
*/
drop procedure if exists insert_course;
delimiter //
create procedure insert_course(
	in subject_code varchar(6),
	in course_year int,
	in course_seasion int,
	in course_class int,
	in course_room varchar(15),
	in course_time varchar(30),
	in professor_num int
)
begin
	declare _code varchar(16);
    #2015_MSC001_1_1
    set _code = concat(course_year,'_',subject_code,'_',course_seasion,'_',course_class);
    if course_seasion >=1 and course_seasion <= 4
		# subject_code와 일치하는 과목이 있으면
        and (select count(*) from subject where su_num = subject_code) !=0
		# professor_num과 일치하는 교수가 있으면
        and (select count(*) from professor where pr_num = professor_num) !=0
        # 학기가 교수번호보다 빠른경우: 2015학기인데 2020학번인 교수가 강의하려는 경우
        and convert( professor_num / 1000000,signed integer) <= course_year
        #강의코드 중복되지 않으면
        and (select count(*) from course where co_code=_code)=0
    then    
		insert into course
			value(_code,course_room,course_time,course_class,professor_num,subject_code);
    end if;
end//
delimiter ;
call insert_course('MSC001',2020,2,3,'강의실 301호','월1,2',2020110004);
select * from university.course;