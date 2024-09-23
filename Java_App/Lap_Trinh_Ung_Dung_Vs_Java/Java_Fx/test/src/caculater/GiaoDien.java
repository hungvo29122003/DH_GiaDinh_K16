package caculater;

import java.awt.Button;
import java.awt.Taskbar.State;
import java.awt.TextField;

import javafx.scene.layout.FlowPane;

public class GiaoDien {
	private State sanKhau;
	private TextField textField1;
	private TextField textField2;
	private Button btn_Cong;
	private Button btn_Tru;
	private TextField textFieldKetQua;
	private FlowPane flowPane;
	public GiaoDien() {
		// text filed
		textField1 = new TextField();
		textField2 = new TextField();
		textFieldKetQua = new TextField();
		// button
		btn_Cong = new Button();
		btn_Tru = new Button();
		// tạo khung chứa FlowPane
		flowPane = new FlowPane();
		// thêm tất cả các textfiled và button vào flowPanel
		flowPane.getChildren().add(textField1, textField2, textFieldKetQua, btn_Cong, btn_Tru);
		
	}
}
