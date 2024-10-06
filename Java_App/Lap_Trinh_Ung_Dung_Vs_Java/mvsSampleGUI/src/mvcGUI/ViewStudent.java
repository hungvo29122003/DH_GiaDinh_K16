package mvcGUI;



import java.time.format.DateTimeFormatter;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ViewStudent {
	public void showDetail(ModelStudent student, 
			TextField textFieldId, TextField textFieldFullName,
			TextField textFieldPhoneNumber) {
		// hiển thị lên các textField
		textFieldId.setText("" + student.getId());
		textFieldFullName.setText(student.getFullName());
		textFieldPhoneNumber.setText(student.getPhoneNumber());
	}
	
	public void showUpdate(ModelStudent student, TextArea textArea ) {
		// hiển thị lên textArea
		String detailInFo = "Thông tin sinh viên:\n"
				+ "MSSV:" + student.getId() + "\nSố điện thoại: "
				+ student.getPhoneNumber() + "\nNgày cập nhật: "
				+student.getUpdatedDate().format(DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"));
		textArea.setText(detailInFo);
		textArea.setDisable(true);
		ShowSucceededMessage();
	}
	public void ShowErrorMessage() {
		thongBao("Cập nhật thất bại");
	}
	
	public void ShowSucceededMessage() {
		thongBao("Đã cập nhật thành công");
	}
	
	// Đưa ra thông báo tb cho người dùng
	public void thongBao(String tb) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Thông báo");
		alert.setHeaderText(null);
		alert.setContentText(tb);
		alert.showAndWait();
	}
}
