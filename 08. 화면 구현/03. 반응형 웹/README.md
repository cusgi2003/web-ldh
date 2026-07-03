## 반응형 웹 디자인

### 개념

- 사용자의 기기 화면 크기(PC,태블릿,모바일)에 따라 자동으로 레이아웃이 조정되는 웹 디자인 방식이다.


### 핵심 구성요소

- **유동적 레이아웃 (Fluid Grid)**
    
    → 픽셀(px) 대신 비율(%)이나 `vw`, `vh`, `em`, `rem` 같은 단위를 사용한다.
    
- **유연한 이미지 (Flexible Image)**
    
    → `max-width: 100%; height: auto;`로 이미지가 부모 요소 너비에 맞게 줄어들게 한다.
    
- **미디어 쿼리 (Media Query)**
    
    → 특정 화면 크기 이상 또는 이하에서만 스타일을 적용한다.


  ### 미디어 쿼리

- 화면의 **너비, 높이, 해상도, 방향(세로/가로)** 등에 따라 CSS를 다르게 적용하는 문법이다.
- 하나의 HTML로 다양한 기기에서 **가독성, 배치, 터치/마우스 사용성**을 최적화하기 위해서다

```jsx
@media (조건) {
  /* 이 안의 CSS는 조건이 참일 때만 적용됨 */
}
```


| 특성 | 의미 | 예시 |
| --- | --- | --- |
| `min-width` | 뷰포트 너비가 이상일 때 | `@media (min-width: 768px)` |
| `max-width` | 뷰포트 너비가 이하일 때 | `@media (max-width: 767px)` |
| `orientation` | 가로/세로 방향 | `@media (orientation: landscape)` |
| `prefers-color-scheme` | 라이트/다크 선호 | `@media (prefers-color-scheme: dark)` |
| `prefers-reduced-motion` | 애니메이션 축소 선호 | `@media (prefers-reduced-motion: reduce)` |
| `resolution` | 픽셀 밀도 | `@media (min-resolution: 2dppx)` |
| `hover`/`pointer` | 입력장치 특성 | `@media (hover: none)` |


### 컨테이너 쿼리

- 특정 요소(컨테이너)의 **크기**를 기준으로 그 **자식 요소**의 스타일을 바꾸는 CSS 기능이다
- `@media`는 **뷰포트 크기** 기준, `@container`는 **어떤 요소의 박스 크기** 기준이다

- **사용방법**

- 부모(컨테이너)에 다음 중 하나를 건다
- `container-type: inline-size`
    
    컨테이너의 **가로폭(인라인 축)**만 기준으로 쿼리한다
    
- `container-type: size`
    
    **가로+세로** 모두 기준으로 쿼리한다
    
- `container-name: <식별자>`
    
    이름을 붙여 특정 컨테이너를 지정해 쿼리할 수 있다
    
- **Shorthand**: `container: <name> / <type>`
    
    예) `container: card / inline-size`


**컨테이너 단위(CQ length units)**

- 컨테이너 기준의 “퍼센트형 길이 단위”로, **반응형 수치**를 간단히 만들 때 강력하다


| 단위 | 의미(퍼센트로 생각) | 예시 |
| --- | --- | --- |
| `cqw` | 컨테이너 **가로폭의 1%** | `width: 50cqw;` → 컨테이너 폭의 50% |
| `cqh` | 컨테이너 **세로높이의 1%** | `height: 30cqh;` |
| `cqi` | 컨테이너 **인라인 축의 1%** | LTR에서는 보통 가로폭의 1%와 같다 |
| `cqb` | 컨테이너 **블록 축의 1%** | 보통 세로높이의 1%와 같다 |
| `cqmin` | `min(cqi, cqb)` | UI가 가로나 세로로 바뀌어도 **더 작은 축** 기준 |
| `cqmax` | `max(cqi, cqb)` | **더 큰 축** 기준 |
