### 집계함수
select -> from -> where -> group by -> having  
```
  where -> 묶기 전에 필터링
  having -> 묶은 후에 필터링

  group by를 사용하면 데이터가 다음과 같이 바뀐다.
  여러 행 -> 그룹으로 묶임 -> 집계 값이 생성

  많이 하는 실수
    where 절에 그룹함수 조건 걸기
    group by 안한 속성을 select에 사용
    having 대신 where 사용
 
```

#### ROLLUP
- group by가 그룹별로 집계를 해준다면, ROLLUP은 소계와 총계까지 한 번에 만드는 기능
``` sql
  group by 컬럼명 with ROLLUP

  예시)
    select CATEGORY, SUM(AMOUNT) from SALES
    group by CATEGORY with ROLLUP;
```
  
