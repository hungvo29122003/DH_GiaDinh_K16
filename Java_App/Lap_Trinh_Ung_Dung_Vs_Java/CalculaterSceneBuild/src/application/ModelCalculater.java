package application;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ModelCalculater {
	private TextField textField1;
	private TextField textField2;
	private TextField textFieldKetQua;
	private Button addBtn;
	private Button subBtn;
	
	public ModelCalculater(TextField textField1, TextField textField2, Button addBtn, Button sunBtn, TextField textFieldKetQua) {
		this.textField1 = textField1;
		this.textField2 = textField2;
		this.textFieldKetQua = textFieldKetQua;
		this.addBtn = addBtn;
		this.subBtn = sunBtn;
	}
	
	public int add() {
		int a,  b;
		a = Integer.parseInt(this.textField1.getText());
		b = Integer.parseInt(this.textField2.getText());
		this.textFieldKetQua.setText(String.valueOf(a + b));
		return (a + b);
	}
	
	public int sub() {
		int a,  b;
		a = Integer.parseInt(this.textField1.getText());
		b = Integer.parseInt(this.textField2.getText());
		this.textFieldKetQua.setText(String.valueOf(a - b));
		return (a- b);
	}
	
//	public void addButton() {
//		this.addBtn.setOnAction(e -> {
//			add();
//		});
//	}
//	
//	public void subButton() {
//		this.subBtn.setOnAction(e -> {
//			sub();
//		});
//	}
}
