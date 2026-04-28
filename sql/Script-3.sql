-- film 테이블에서 길이가 60분 이상 90분 이하인 영화 조회
select * from film where length not between 60 and 90;

-- film 테이블에서 등급이 G 또는 PG 또는 PG-13인 영회의 제목과 길이, 등급 조회
select title, length, rating from film 
where rating in('P', 'PG', 'PG-13');

-- actor테이블에서 이름이 A로 시작하는 배우의 이름 조회하기
select * from actor where first_name like 'A%';

-- filme 테이블에서 제목에 LOVE가 포함된 영화 제목 조회
select * from film where title like '%LOVE%';

-- actor테이블에서 이름이 A로 시작하고 총 3글자인 배우의 이름을 조회
select first_name, last_name from actor 
where first_name like 'A__';

-- 배우테이블에서 이름의 두번째 글자가 A인 배우를 조회하기

select first_name, last_name from actor
where first_name like '_A%';

-- 배우테이블에서 이름이 정확히 4글자인 배우의 이름 조회하기
select first_name from actor
where first_name like '____';

-- not like
-- 패턴이 일치하지 않는 데이터를 조회할 때
select title from film where title not like 'A%';


-- customere 테이블에서 이메일이 .org로 끝나는 고객을 조회
select email from customer where email like '%.org';

-- film 테이블에서 제목에 dinosaur가 포함되지 않은 영화 제목 조회
select title from film where title not like '%dinosaur%';

create table fruit (
	id int primary key,
	name varchar(30),
	price int
);

insert into fruit(id, name,price) 
values (1, '사과', 3000), (2, '바나나', 2000), (3, '포도', 5000);

select * from fruit;

insert into fruit(id, name, price)
values (4, '복숭아', 6000);

-- select된 결과를 추가하는 방법
insert into  fruit_backup(id, name)
	select id, name from fruit
	where price <= 3000; 

select * from fruit where price <= 3000;

-- 일부 컬럼만 추가하기
-- 컬럼이 not null이면 무조건 작성
insert into fruit(id) values (5);

-- 컬럼명을 생략하는 insert
insert into fruit values(6, '키위', 4000); 

-- null값 넣기

insert into fruit values(7, '키위', null);

-- defaul값 사용하기
insert into tbl_student(id, name, major, birth) 
values (1, '홍길동', '컴퓨터공학', '2020-01-01');

insert into tbl_student(id, name, major, gender, birth) 
values (2, '이영희', '산업디자인', 'w', '2020-01-01');

insert into tbl_student(id, name, major, gender, birth) 
values (3, '김철수', '화학공학', 'm', '1980-01-02');

select * from tbl_student; 

select * from flower;

insert into flower 
values ('장미', '빨간색', 3000), ('해바라기', '노란색', 6000), ('튤립', '보라색', 5000),
('안개', '흰색', 2000); 

select * from pot;

insert into pot (product_number, pot_color, shape, f_name)
values ('20206001', '흰색', '타원형', '장미'), ('2026002', '검은색', '네모', '해바라기'),
('2026003', '보라색', '타원형', '튤립'), ('2026004', '흰색', '타원형', '안개'); 

-- tbl_student 홍길동의 이름을 김길동으로 바꾸기
update tbl_student ts set name = '김길동'
where id = 1; 

-- default값으면 바꾸기

update tbl_student ts set gender = default where id = 3;


create table flower_backup as select * from flower;
-- 여러 조건으로 update하기
-- and를 사용하여 조건을 모두 만족하는 행만 수정하기
-- 꽃 테이블에서 색깔이 보라색이고, 가격이 5000원 이상인 꽃 이름을 진달래로 바꾸기
update flower_backup fb  set f_name = '진달래' where color ='보라색' and price >= 5000;

create table actor_practice as 
select actor_id, first_name, last_name, last_update from sakila.actor;

select * from actor_practice;

-- 배우 번호가 1인 배우의 이름을 'JAMES'로 수정하기
update actor_practice set first_name = 'JAMEES' where actor_id = 1;

-- 배우 번호가 2인 배우의 이름을 'MINA' 성을 'LEE'로 수정하기
update actor_practice set first_name  = 'LEE', last_name = 'MINA'
where actor_id = 2;

-- 배우 테이블에서 이름이 A로 시작하는 배우의 성을  'TEST'로 바꾸기
update actor_practice ap set first_name = 'TEST' where first_name like '%A';
select * from actor_practice ap where first_name = 'TEST';

create table film_practice as
select * from sakila.film;

select * from film_practice fp;

-- 영화 번호가 1번인 대여 가격(rental_rate)을 4.99로 수정하기
update film_practice fp set rental_rate = 4.99 where film_id = 1;

-- 영화 테이블에서 등급이 'R', 또는 'NC-17'인 영화의 대여기간을 3으로 수정
update film_practice fp set rental_duration = 3
where rating in('R', 'NC-17');

-- 영화 번호가 1인 영화에 대해 대여기간을 1증가 시키기
select title, rental_duration from film_practice where film_id = 1;

update film_practice set rental_duration = rental_duration + 1 where film_id = 1; 

-- 영화 테이블의 대여로를 10% 인상하기
update film_practice set rental_rate = rental_rate * 1.10;
select rental_rate from film_practice;


-- 배우테이블에서 id가 1인 배우 삭제하기
delete from actor_practice  where actor_id = 1;

-- 여러 행을 삭제
-- 이름이 JOHN인 배우 모두 삭제하기
delete from actor_practice where first_name = 'JOHN';

-- like를 이용한 삭제
-- 이름이 A로 시작하는 배우 삭제
delete from actor_practice where first_name like 'A%';

delete from actor_practice;
select * from actor_practice;

-- flower 테이블의 장미 삭제하기 

-- 외래키 컬럼이 데이터를 참조하고 있으면 참조당하는 쪽의 데이터를 먼저 삭제할 수 없다
-- 외래키를 설정할 때 on delete CASCADE 설정을 주게 되면
-- 같이 삭제된다
delete from flower where f_name = '장미';

-- pot 테이블에서 장미꽃을 담고있는 화분 데이터 삭제하기
delete from pot where f_name = '장미';

create table PRODUCT (
 no int primary key,
 name varchar(100),
 price int,
 p_date DATETIME
);

insert into PRODUCT(no, name, price, p_date)
values (1000, '컴퓨터', 100, '2021-04-15'), (1002, '냉장고', 200, '2021-03-29'),
(1003, '에어컨', 300, '2020-12-15'), (1004, '오디오', 20, '2020-12-15'),
(1001, '세탁기', 60, '2021-04-15');

update PRODUCT set price = price + 20 where no = 1000;
delete from PRODUCT where name = '세탁기';
select name, price from PRODUCT;


-- 사용자 생성하기
create user 'student_user'@'localhost'
identified by '1234';

-- 사용자 확인하기
-- MySQL 사용자는 mysql.user 테이블에서 확인할 수 있다
select user, host from mysql.user;

-- GRANT 
-- 사용자에게 권한을 주는 명령어
-- GRANT 권한 ON 데이터베이스명.테이블명 TO '사용자명'@'접속위치';

-- sakila 데이터베이스의 actor 테이블을 조회할 수 있는 권한 주기
grant select on sakila.actor to 'student_user'@'localhost'; 
-- sakila 데이터베이스의 다른 테이블에도 접근할 수 있다
grant select on sakila.* to 'student_user'@'localhost';


-- 모든 권한 부여하기
grant all privileges
on sakila.* to 'student_user'@'localhost';

-- 권한 확인하기
SHOW GRANTS FOR 'student_user'@'localhost';

-- revoke 
-- 사용자에게 부여한 권한을 회수하는 명령어
-- REVOKE 권한 ON 데이터베이스명 from '사용자명'@'접속 위치'

revoke select on sakila.actor form 'student_user'@'locahkost';


-- 자주 쓰이는 권한의 종류
-- select, insert, update, delete : 데이터 관련
-- create, drop, alter : 테이블 관련
-- index : 인덱스 생성/삭제 관련
-- references : 외래키 관련 권한
-- all privileges : 모든 권한


create user 'test_user'@'localhost'
identified by '1234';

grant select, insert on sakila.film  to 'test_user'@'localhost';

show grants for 'test_user'@'localhost';

revoke select on sakila.film from 'test_user'@'localhost';

drop user 'test_user'@'localhost';

-- 영화 가격 수정하기 
select title, rental_rate from film_practice;

start transaction;

update film_practice set rental_rate = rental_rate +1
where film_id = 1;

select film_id, rental_rate from film_practice;

-- COMMIT을 해서 확정을 한다
-- ROLLBACK을 통해서 되돌린다
rollback;

commit;		-- commit을 하면 확정되기 때문에 rollback을 해도 반영이 안됨



















