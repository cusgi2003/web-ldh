CREATE DATABASE IF NOT EXISTS academy_db
CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;

# 한줄 주석
-- 한줄 주석

/*
 * 범위 주석
 */


# TB_MEMBER라는 이름의 테이블 만들기
# 속성
-- 문자열 : 이름 (길이 50)
-- 정수 : 나이
-- 제약조건은 없음

#테이블을 생성하는 SQL이기 때문에 다시 실행하면 이미 만들어져있다고 에러가 발생
create table if not exists TBL_MEMBER( 
	name VARCHAR(50),
	age int
);

# SQL은 스크립트 전체가 실행되지 않는다
# 구문별로 실행이 된다

# 테이블명 TBL_CAR
# 속성
# 정수 : id
# 문자열 : brand(길이 100)
# 문자열 : color(길이 100)
# 정수 : price
# id속성에 기본키 제약조건 추가
create table if not  exists TBL_CAR (
	id int,
	brand VARCHAR(100),
	color VARCHAR(100),
	price int,
	constraint car_pk primary key(id)
);

drop table tbl_car ;

# 테이블이 존재할 때만 삭제하는 방식
# drop table if exists 테이블명;

# 테이블 안의 데이터도 전부 삭제된다
# 외래키(FK)로 연결된 테이블이 있을 경우 삭제가 안될 수 있다.

create table if not  exists TBL_CAR (
	id int primary key,
	brand VARCHAR(100),
	color VARCHAR(100),
	price int
);


# 속성 옆 제약조건과 
# constraint를 쓰는 제약 조건의 차이


# 속성옆에 작성하는 방법(inline 방식)
# ㄴ 간단하고 직관적이다

# CONSTRAINT로 제약조건 작성(table-lever 방식)
# 이름 지정 여부
# Constraint car_pk primary key(id);

# inline 방식은 이름이 나중에 자동생성 -> 나중에 수정/삭제 가 어렵다

# 여러 컬럼 제약조건 가능 여부
# inline 방식은 단일컬럼에만 가능
# CONSTRAINT PK_ORDER PRIMARY KEY(USER_ID, PRODUCT_ID);

# 가독성과 구조
# INLINE 방식
# 간단, 빠르게 작성, 소규모 테이블에 적합하다

# CONSTRAINT 방식
# 구조가 명확
# 제약조건을 한 곳에서 관리 가능
# 실무에서 더 많이 쓰게 됨


create table EXAMPLE2 (
	COL1 varchar(10) not null,
	COL2 varchar(10),
	CREATE_DATE datetime default CURRENT_TIMESTAMP
);

# 수정하기
# ALTER TABLE 테이블명 ...

# 컬럼 추가하기
# ADD COLUMN 컬럼명 데이터타입;
alter table EXAMPLE2 add column COL3 VARCHAR(50);


# 컬럼 삭제하기
# DROP COLUMN 컬럼명;
alter table example2 drop column col2;

# 컬럼명 변경하기
# RENAME COLUMN 컬럼명 To 바꿀 컬럼명;
alter table example2 rename column col1 to first_col;

# 컬럼의 타입 변경하기
# modify column 컬럼명 타입;
alter table example2 modify column col3 int;

# 제약조건 추가하기
# ADD 제약조건 종류 (대상컬럼);
alter table example2 add primary key (first_col);

# 제약조건 삭제하기
# DROP 제약조건 종류;
alter table example2 drop primary key;

# show index from 테이블
# 제약 조건에 부여된 이름 찾기 key_name 부분이 부여되 ㄴ이름임
show index from TBL_CAR;

# STUDENT 테이블 만들기
# 속성
# ID : 정수, 기본키
# NAME : 문자열(50), not null
# AGE : 정수
# EMAIL : 문자열(100)

create table STUDENT (
	ID int primary key,
	NAME VARCHAR(50) not null,
	AGE int,
	EMAIL VARCHAR(100)
);

# 다음의 컬럼을 테이블에 추가하세요  

# PHONE : 문자열(20)
alter table STUDENT add column PHONE VARCHAR(20);
# AGE컬럼 타입 -> TINYINT로 수정
alter table STUDENT modify AGE tinyint;
# NAME 컬럼 -> STUDENT_NAME
alter table STUDENT rename column NAME to STUDENT_NAME;
# PHONE 컬럼 삭제
alter table student drop column PHONE;
# EMAIL 컬럼 -> not null 변경
alter table student modify EMAIl VARCHAR(100) not null;


# 여러 컬럼을 한번에 추가하기
alter table student 
add ADDRESS VARCHAR(100), add GRADE int;


# GRADE 컬럼의 기본값을 1로 설정하기
alter table student modify column GRADE int default 1;

# ADD로 추가하기
# PK, UNIQUE, CHECK

# MODIFY로 수정하기
# NOT NULL, DEFAULT

create table TBL_ANIMAL (
	ID int primary key,
	type varchar(100),
	AGE int,
	FEED varchar(100)
);

# default와 check 제약조건 사용해보기

create table tbl_student(
	id int primary key,
	name varchar(100),
	major varchar(100),
	gender char(1) not null default 'W',
	birth date,
	constraint ban_char check(gender in ("M", "W")),
	constraint ban_date check(birth >= "1980-01-01")
);

# default : 컬럼에 값이 아예 주어지지 않았을 때 자동으로 들어가는 기본값을 정하는 규칙
# not null : 컬럼에 null 값 자체를 허용하지 않겠다

# 같이 사용하면 값 생략시 'W'가 들어가게 되고, 누군가 null을
# 넣으려고 하면 DB가 거부한다.

# not null이 없고 default만 있을 떄 누군가 gender 자리에
# null라고 넣으면 데이터가 null이라고 들어간다

# gender에 들어갈 수 있는 것은 M과 W만 들어가면 좋겠어
# null이 들어가면 무결성이 깨진다.







