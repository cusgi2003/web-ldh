create database if not exists rollup_practice;

CREATE TABLE sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    region VARCHAR(20) NOT NULL,
    category VARCHAR(20) NOT NULL,
    product_name VARCHAR(50) NOT NULL,
    sales_amount INT NOT NULL,
    sales_date DATE NOT NULL
);

INSERT INTO sales (region, category, product_name, sales_amount, sales_date) VALUES
('서울', '전자제품', '노트북', 1200000, '2026-05-01'),
('서울', '전자제품', '마우스', 50000, '2026-05-01'),
('서울', '가구', '의자', 150000, '2026-05-02'),
('서울', '가구', '책상', 300000, '2026-05-02'),
-- --------------------------------------------------
('부산', '전자제품', '노트북', 1100000, '2026-05-01'),
('부산', '전자제품', '키보드', 80000, '2026-05-02'),
('부산', '가구', '의자', 130000, '2026-05-03'),
('부산', '가구', '책상', 280000, '2026-05-03'),
-- --------------------------------------------------
('대구', '전자제품', '마우스', 45000, '2026-05-01'),
('대구', '전자제품', '키보드', 75000, '2026-05-02'),
('대구', '가구', '의자', 120000, '2026-05-03'),
('대구', '가구', '책상', 250000, '2026-05-03');


select IFNULL(region, '전체 합계'), sum(sales_amount) from sales
group by region with rollup;


select region, category, sum(sales_amount) from sales
group by region, category with rollup;


select IFNULL(region, '전체') as '지역', IFNULL(category, '소계') as '카테고리', sum(sales_amount) as '합계'
from sales group by region, category with rollup;


select * from sales;

select region, IFNULL(category, '판매 개수 및 합계') as '카테고리', count(*), sum(sales_amount)
from sales group by region, category with rollup;


select IFNULL(CAST(sales_date AS CHAR), '전체 기간') AS sales_date, SUM(sales_amount)
from sales group by sales_date with ROLLUP;


select region, IFNULL(category, '합계') as '카테고리', sum(sales_amount) from sales
where region in ('서울', '부산')
group by region, category with rollup;


select region, sum(sales_amount) from sales
group by region 
having sum(sales_amount) >= 1000000;



-- 급여가 높은 순으로 순번 부여하기
select rank() over(order by salary desc),  emp_id, emp_name, department, salary from employee

-- 다음과 같은 형식으로 결과를 출력
-- 개발팀 - 김철수 - 1위
select department, emp_name, row_number() OVER(order by salary desc) from employee;


-- 개발팀 직원들의 급여순위
select emp_name, ROW_NUMBER() OVER(order by salary desc) from employee where department = '개발팀';



select emp_name, department, salary, rank() OVER(partition by department order by salary desc)
from employee;



CREATE TABLE board (
    board_id INT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(30),
    title VARCHAR(100),
    created_at DATETIME
);

create index idx_board_category_created
on board(category, created_at);

-- 카테고리별 최신 그릉ㄹ 자주 조회한다면
select * from board where category = '공지' order by CREATED_AT desc;

-- BOARD 테이블에서 idx_board_category_createdd 인덱스를 사용해서
-- category = '공지' 조건 데이터를 찾았고, 역순으로 읽었으며
-- 예상 비용은 0.8, 예상 결과 행 수는 3개이다.

show index from board;

select * from product;

-- 상품 검색용 인덱스 생성하기
-- product_name 컬럼에 인덱스 생성
create index idx_product_name
on product(product_name);


-- 복합 인덱스 생성하기
-- 카테고리별 가격 검색을 빠르게 하기 위해 category, price를 기준으로 인덱스를 생성하기
create index idx_product_price
on product(category, price);


-- product 테이블에 생성된 인덱스 확인
show index from product;

-- idx_product_price 삭제하기
drop index idx_product_price on product;


-- 다음 쿼리가 인덱스를 사용하는지 확인
explain 
select * from product where product_name = '노트북';


-- 1. 단일행 서브쿼리
-- 서브쿼리문의 결과가 1개의 값만 반환할 때 그 값을 이용하여 메인쿼리를 처리

-- 전체 평균 금액보다 큰 금액을 판 데이터 조회
select * from sales
where sales_amount  > (select avg(sales_amount) from sales);

-- 사원 테이블에서 박민수 사원의 급여보다 많이 받는 인사팀 직원을 조회하기
select * from employee
where department = '인사팀' and salary > (
	select salary from employee where emp_name = '박민수');

-- 전체 직원의 평균 급여보다 급여를 많이 받는 직원의 이름과 급여 조회
select emp_name, salary from employee 
where salary > (select avg(salary) from employee);


-- 전체 직원 중 가장 높은 급여를 받는 직원의 이름과 급여를 조회
select emp_name, salary from employee 
where salary = ( select max(salary) from employee);


-- 다중 행 서브쿼리
-- 서브쿼리가 여러 개의 결과를 반환

-- 개발팀 직원들 받는 급여와 같은 급여를 받는 직원 조회하기
-- in : 서브쿼리에서 조회된 값 중 일치하는 것
select emp_name, department, salary from employee 
where salary in(select salary from employee where department = '개발팀');

-- any : 여러 값들 중 하나라도 조건을 만족하면 참
-- 인사팀 직원 중 한명이라도 받는 급여보다 높은 급여를 받는 직원 조회하기

-- 6000, 4000, 4000 중 하나라도 만족하면 true
-- salary > 4000인 직원이 조회된다
select emp_name, department, salary from employee
where salary > any(select salary from employee where department = '인사팀');

-- ALL : 여러 값들 전부에 대해 조건을 만족해야 한다
-- 인사팀의 모든 직원보다 급여가 높은 직원을 조회하세요
select emp_name, department, salary from employee
where salary > all(
	select salary from employee where department = '인사팀');


-- --------------------------------------------------------------------

select * from sales;

-- sales 테이블에서 서울에서 판매된 상품명과 같은 상품을 판매한 전체 데이터를 조회
select * from sales where product_name in (select product_name  from sales where region = '서울');
-- 부산에서 판매된 카테고리와 같은 카테고리에 속한 상품을 모두 조회
select region, category from sales where category in (select category from sales where region = '부산');
-- 대구에서 판매된 전자제품과 같은 상품명을 가진 상품을 모두 조회
select * from sales where product_name in (
select product_name from sales where region = '대구' and category = '전자제품');
-- 대구에서 판매된 상품 가격 중 하나보다라도 비싼 상품을 조회
select * from sales where sales_amount >= any (
	select sales_amount from sales where region = '대구');
-- 부산의 가구 가격 중 하나보다라도 저렴한 상품을 조회
select * from sales where sales_amount < any (
	select sales_amount  from sales where region = '부산' and category  = '가구');
-- 대구에서 판매된 모든 상품보다 비싼 상품을 조회
SELECT * 
FROM sales 
WHERE sales_amount  > ALL (
    select sales_amount 
    FROM sales 
    WHERE region = '대구'
);
-- 서울에서 판매된 모든 가구보다 저렴한 상품을 조회
select * from sales where sales_amount < all ( 
	select sales_amount from sales where region = '서울' and category = '가구');


-- 다중컬럼 서브쿼리
-- 서브쿼리가 여러 컬럼을 동시에 반환하는 것

-- select 컬럼명
-- from 테이블명
-- where(컬럼1, 컬럼2) in (
-- 	select 컬럼1, 컬럼2 from 테이블명);

-- 각 부서의 최고 급여를 받는 직원 조회하기 
select department, max(salary) from employee
group by department;


select emp_name, department, salary from employee
where(department , salary) in ( 
	select department, max(salary) from employee group by department);



-- 각 부서에서 가장 낮은 급여를 받는 직원의 이름, 부서, 급여 조회하기

-- 부서별 최고 급여와 동일한 급여를 받는 직원의 이름, 부서, 급여 조회하기

-- 부서별  평균 급여 이상을 받는 직원의 이름, 부서, 급여 조회하기

-- 각 부서 최고 급여 직원의 사번, 이름, 부서 조회하기

-- 김철수와 같은 부서, 같은 급여를 받는 직원 조회하기
select * from employee where(department, salary) = (
	select department, salary from employee where emp_name = '김철수');

SELECT * 
FROM employee 
WHERE (department, salary) IN (
    SELECT department, MAX(salary) 
    FROM employee 
    GROUP BY department
);








