package dto;

public class CustomerDTO {
    // 1. private 필드 정의
    private int customer_id;
    private String name;
    private String phone;

    // 2. 기본 생성자
    public CustomerDTO() {
    }

    public CustomerDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    // 3. 모든 필드를 포함하는 생성자
    public CustomerDTO(int customer_id, String name, String phone) {
        this.customer_id = customer_id;
        this.name = name;
        this.phone = phone;
    }

    // 4. Getter 및 Setter 메서드
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
