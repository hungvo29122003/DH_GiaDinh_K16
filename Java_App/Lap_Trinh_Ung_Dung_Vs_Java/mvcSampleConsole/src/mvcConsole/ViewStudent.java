package mvcConsole;

import java.time.format.DateTimeFormatter;

public class ViewStudent {
    /**
     * Phương thức hiển thị thông tin sinh viên
     *
     * @param student đối tượng sinh viên cần hiển thị
     */
    public void showDetail(ModelStudent student) {
        System.out.println("Tooong tin sinh viên: ");
        System.out.println("    - MSSV: " + student.getId());
        System.out.println("    - Họ và tên: " + student.getFullName());
        System.out.println("    - Điện thoại: " + student.getPhoneNumber());
        System.out.println("    - Được cập nhật lúc: " + student.getUpdatedDate().format(DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy")));
        System.out.println();
    }

    /**
     * Phương thức hiển thị cập nhật thành công
     *
     * @param student đối tượng sinh viên cần cập nhật
     */
    public void showSucceededUpdate(ModelStudent student) {
        System.out.println("Đã cập nhật thành công đối với sinh viên sau: ");
        showDetail(student);
    }

    /**
     * Phương thức hiển thị lỗi khi cập nhật thông tin sinh viên không thành công
     */
    public void showErrorMessage() {
        System.out.println("Cập nhật thất bại");
    }
}