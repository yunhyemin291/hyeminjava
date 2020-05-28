-- 등록된 학생들의 학번과 이름이 출력(검색)되도록 SQL문을 작성하세요.
select st_num, st_name
from university.student;
-- 등록된 학생들 중에서 학번이 2020110011인 학생의 모든 정보를 출력하는
-- SQL문을 작성하세요.(테이블에 2020110011 학생이 없어도 상관없음) 
select * from student where st_num = 2020110011;
-- 등록된 학생들 중에서 학번이 2020110011이 아닌 학생의 모든 정보를 출력하는
-- SQL문을 작성하세요.(테이블에 2020110011 학생이 없어도 상관없음) 
select * from student where st_num != 2020110011;
select * from student where st_num <> 2020110011;
-- 2019 학번 학생을 등록하는 SQL문을 작성하세요. 학번,이름,주민번호,분류는 임의로 입력
insert into student(st_num,st_name,st_identification_num,st_type)
	values (2019110011,'이순신','000101-3312345','학사');
SELECT * FROM university.student;
-- 2020학번 학생들만 출력되도록 SQL문을 작성하세요.
select * from student where st_num >= 2020000000;
