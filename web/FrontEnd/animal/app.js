//처음 페이지가 로딩됐을 때 전체 목록이 나오게 하기
const API_URL = "http://localhost:10000/reservation";

//HTML 요소 가져오기
const reservationId = document.querySelector("#reservationId");

//동물이름
const petName = document.querySelector("#petName");

//주인
const ownerName = document.querySelector("#ownerName");

//동물의 종류
const animalType = document.querySelector("#animalType");
//의사이름
const doctorName = document.querySelector("#doctorName");
//예약날짜
const reservationDate = document.querySelector("#reservationDate");
//상태
const status = document.querySelector("#status");
//금액
const price = document.querySelector("#price")
//등록버튼
const saveBtn = document.querySelector("#saveBtn");
//취소버튼
const calcelBtn = document.querySelector("#cancelBtn");
const loadBtn = document.querySelector("#loadBtn");
const reservationList = document.querySelector("#reservationList");


const loadReservations = () => {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            data.forEach(reservation => {
                //tr생성
                const tr = document.createElement("tr");

                tr.innerHTML = `
                    <td>${reservation.id}</td>
                    <td>${reservation.petName}</td>
                    <td>${reservation.ownerName}</td>
                    <td>${reservation.animalType}</td>
                    <td>${reservation.doctorName}</td>
                    <td>${reservation.reservationDate}</td>
                    <td>${reservation.status}</td>
                    <td>${reservation.price.toLocaleString()}</td>
                    <td>
                        <button class="edit-btn">수정<button>
                        <button class="delete-btn">삭제</button>
                    </td>
                `;

                //tbody에 추가
                reservationList.appendChild(tr);
            })
        })
        .catch(error => {
            console.error(error);
            alert("예약 정보를 불러올 수 있습니다.");
        })
}

//예약하기
saveBtn.addEventListener("click", () => {
    //입력값 검사
    if (petName.value.trim() === "") {
        alert("반려동물 이름을 입력하세요");
        petName.focus;
        return;
    }

    if (ownerName.value.trim() === "") {
        alert("보호자 이름을 입력하세요");
        ownerName.focus;
        return;
    }

    if (ainmalType.value === "") {
        alert("동물 종류를 선택하세요");
        ainmalType.focus;
        return;
    }

    if (doctorName.value.trim() === "") {
        alert("담당 수의사 이름을 입력하세요");
        doctorName.focus;
        return;
    }

    if (reservationDate.value === "") {
        alert("예약 날짜를 선택하세요");
        reservationDate.focus;
        return;
    }

    if (price.value === "") {
        alert("예상 진료비를 작성하세요");
        price.focus;
        return;
    }

    //서버로 전송할 객체 생성
    const reservation = {
        petName: petName.value.trim(),
        ownerName: ownerName.value.trim(),
        animalType: animalType.value,
        doctorName: doctorName.value.trim(),
        reservationDate: reservationDate.value,
        status: status ? status.value : "예약완료", // status 요소가 있으면 그 값, 없으면 기본값
        price: Number(price.value)
    };

    // 등록 함수 호출
    insertReservation(reservation);


})

const insertReservation = (reservation) => {
    fetch(API_URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(reservation)
    })
        .then(res => {
            if (res.ok) {
                alert("예약이 성공적으로 등록되었습니다.");
                clearForm();          // 입력창 초기화
                loadReservations();   // 목록 새로고침
            } else {
                alert("예약 등록에 실패했습니다.");
            }
        })
        .catch(error => {
            console.error(error);
            alert("서버 통신 오류가 발생했습니다.");
        });
}

loadReservations();