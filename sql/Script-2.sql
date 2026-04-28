-- actor 테이블에서 모든 배우 정보를 조회
use sakila;

select * from actor;

select first_name,last_name from actor;

-- film 테이블에서 영화제목, 대여기간 조회

select title, rental_duration from film;

-- film 테이블에서 rentala_rate가 2.99 이상인
-- 영화의 제목과 retal_rate 조회

select title, rental_rate from film where rental_rate >= 2.99;

-- film 테이블에서 영화 길이가 120분 이상인 제목과 길이
select title, length from film where length >= 120;

-- customer 테이블에서 active가 1인 고객만
select * from customer where active = 1;


-- null, not null 데이터 판별하기
-- address테이블에서 address2가 null인 주소 조회하기 
select * from address where address2 is null;

-- customer 테이블에서 성이 Smith인 고객 조회하기
select * from customer where last_name ="Smith";

-- and : 두 가지 이상의 조건을 비교

-- film 테이블에서 rental_rate >= 2.99, 영화 길이가 120 이상
select * from film where rental_rate >= 2.99 and length >= 120;


-- or
-- film 테이블에서 영화 등급이 PG 이거나 G인 영화 조회

select * from film where rating = "PG" or rating = "G";

-- film 테이블에서 영화 길이가 60분 이하이거나 180분 이상인 영화 조회
select * from film where length <= 60 or length >= 180;

-- payment 테이블에서 2020-01-01 이후 결제된 내역을 조회
select * from payment where payment_date >= '2020-01-01';
















