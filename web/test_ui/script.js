// 기본 요소 가져오기
let searchInput = document.getElementById("searchInput");
let searchBtn = document.getElementById("searchBtn");
let allBtn = document.getElementById("allBtn");

let message = document.getElementById("message");
let count = document.getElementById("count");

let productList = document.getElementById("productList");

const url = `https://dummyjson.com`;


// 페이지 로드시 상품 목록 API 호출
const validateLoading = async (url) => {
    try {
        message.textContent = "";
        count.textContent = "";
        productList.innerHTML = `<p>페이지를 불러오는 중입니다.</p>`;

        const res = await fetch(url);

        if (!res.ok) {
            throw new Error("데이터를 가져오는데 실패했습니다.");
        }

        const data = await res.json();
        const products = data.products;

        productList.innerHTML = "";

        if (!products || products.length === 0) {
            message.textContent = "검색 결과가 없습니다.";
            return;
        }

        count.textContent = `상품 개수 : ${products.length}개`;

        products.forEach(product => {
            const isStock = product.stock < 10;
            const stockStatus = isStock ? "재고 부족" : "재고 정상";
            const stocklist = isStock ? "stock-low" : "stock-normal";

            productList.innerHTML += `
                <div class="product-card">
                    <img src="${product.thumbnail}" alt="상품이미지">
                    <div class="info">
                        <h3>${product.title}</h3>
                        <span>카테고리 : ${product.category}</span>
                        <p>가격 : ${product.price}</p>
                        <p>할인율 : ${product.discount}</p>
                        <p>평점 : ${product.rating}</p>
                        <p>재고 : ${product.stock}</p>
                        <p>${stockStatus}</p>
                    </div>
                </div>
            `;
        });

    } catch (error) {
        productList.innerHTML = "";
        message.textContent = "오류가 발생했습니다.";
    }

}


// 검색 기능
const validateSucess = () => {
    const productName = searchInput.value.trim();
    const regex = /[A-Za-z0-9-]+$/l;

    if (productName === "") {
        message.textContent = "검색어를 입력하세요.";
        count.textContent = "";
        productList = "";
        return;
    }

    if (productName.length < 2) {
        message.textContent = "검색어는 2글자 이상 입력하세요.";
        count.textContent = "";
        productList = "";
        return;
    }

    if (!regex.test(productName)) {
        message.textContent = "검색어에는 특수문자를 입력할 수 없습니다.";
        count.textContent = "";
        productList = "";
        return;
    }
}

searchInput.addEventListener("input", validateSucess);
searchBtn.addEventListener("click", validateLoading);

allBtn.addEventListener("click", () => {
    searchInput.value ="";
    validateLoading();
})