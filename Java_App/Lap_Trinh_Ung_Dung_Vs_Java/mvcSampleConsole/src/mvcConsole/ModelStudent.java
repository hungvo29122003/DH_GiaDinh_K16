package mvcConsole;

import java.time.LocalDateTime;

public class ModelStudent {
    // khai báo thuộc tính
    private Integer id;
    private String fullName;
    private String phoneNumber;
    private LocalDateTime updatedDate;

    // khởi dựng
    public ModelStudent(Integer id, String fullName, String phoneNumber, LocalDateTime updatedDate) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.updatedDate = updatedDate;
    }

    // khai triển các phương thức
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate() {
        this.updatedDate = updatedDate;
    }
    /**
     *  cập nhật thông tin sinh viên
     * @param id mã số sinh viên  
     * @param fullName họ và tên  
     * @param phoneNumber số điện thoại 
     */
    public void update(Integer id, String fullName, String phoneNumber) {
        setId(id);
        setFullName(fullName);
        setPhoneNumber(phoneNumber);
    }

    public boolean save() {
        if (phoneNumber.length() < 11) {
            this.updatedDate = LocalDateTime.now();
            return true;
        }
        return false;
    }
}