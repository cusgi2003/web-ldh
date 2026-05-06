## SQL 함수
- 사용자가 필요한 기능을 만드는 함수가 아닌, MySQL 자체적으로 제공하는 함수
- 상황에 맞는 적절한 함수를 사용하기 위해서는 어떤 기느을 하는 함수들이 있는지 정확히 파악해야한다.
```sql
  함수이름 (인자1, 인자2, ...)
```
- 함수 정리
``` sql
  select LENGTH('문자열') -> 문자열이 몇바이트인지 반환
  select CHAR_LENGTH('문자열') -> 문자열이 몇 글자인지 반환

  UPPER(), LOWER() -> 문자열의 대소문자 변환

  TRIM(), LTRIM(), RTRIM() -> 공백 제거하기
  select TRIM('x' from '문자열) -> x로 해당하는 문자열 지우기

  LPAD(), RPAD() -> 왼쪽/오른쪽에 문자열을 채워주는 함수
  select LPAD('abc', 10, '*') -> abc*******
  select LPAD('abcde', 4, 0 ) -> abcd

  SUBSTRING(), SUBSTR(), MID() -> 문자의 길이를 자르는 함수
  SUBSTRING('문자열', 출력할 첫번째 길이, 출력할 마지막 길이)
  select SUBSTRING('Hello MySQL', 1, 5) -> Hello

  LEFT(), RIGTH()
  문자열을 왼쪽/오른쪽에서 원하는 길이만큼 잘라서 반환하는 함수
  LEFT('Hello', 2) -> He

  INSTR('전체문자열', '찾을 문자열')  -> 찾을 문자열이시작되는 위치 번호를 반환

  CONCAT('문자열1', '문자열2', ...) -> 인자로 전달된 문자열을 하나로 이어붙이는 함수

  REPLACE('문자열', old, new) -> 문자열 안에 있는 old문자열을 new 문자열로 치환
  select REPLACE('ABCD', 'AB', 'XY') -> XYCD

  REPEAT('문자열', 2) -> 문자열을 2번 반복









```


