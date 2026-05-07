-- 숫자 함수

-- ABS()
-- 절대값 구하기
select ABS(-10), ABS(10), ABS(0);

-- ROUND(숫자, 자릿수)
-- 반올림
select ROUND(1234.567, 2), ROUND(1234.567, 0), ROUND(1234.567),
	ROUND(1234.567, -1), ROUND(1234.567, -2);

-- FLOOR()
-- 주어진 숫자보다 작거나 같은 정수 중 최대값을 반환
-- 내림이라 생각해도 ok
select FLOOR(2.1), FLOOR(-2.1);

-- TRUNCATE()
-- 버림
select TRUNCATE(3.141592, 2);

-- CEIL()
-- 주어진 숫자보다 크거나 같은 정수 중 최소값
-- 올림
select CEIL(2), CEIL(2.1), CEIL(-2.1);

-- SIGN()
-- 인자로 전달된 숫자가 양수 -> 1
-- 음수면 -> -1
-- 0이면 -> 0
-- NULL -> NULL
select SIGN(-238), SIGN(0), SIGN(359);

-- MOD()
-- 나누기 했을 때 나머지를 구한다
select MOD(1, 3), MOD(2,3), MOD(3,3);

-- POWER(밑값, 지수)
select POWER(2,1), POWER(2,2), POWER(2,3), POWER(2,0);

-- RAND()
-- 0이상 1미만의 난수를 반환
select RAND();

-- GREATEST() / LEAST()
-- 최대값, 최소값 반환
select GREATEST(10,20,5), LEAST(10,20,5);

CREATE TABLE sales (
  id INT PRIMARY KEY,
  product VARCHAR(50),
  price DECIMAL(10,2),
  quantity INT,
  discount_rate DECIMAL(5,2)  -- 할인율(예: 0.15 → 15%)
);

INSERT INTO sales VALUES
(1, 'Keyboard', 29900, 2, 0.10),
(2, 'Mouse',    15900, 3, 0.05),
(3, 'Monitor',  199000, 1, 0.20),
(4, 'USB',       8900, 10, 0.00),
(5, 'Speaker',  45500, 4, 0.15);

select * from sales;

-- 각 상품의 제품명과 가격을 3으로 나눈 나머지 조회
select product, MOD(price,3) from sales;
-- 모든 내용을 조회하되, 할인율을 %로 표시할 수 있도록 수정
select id, product, price, quantity, ABS(discount_rate)*100 from sales;

-- 아이디, 제품명, 가격, 재고, 총 가격 (소수점 아래 버림)을 조회
select id, product, price, quantity, 
TRUNCATE(price*quantity*(1-discount_rate),0) as sumPrice
from sales;

-- 1 ~ 100 사이의 난수 생성
select RAND()*100;

-- 상품 가격이 50000보다 크면 1, 작으면 -1, 같으면 0이 되도록
-- 상품 이름과 함께 조회
select product, SIGN(price - 50000) from sales;


-- FORMAT(숫자, 소수점 자리수)
-- 숫자를 사람이 보기 좋게 "문자열 형태로 포맷팅"하는 함수
-- 특히 천 단위 콤마(,) + 소수점 자리수 지정을 자동으로 해준다

select FORMAT(1234567, 0), FORMAT(1234567, 2);

select id, product, FORMAT(price, 0) from sales;

-- 날짜 함수
-- 날짜/시간 데이터를 조회, 계산, 추출, 변환, 포맷팅을 할 때 사용
-- NOW()
-- 현재 날짜와 시간을 반환한다
select NOW();

-- CURDATE() / CURRENT_DATE()
-- 현재 날짜만 반환
select CURDATE();

-- YEAR(날짜)
-- 연도만 추출한다
select YEAR('2026-04-30');

-- MONTH(날짜)
-- 월만 추출
select MONTH('2026-04-30');

-- DAY(날짜)
-- 일자만 추출
select DAY('2026-04-30');

-- HOUR(), MINUTE(), SECOND()
select HOUR('2026-04-30 15:20:10'), 
	MINUTE('2026-04-30 15:20:10'), 
	SECOND('2026-04-30 15:20:10');


-- DATETIME 포맷 : YYYY-MM-DD HH:MM:SS

-- DAYOFWEEK()
-- 요일을 숫자로 반환한다
select DAYOFWEEK('2026-04-30');
-- 1 : 일요일, 2 : 월요일, 3: 화요일, ..., 7 : 토요일

-- WEEKDAY()
-- 요일을 숫자로 반환
-- 0 : 월요일, 1 : 화요일, ... , 6 : 일요일

-- DAYNAME()
-- 요일 이름을 반환
select DAYNAME('2026-04-30');

-- LAST_DAY(DATE)
-- 월의 마지막 날 구하기
select '2026-05-01', LAST_DAY('2026-05-01');

-- DATE_ADD(날짜, INTERVAL 단위)
-- INTERVAL 단위 : 얼마만큼 단위로 더할 것인가
select DATE_ADD(NOW(), interval 10 day);

select NOW(), 
	DATE_ADD(NOW(), interval 10 day),
	DATE_ADD(NOW(), interval 3 month ),
	DATE_ADD(NOW(), interval 2 hour);

-- DATE_SUB(날짜, interval 단위)
-- 얼마만큼 단위로 뺄 것인가
select NOW(), 
	DATE_SUB(NOW(), interval 10 day),
	DATE_SUB(NOW(), interval 3 month ),
	DATE_SUB(NOW(), interval 2 hour);


-- 날짜 간의 차이를 계산
-- DATEDIFF()
-- 두 날짜 사이의 차이를 "일수"로 계산한다.
select DATEDIFF('2026-05-10', '2026-04-30');

-- 날짜 포맷 변경
-- DATE_FORMAT()
-- 날짜를 원하는 문자형태로 변경한다

-- 자주 쓰는 포맷 기호
-- %Y : 4자리 년도
-- %y : 2자리 년도
-- %m : 2자리 월
-- %c : 1~2자리 월
-- %d : 2자리 일
-- %e : 1~2자리 일
-- %H : 24시간제 시
-- %h : 12시간제 시 03
-- %i : 분
-- %s : 초
-- %w : 요일명
-- %a : 짧은 요일

select DATE_FORMAT('2026-04-30 15:20:00', '%Y년 %Y월 %D일 %H시 %h분');

-- MAKEDATE(연도, 일수)
select MAKEDATE(2026, 32);

CREATE TABLE orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer VARCHAR(50),
    order_date DATE,
    ship_date DATE,
    price INT
   );

INSERT INTO orders (customer, order_date, ship_date, price) VALUES
('홍길동', '2025-01-02', '2025-01-05', 30000),
('이몽룡', '2025-01-10', '2025-01-12', 45000),
('성춘향', '2024-12-28', '2025-01-03', 52000),
('김철수', '2025-02-01', '2025-02-03', 15000),
('박영희', '2025-02-10', NULL, 22000);
-- 주문테이블에서 고객의 이름과, 년, 월, 일을 조회
select * from orders;

select customer, YEAR(order_date), MONTH(order_date), DAY(order_date) from orders;

-- 배송까지 걸린 일수를 이름과 함께 초회
select customer, DATEDIFF(ship_date, order_date) from orders where ship_date is not null;

-- 2025 1월에 주문된 주문만 조회하기
select customer, order_date from orders where YEAR(order_date) = 2025 and MONTH(order_date) = 1;

-- 주문날짜를 기준으로 2024년 전에 주문된 기록만 조회하기
select customer, order_date from orders where YEAR(order_date) = (YEAR(NOW()) -1)

DROP TABLE IF EXISTS EMPLOYEES;

CREATE TABLE EMPLOYEES (
    EMPLOYEE_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    EMAIL VARCHAR(100),
    HIRE_DATE DATE,
    JOB_ID VARCHAR(20),
    SALARY INT,
    COMMISSION_PCT DECIMAL(3,2),
    MANAGER_ID INT,
    DEPARTMENT_ID INT
);

select * from employees;

-- 부서번호가 50번인 사원들의 이름을 출력하되, 이름 중 'el' 을
-- 모두 '**'로 마스킹 처리하여 출력
select replace(first_name, 'el', '**') from employees;
-- 이름이 6글자 이상인 사원의 사번과 이름, 급여를 조회하기
select employee_id, first_name, salary from employees where CHAR_LENGTH(first_name) >= 6;
-- 사원테이블에서 이름과 사원번호를 출력하되, 사원번호는 짝수면 0, 홀수면 1로 출력하세요
select first_name, MOD(employee_id, 2) from employees;
-- 사원번호가 짝수인 사람들의 사원번호와 이름 조회하기
select employee_id, first_name from employees where MOD(employee_id, 2) = 0;

-- 사원테이블에서 이름, 급여, 1000당 ■로 개수를 채워 조회하기
select first_name, REPEAT('■',ROUND(salary/1000)) from employees;

-- 사원 테이블에서 이름, 입사날짜, 6개월 뒤 입사날짜 순으로 조회하기
select FIRST_name, hire_date, DATE_ADD(hire_date, interval 6 month)_ from employees;

CREATE TABLE score (
  id INT,
  name VARCHAR(30),
  subject VARCHAR(20),
  point INT
);

INSERT INTO score VALUES
(1, '홍길동', '국어', 85),
(2, '김철수', '영어', 90),
(3, '이영희', '수학', 78),
(4, '박민수', '영어', 92),
(5, '최다혜', '국어', NULL);

-- COUNT()
-- 값의 개수를 반환하는 함수
select COUNT(POINT) from score; -- 점수가 NULL이 아닌 개수
select COUNT(NAME) from score;

select COUNT(*) from score; -- NULL을 포함한 모든 행의 개수

-- SUM()
-- NULL은 제외한 총합을 구한다
select SUM(point) from score;

-- AVG()
--  NULL을 제외하고 평균을 계산한다
select AVG(point) from score;

-- MAX()
select MAX(point) from score;

-- MIN()
select MIN(point) from score; 






-- 사원테이블에서 직종이 'IT_PROG'인 사람들의
-- 평균 급여, 급여 최고액, 급여 최저액, 급여의 총 합계
select AVG(salary), MAX(salary), MIN(salary), SUM(salary) 
from employees where JOB_ID = 'IT_PROG';

-- 사원테이블에서 100번째 부서의ㅣ 사원들의 급여의 평균을 출력하되,
-- 소수점 한자리까지만 출력

select FORMAT(AVG(salary),1) from employees where employee_id = 100;

-- 급여가 5000 이상인 사원들의 평균급여 구하기
select avg(salary) from employees where salary >= 5000;
-- 2005년에 입사한 사원들의 수 구하기
select count(hire_date) from employees where YEAR(hire_date) = 2005;

-- 일반적으로 집계함수와 일반 속성은 SELECT 절에서
-- 같이 조회가 불가능하다
select * from employees;

select JOB_ID, count(*) from employees
group by JOB_ID;

-- group by로 묶은 속성은 SELECT에서 집계함수와 함께 사용할 수 있다


-- 사원테이블에서 각 직종별 급여의 합 구하기
select job_id, SUM(salary) from employees group by job_id;

-- 부서별로 가장 높은 급여 조회하기
select job_id, MAX(salary) from employees group by job_id;

-- 그룹별로 구분을 할 때 기준이 꼭 하나일 필요는 없다
select department_id, job_id, COUNT(*)
from employees
group by department_id, job_id;


-- 사원테이블에서 입사년도별 사원수를 조회
-- 년도 이름순으로 조히하기

select year(hire_date), count(*) from employees 
group by YEAR(hire_date), first_name;


-- 이름에 'a'가 포함된 사원들만 대상으로,
-- 이름 길이별 사원수 구하기
select CHAR_LENGTH(first_name), count(*) from employees
where FIRST_NAME like  '%a%'
group by CHAR_LENGTH(first_name);

-- 입사일 기준으로 요일변 사원 수 구하기

select count(*) from employees
group by DAY(hire_date);

select department_id, max(salary) - min(salary) from employees 
group by DEPARTMENT_ID;





































