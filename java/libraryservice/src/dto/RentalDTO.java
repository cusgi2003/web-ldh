package dto;

import java.sql.Date;

public class RentalDTO {
    // 1. private 필드 정의
    private int rental_id;
    private int book_id;
    private Date rental_date;

    // 2. 기본 생성자
    public RentalDTO() {
    }

    // 3. 모든 필드를 포함하는 생성자
    public RentalDTO(int rental_id, int book_id, Date rental_date) {
        this.rental_id = rental_id;
        this.book_id = book_id;
        this.rental_date = rental_date;
    }

    // 4. Getter 및 Setter 메서드
    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public Date getRental_date() {
        return rental_date;
    }

    public void setRental_date(Date rental_date) {
        this.rental_date = rental_date;
    }
}
