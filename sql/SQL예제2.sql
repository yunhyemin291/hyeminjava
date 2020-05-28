-- join은 두 테이블을 연결하여 하나의 테이블을 만듬
-- 두 테이블을 연결해주는 연결고리에 해당하는부분이 on 다음에 나오는 코드
-- on을 통해 연결할 때 테이블A와 테이블B에 연결하는 속성명이 서로 다른 경우
-- 테이블 명을 생략할 수 있다.
-- 여러개의 테이블을 join으로 연결할 때, 테이블 연결 순서에 따라 join 속도가 달라진다.
select 속성 
	from 테이블A 
		join 테이블B 
        on 테이블A,속성명=테이블B,속성명
where 조건;
select * from course;
-- 강의를 하는 교수명을 확인하기 위한 sql
select co_code, pr_name
	from course
		join professor
        on pr_num=co_pr_num;
-- 강의의 과목명을 확인하기 위한 SQL
select co_code, su_title
	from course
		join subject
        on su_num=co_su_num;
-- 강의의 과목명과 교수를 확인하기 위한 SQL
select co_code, pr_name, su_title
	from course
		join professor
        on pr_num=co_pr_num
        join subject
        on su_num=co_su_num;
-- 학생이름과 지도교수의 이름이 출력되도록 sql문을 작성하세요.
select pr_name,st_name
	from coach
		join professor
        on pr_num=ch_pr_num
        join student
        on st_num=ch_st_num;
-- 홍길동 학생이 수강했거나 하고 있는 과목을 출력하는 sql문을 작성하세요.
select st.st_name,su_title
	from attend
    -- ㄴstudent 테이블에서 이름이 임꺽정인 학생을 검색하여 검색결과를 st라는 임시테이블로 생성
    -- MySQL에서는 as 테이블 명을 안붙이면 에러발생. 오라클은 as st를 안붙여도 가능
		join (select * from student where st_name ='홍길동') as st
        on st.st_num=at_st_num
        join course
        on co_code=at_co_code
        join subject
        on co_su_num=su_num;
-- 현재(2020년 1학기) 개설된 과목을 볼수 있도록 SQL문을 작성하세요.
SELECT co_code,su_title
	FROM (select * from course where co_code like '2020#_%#_1#_%' escape '#')as t
	join subject
    on co_su_num=su_num;
-- 임꺽정 학생이 현재까지 수강했거나 수강한 과목의 총 학점을 출력하도록 sql문을 작성하세요.
select st.st_name,sum(su_point)
	from attend
		join (select * from student where st_name ='홍길동') as st
        on st.st_num=at_st_num
        join course
        on co_code=at_co_code
        join subject
        on co_su_num=su_num;
-- 수강기록에서 총점을 확인하는 sql문
select at_co_code as '강의코드', at_st_num as '학번',
(at_mid+at_final+at_hw+at_attendance) as '총점' from attend;
-- 2020년 1학기에 대학수학기초 강의 1분반 학생의 수를 확인하는 sql문
select count(*) as '학생의 수' 
	from (select * from attend where at_co_code like '2020@_%@_1@_%' escape '@') as t 
    join course
    on co_code = at_co_code
    join (select * from subject where su_title = '대학수학기초') as t2
    on su_num=co_su_num;
    
-- 홍길동 학생이 작성한 게시글을 확인하는 sql문
select st_name as '작성자',bo_title as '게시글'
	from board
    join (select * from student where st_num=2020110011) as t
    on bo_st_num=st_num;
-- 학생의 성이 홍씨이고, 학번이 2020번인 학생들의 모든정보를 출력하는 sql문
select *
	from student
    where st_name like '홍%'
    and st_num like '2020%';

        
        
