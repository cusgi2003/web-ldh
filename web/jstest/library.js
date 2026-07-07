// HTML 요소 가져오기
const keyword = document.getElementById("keyword");
const searchBtn = document.getElementById("searchBtn");
const message = document.getElementById("message");
const booklist = document.getElementById("booklist"); // HTML의 id="booklist"와 일치

// 정규식: 한글, 영어, 숫자, 공백만 허용
const validRegex = /^[a-zA-Z0-9가-힣\s]+$/;

// 유효성 검사 함수
function checkForm() {
    const value = keyword.value.trim();

    // 1. 빈 값 검사
    if (value === "") {
        message.textContent = "검색어를 입력하세요";
        return false;
    }

    // 2. 길이 검사 (2자 이상)
    if (value.length < 2) {
        message.textContent = "검색어는 2자 이상 입력해주세요";
        return false;
    }

    // 3. 특수문자 제한 검사
    if (!validRegex.test(value)) {
        message.textContent = "특수문자는 입력할 수 없습니다. (한글, 영어, 숫자, 공백만 허용)";
        return false;
    }

    // 조건 통과 시 에러 메시지 삭제
    message.textContent = "";
    return true;
}

// 실시간 유효성 검사 이벤트 연결
keyword.addEventListener("input", checkForm);

// 검색 버튼 클릭 이벤트
searchBtn.addEventListener("click", () => {
    // 유효성 검사 실패 시 기능 중단
    if (!checkForm()) {
        return;
    }

    const query = keyword.value.trim();
    const url = `https://openlibrary.org{query}`;

    // 화면 초기화 및 로딩 표시
    booklist.innerHTML = "";
    message.textContent = "검색 중입니다...";

    // API 호출 (fetch, then, catch 구조)
    fetch(url)
        .then(response => {
            return response.json();
        })
        .then(data => {
            message.textContent = ""; // 로딩 메시지 비우기

            // 검색 결과 없음 검사
            if (!data.docs || data.docs.length === 0) {
                message.textContent = "검색 결과가 없습니다";
                return;
            }

            // 상위 20개 결과만 선택 (Array.slice)
            const books = data.docs.slice(0, 20);

            // 카드 형태로 목록 출력 (forEach와 innerHTML += 활용)
            books.forEach(item => {
                const title = item.title ? item.title : "제목 정보 없음";
                const author = item.author_name ? item.author_name.join(", ") : "저자 미상";
                const year = item.first_publish_year ? item.first_publish_year : "정보 없음";
                const publisher = item.publisher ? item.publisher[0] : "출판사 정보 없음";

                booklist.innerHTML += `
                <div class="card">
                    <h3>${title}</h3>
                    <p><strong>저자:</strong> ${author}</p>
                    <p><strong>최초 출판연도:</strong> ${year}년</p>
                    <p><strong>출판사:</strong> ${publisher}</p>
                </div>
                `;
            });
        })
        .catch(error => {
            // API 호출 오류 처리
            message.textContent = "도서 정보를 불러오지 못했습니다";
            console.error(error);
        });
});