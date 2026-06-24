## CSS 박스 모델
**Content** : 태그 박스 안의 내용, 텍스트나 이미지

**Padding** : content 주위 영역(태그 안)

**Border** : padding과 content를 둘러싼 주위 영역(태그와 밖의 경계)

**Margin** : border와 밖(태그와 태그 밖 바깥 태그나 body 사이의 영역)

<img width="725" height="351" alt="image" src="https://github.com/user-attachments/assets/36bc00db-9ac2-4229-b0d5-2ebae71a2f34" />

## RESET CSS
- 프로젝트를 시작하면, 초기에 먼저 css를 초기화하고 시작하는 것이 좋다.

- reset.css
    - 거의 다 초기화되어 개발자 마음대로 만들 수 있고 가볍다
- normalize.css
    - 어느정도 초기화되지만 기본적인 디자인은 내장하고 있다.
    - 다른 브라우저로 보더라도 일정한 디자인을 볼 수 있도록 해주기위해서 사용한다.
    - reset.css보다는 조금 더 무겁고 최근 더 많이 사용된다.
```CSS
    <link rel="stylesheet" href="https://cdnjs...">
```
