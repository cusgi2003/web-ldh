-- 별칭(Alias)
-- 컬럼이나 테이블에 임시 이름을 붙이는 기능
-- 컬럼의 이름을 보기좋겝 ㅕㄴ경
-- 테이블 이름을 짧게 줄인다
-- 함수를 걸었을 때 너무 길어지면 별명을 줄 수 있다

-- select 컬럼명 as 별칭 from 테이블
-- from 테이블명 as 별칭

-- 사용자 화면에는 emp_name보다는 이름이라고 보여주는게 낫다.

select category, avg_amount from (
	select category, avg(sales_amount) as avg_amount
	from sales group by category
) as t; 
-- 서브쿼리로 조호된 결과는 이릉이 없기 때문에
-- 서브쿼리로 조회된 테이블에는 별칭이 필수이다


-- 부서별 평균 inline view를 활용하여 조회하기
-- 부서 컬럼 : department avg_salary
select department, avg_salary as '부서별 평균' from (
	select department, avg(salary) as avg_salary 
	from employee group by department
)as t;

-- 평균 급여가 5000 이상인 부서 출력
select * from (select department, avg(salary) as avg_salary from employee group by department)
as D where avg_salary >= 5000;

-- 각 부서 최고 급여 조회
select * from (
select department, max(salary) as max_salary from employee group by department) as d;

-- salse 테이블을 이용하여 지역별 판매 건스를 서브쿼리를 이용해서 조회하기
-- 지역 : region

select * from sales;

select * from (
	select region, count(*) as cnt from sales group by region
) as s;


-- 지역별로 최고 판매금액, 최저 판매금액, 최고와 최저 판매금액 차이 조회하기
select * from (
	select max(sales_amount), min(sales_amount), max(sales_amount) - min(sales_amount) as result
	from sales group by region
) as s;

select * from product;
-- 카테고리별 총 판매금액 조회 후 평균보다 높은 카테고리 조회

-- inline view 사용하는 이유
-- 1. 카테고리별 총 판매금액
-- 2. 그 결과들의 평균 

select * from (
	select category, sum(sales_amount) as total_price
	from sales group by category) t where total_price > (
		select avg(total_price) from (select category, sum(sales_amount) as total_price
		from sales group by category
	) as su
);



-- 상관 서브쿼리 (Correlated Subquery)
-- 서브쿼리가 바깥쪽 쿼리의 값을 참조하는 서브쿼리
-- 서브쿼리가 혼자 실행될 수 업속, 바깥쪽 쿼리의 각 행마다 반복 실행되는 구조

select * from sales where sales_amount > (
	select avg(sales_amount) from sales
);



-- 1. 전체 평균 가격을 구한다
-- 2. 각 상품 가격과 비교한다
-- 서브쿼리 1 실행 -> 메인쿼리 실행

-- 상관 서브쿼리
select * from sales s1 
where sales_amount > (
	select avg(sales_amount) from sales s2
);

-- 서브쿼리에서 바깥쪽 쿼리의 s1.region을 참조하고 이다
-- 각 행마다 자기 지역의 평균 가격을 구해서 비교하게 된다

-- 실행 방식
-- 1. 바깥쪽 쿼리에서 행을 하나 꺼낸다
-- 2. 그 행의 값을 서브쿼리에 전달한다
-- 3. 서브쿼리를 실행한다
-- 4. 결과를 비교
-- 5. 다음행으로 이동한다

select region, avg(sales_amount) from sales s
where region = '서울' group by region;


-- insert 서브쿼리

create table employee_practice(
	emp_id int primary key,
	emp_name varchar(100),
	department varchar(100),
	salary int
);

insert into employee_practice 
select * from employee where salary >= 6000;


-- update에서 사용하는 서브쿼리
-- 김철수의 부서와 같은 부서에서 일하는 사람의 급여를 10% 인상
update employee set salary = salary * 1.1
where department = (
	select department from (
		select department from employee where emp_name = '김철수'
	) t
);

select * from employee;

-- delete에서 사용하는 서브쿼리
-- 평균 급여보다 적게 받는 사람 삭제하지
delete from employee
where salary < (
	select avg_salary from (
		select avg(salary) as avg_salary from employee
	) t
);




CREATE TABLE student (
  id INT PRIMARY KEY,
  name VARCHAR(50)
);

INSERT INTO student (id, name) VALUES
(1, '철수'),
(2, '영희'),
(3, '민수');

-- 수강 테이블
CREATE TABLE enroll (
  id INT PRIMARY KEY,
  student_id INT,
  class_name VARCHAR(50),
  constraint fk_enroll_student foreign key (student_id)
  references student(id)
);

INSERT INTO enroll (id, student_id, class_name) VALUES
(1, 1, '데이터베이스'),
(2, 1, '자바'),
(3, 2, '데이터베이스');


-- inner join
-- 학생 이름, 수업명을 조회
select name, class_name from student s 
inner join enroll e on s.id = e.student_id;

-- on이 where의 역할을 한다
-- on절로 연결 기준을 알려줘야 한다

-- 값 자체가 연결 역할을 하기 때문에 fk로 설정하지 않아도 가능은 하다
-- fk로 연결하지 않으면 데이터의 무결이 보장되지 않기 때문이다
-- 잘못된 데이터가 들어와도 막을 수 없다
-- 하지만 fk로 연결하여 join하는 것을 기본으로 한다





CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(30),
    grade VARCHAR(20)
);

CREATE TABLE product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    category VARCHAR(30),
    price INT
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    product_id INT,
    quantity INT,
    order_date DATE,

    CONSTRAINT fk_orders_customer
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),

    CONSTRAINT fk_orders_product
    FOREIGN KEY (product_id) REFERENCES product(product_id)
);


-- 고객명, 상품명, 주문수량, 주문일자 조회하기
select customer_name, prodcut_name, quantity, order_date
from orders o
inner join customer c 
on o.customer_id = c.customer_id 
inner join product p on p.product_id  = o.product_id;

-- 고객별 총 금액 / group by 사용하기
select customer_name, sum(quantity * price) from orders o
inner join customer c on o.customer_id = c.customer_id
inner join product p on p.product_id = o.product_id
group by c.customer_id;

-- 총 구매 금액이 100만원 이상인 고객 조회하기
select customer_name, sum(quantity * price) as total_price from orders o
inner join customer c on o.customer_id = c.customer_id
inner join product p on p.product_id = o.product_id
group by c.customer_id
having total_price >= 1000000;

-- 카테고리별 총 매출 조회
select category, sum(quantity * price) from orders o
inner join product p on o.product_id = p.product_id
group by p.category;

-- vip 고객의 주문내역 조회하기
-- 이름, 등급, 제품명, 주문수량, 주문날짜
select customer_name, grade, product_name, quantity, order_date from orders o
inner join customer c on o.customer_id = c.customer_id
inner join product p on p.product_id = o.product_id
where grade = 'VIP';

select name, class_name from student s 
left outer join enroll e
on s.id = e.student_id;

-- 민수는 수강 내역이 없지만, 왼쪽  테이블에 있으므로 반드시 나온다
-- 대신 enroll쪽 값은 없기 때문에 null로 채워진다



-- 주문 내역이 한 번도 없는 고객의 이름을 조회 
select customer_name from customer c 
left outer join oroders o 
on o.custoer_id = c. customer_id
where order_id is null;


-- 모든 고객의 주문 건수를 조회
-- 주문이 없는 고객은 0으로 출력
select customer_name, count(order_id) from customer c
left outer join orders o 
on c.customer_id = o.customer_id
group by c.customer_id;


-- 오른쪽 테이블을 ㄱ준으로 전부 출력하는 join
select name, class_name from student s
right outer join enroll e 
on s.id = e.student_id;

-- 실무에서는 left join을 더 자주 쓰고
-- right join은 방향만 바뀐 개념이라 잘 쓰지 않는 편이다

-- full outer join
-- 양쪽 테이브르이 모든 데이터를 조회
-- 일치하면 연결하고, 일치하지 않으면 없는 쪽을 null로 표시한다
-- MySQL은 Full Outer Join을 직접 지원하지는 않는다
-- Left Join과 Right Join을 Union으로 합쳐서 구현한다


-- union : 두 가지 select 결과를 이어붙인디
-- 중복제거를 자동으로 해준다

-- union all : 중복 제거 없이 모두 출력이 된다
select name, class_name from student s 
left outer join enroll e
on s.id = e.student_id
union
select name, class_name from student s
right outer join enroll e 
on s.id = e.student_id;

CREATE TABLE color (
  name VARCHAR(20)
);

INSERT INTO color VALUES ('빨강'), ('파랑');

CREATE TABLE size (
  name VARCHAR(20)
);

INSERT INTO size VALUES ('S'), ('M'), ('L');

-- 색상과 사이즈의 모든 조합을 만들기
select c.name, e.name from color c
cross join size e;

-- 일반적인 조회에서는 많이 사용하지 않으나, 모든 조합이 필요한 경우 사용

CREATE TABLE employees (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  manager_id INT  -- 상사의 id
);

INSERT INTO employees VALUES
(1, '대표', NULL),
(2, '팀장', 1),
(3, '사원A', 2),
(4, '사원B', 2);


select e.name as employee_name, m.name as manager_name 
from employees e left outer join employees as m
on e.manager_id = m.id;

-- 모든 고객과 상품의 가능한 조합을 조회
select c.customer_id, c.customer_name, p.product_id, p.product_name from customer c 
cross join product p;

-- 모든 상품 조합 개수 조회
select count(*) from product p
cross join customer c;

-- 모든 고객과 전자제품 카테고리 상품 조합 조회
select c.customer_name, p.product_name
from customer c 
cross join product p 
where p.category ='전자제품';

-- 고객명과 추천인 이름 조회
select c.customer_name as customer, r.customer_name as recommender from customer c 
inner join customer r on c.recommender_id = r.customer_id;

-- 추천인이 없는 고객 조회
select * from customer where recommender_id is null;

select concat(c.customer_name, '의_추천인은_', r.customer_name) as relation_info
from customer c
inner join customer r
on c.recommender_id = r.customer_id;

-- 가장 많은 고객을 추천한 사람순으로 조회
select r.customer_name as 추천인, count(*) as '추천 횟수'
from customer c 
inner join customer r
on  c.recommender_id = r.customer_id
group by r.customer_name;


-- 고객 테이블과 주소 테이블을 이용하여
-- 고객의 이름, 성. 주소를 조회하기

select c.first_name, c.last_name, a.address from customer c 
inner join address a cross 
on c.address_id = a.address_id;


create view customer_address_view as
select c.first_name, c.last_name, a.address from customer c 
inner join address a cross 
on c.address_id = a.address_id;

-- 복잡한 select를 테이블처럼 사용할 수 있다
select * from customer_address_view;

-- 영화번호(film), 영화 제목(film), 카테고리(film_category), 대여료(film) select문 만들기
-- film_category_view 이름의 view
create view film_category_view as 
select f.film_id, f.title, c.category_id, f.rating from film_category fc
inner join film f on fc.film_id = f.film_id
inner join category c on fc.category_id = c.category_id;

select * from film_category_view;

-- 고객별 영화 대여 횟수를 customer_rental_count_view로 만들기
CREATE VIEW customer_rental_count_view AS
SELECT
    c.customer_id,
    c.first_name,
    c.last_name,
    COUNT(r.rental_id) AS rental_count
FROM
    customer c
INNER JOIN
    rental r ON c.customer_id = r.customer_id
GROUP BY
    c.customer_id, c.first_name, c.last_name;

-- 30번 이상 빌려본 고객의 정보를 조회
select * from customer_rental_count_view where rental_count >= 30;


-- view를 사용하면 좋은 경우
-- 1. 복잡한 join과 조건이 반복될 때
-- 2. 비즈니스 규칙을 숨겨둘 때
-- 3. 보안, 권한 제어용으로 사용한다





