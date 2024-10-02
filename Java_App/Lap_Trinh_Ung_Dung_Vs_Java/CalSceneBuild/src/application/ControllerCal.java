package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ControllerCal implements Initializable {
	// khai báo các biến cho file giao diện fxml phải có chỉ thị @FXML
	@FXML
	private TextField textField1;
	@FXML
	private TextField textField2;
	@FXML
	private TextField textFieldKetQua;
	
	private ModelCalculater tinh;
	private ViewCalculater viewCalc;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 tinh = new ModelCalculater();
		 viewCalc = new ViewCalculater();
		
	}
	public void hanhDongTinhTong(ActionEvent event) {
		int kQ = tinh.tinhTong(textField1, textField2);
		 viewCalc.hienThiKetQua(kQ, textFieldKetQua);
	}
	public void hanhDongTinhHieu(ActionEvent event) {
		int kQ = tinh.tinhHieu(textField1, textField2);
		viewCalc.hienThiKetQua(kQ, textFieldKetQua);
	}
	

}
