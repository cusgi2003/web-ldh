## 마진(Margin)

### 💡 개념

- Margin(마진)은 요소 **밖의 공간**으로, 인접한 요소와의 간격을 조절하는 역할을 한다.
- 즉, 다른 박스와의 ‘거리’를 만들어주는 바깥 여백이다.

### 속성과 값

- `margin`: 네 방향의 여백을 한 번에 지정 (예: `margin: 10px;`, `margin: 10px 20px;`)
    - 1개 값: 전체 방향 동일
    - 2개 값: 위/아래, 좌/우
    - 3개 값: 위, 좌우, 아래
    - 4개 값: 위, 오른쪽, 아래, 왼쪽
 

## 패딩(Padding)

### 💡 개념

- *Padding(패딩)**은 요소 **안쪽 여백**으로, 콘텐츠와 테두리(border) 사이의 공간이다.
- 즉, 글자나 이미지가 테두리에 너무 붙지 않도록 안쪽에서 여백을 준다.

- `padding`: 네 방향의 여백을 한 번에 지정 (예: `padding: 10px;`, `padding: 10px 20px;`)
    - 1개 값: 전체 동일
    - 2개 값: 위/아래, 좌/우
    - 3개 값: 위, 좌우, 아래
    - 4개 값: 위, 오른쪽, 아래, 왼쪽

## Display
- `padding`: 네 방향의 여백을 한 번에 지정 (예: `padding: 10px;`, `padding: 10px 20px;`)
    - 1개 값: 전체 동일
    - 2개 값: 위/아래, 좌/우
    - 3개 값: 위, 좌우, 아래
    - 4개 값: 위, 오른쪽, 아래, 왼쪽
- `display: flex;` → 부모를 flex 컨테이너로 만든다.(부모요소의 범위를 잘 봐야함)
- `justify-content: center;` → 가로 중앙 정렬.
- `align-items: center;` → 세로 중앙 정렬.


## 컨테이너(Container)

### 💡 개념

- `container`는 화면 안에서 콘텐츠를 담는 **박스(그릇)** 역할을 하는 영역을 말한다.
- 전체 화면을 100% 다 쓰지 않고, 가운데 깔끔하게 정리된 영역을 만들기 위해 사용한다.
- 보통 `<div class="container"> ... </div>`처럼 `class="container"` 형태로 많이 쓴다.
- 사이트 전체 너비를 관리하고, 가운데 정렬 및 내부 여백을 관리한다.

- `max-width`
    - 컨테이너가 너무 커지지 않도록 **최대 너비**를 정해둔다
    - 예: `1200px`, `768px`, `600px` 등
    - 최신 웹에서는 **보통 1280px 전후**를 많이 쓴다
- `width: 100%`
    - 화면이 좁을 때(모바일)에는 가능한 만큼 꽉 차게 채운다
    - `max-width`와 세트로 자주 나온다
    - “1200px보다 작으면 100%로 줄어들어라”라는 의미다
- `margin: 0 auto`
    - 가로 가운데 정렬하는 핵심 공식이다
    - 블록 요소의 **가로 여백을 자동 계산해서 양쪽 여백을 똑같이 만들어준다**
    - 이 패턴은 진짜 무조건 외워야 한다
- `padding`
    - 안쪽 여백이다
    - 폰 화면처럼 좁은 화면에서는 글자나 버튼이 화면 끝에 딱 붙어 있으면 답답해서 보기 싫다
    - 컨테이너에 `padding: 16px`만 줘도 “앱처럼 정리된 화면” 느낌이 난다
    - 모바일 UI처럼 부드러운 느낌을 내는 데 아주 중요한 부분이다
 

## 그리드 형태 정의

`grid-template-columns`

- 열의 개수와 크기를 정한다.
- 각 열의 너비(고정, 비율, 자동 등)를 지정하고, 반복 패턴이나 최소/최대 크기 규칙도 만들 수 있다
```jsx
    grid-template-columns: 1열크기 2열크기 ...;
    /* grid-template-columns: [선이름] 1열크기 [선이름] 2열크기 [선이름] ...; */
```
- 크기 에는 px, %, fr(비율),auto, min-content, max-content, minmax(), repeat() 등 여러 값이 올 수 있다

`grid-template-rows`

- 행(세로 방향) 개수와 크기를 정의한다.

```jsx
grid-template-rows: 1행크기 2행크기 ...;
/* grid-template-rows: [선이름] 1행크기 [선이름] 2행크기 [선이름] ...; */
```

`repeat()` 함수
- 두번째 인수를 몇번 만큼 반복한다.
`minmax()` 함수
- 최솟값과 최댓값을 지정할 수 있는 함수이다.
`auto-fill` / `auto-out` 
- column의 개수를 미리 정하지 않고 설정된 너비가 허용하는 한 최대한 셀을 채운다.

`grid-template-areas`

- 지정된 그리드 영역 이름을 참조해 그리드 템플릿을 생성한다.
- .(마침표)를 사용하거나 명시적으로 none을 입력해 빈 영역을 정의할 수 있다.


`grid-template`

- `grid-template-rows` , `grid-template-columns` , `grid-template-areas` 의 단축 속성
  ```jsx
  /* grid-template 단축 속성 */
    grid-template:
      "header header header" 80px /*첫 번재 행의 이름은 header, 높이는 80px*/
      "main main aside" 350px /*두 번재 행의 이름은 main 및 aside, 높이는 350px*/
      "footer footer footer" 130px /*세 번재 행의 이름은 footer, 높이는 130px*/
      / 2fr 100px 1fr; /* 3개의 column, 비율은 왼쪽부터 2 : 100px : 1*/

    gap: 10px;
    height: 100vh;
    padding: 16px;
  }
  ```

### 그리드 간격 정의

`row-gap` / `column-gap`

- 아이템 사이의 간격을 설정한다.


