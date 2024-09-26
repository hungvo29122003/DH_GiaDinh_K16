package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ControllerThuNghiem implements Initializable {
	// khai báo các biến tiwf file giao diện fxml: các biến trên file giao diện
	@FXML
	private TextField textfieldGio;
	// khai baod biến cục bộ
	private ModelThuNghiem gio;
	private ViewThuNghiem view;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		gio = new ModelThuNghiem("");
		view = new ViewThuNghiem();
		
	}
	// phương thức hienThiGio sẽ hiển thị giờ của hệ thống lên textFieldGio khi buttonGio dc nhấn
	public void hienThiGio(ActionEvent event) {
		// xử lý dữ liệu ở model
		gio.gioHienTai();
		String stringGio = gio.getGio();
		// hiển thị kq lên view
		view.hienThiGio(stringGio, textfieldGio);
	}
	
}
