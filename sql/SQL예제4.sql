-- 홍길동 교수의 모든 지도학생을 확인하기 위한 sql문을 작성하세요.
select pr_name as '교수',st_name as'학생'
	from coach
	join professor 
		on ch_pr_num=pr_num
	join student
		on ch_st_num=st_num
where pr_name='윤봉길';

-- 홍길동 교수님이 2020년 1학기에 강의하는 모든 과목명을 확인하는 sql문
-- 폐강인 경우는 강의 테이블에서 해당 강의를 삭제한다는 조건의 시스템
-- 2020#_%#_1%로 조건을 걸면 다음과같은 경우에 검색되어서 잘못됨 =>2020_MSC001_2_1
-- 2020#_%#_1_%로 조건을 걸면 _1다음에 1글자 이상이 필요해서 해결 됨
select pr_name,su_title,co_code 
	from (select * from course where co_code like '2020#_%#_1_%' escape '#') as co
	join (select * from professor where pr_name = '홍길동')as pr
		on co_pr_num=pr_num
	join subject
		on co_su_num=su_num;
        
-- 홍길동 교수가 하거나 했던 강의 이름
select pr_name,su_title 
	from course
	join (select * from professor where pr_name = '홍길동')as pr
		on co_pr_num=pr_num
	join subject
		on co_su_num=su_num
group by su_title;

-- 정렬 : order by 속성 ASC(오름차순)/DESC(내림차순)
select * from attend order by at_num desc;
