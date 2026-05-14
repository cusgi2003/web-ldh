package dto;

public class BookDTO {
    // 1. private 필드 정의
    private int book_id;
    private String title;
    private String author;
    private int stock;

    // 2. 기본 생성자
    public BookDTO() {
    }
    
    public BookDTO( String title, String author, int stock) {
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    // 3. 모든 필드를 포함하는 생성자
    public BookDTO(int book_id, String title, String author, int stock) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    // 4. Getter 및 Setter 메서드
    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
