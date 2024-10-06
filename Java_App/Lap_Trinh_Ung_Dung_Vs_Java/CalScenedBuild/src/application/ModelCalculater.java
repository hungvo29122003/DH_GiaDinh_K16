package application;

import javafx.scene.control.TextField;

public class ModelCalculater {

	
	// phương thức tinhTong sẽ trả về giá trị kiểu int là tổng của hai số
	public int tinhTong(TextField textField1, TextField textField2) {
		int t1 = Integer.parseInt(textField1.getText());
		int t2 = Integer.parseInt(textField2.getText());
		return (t1 + t2);
	}
	public int tinhHieu(TextField textField1, TextField textField2) {
		int t1 = Integer.parseInt(textField1.getText());
		int t2 = Integer.parseInt(textField2.getText());
		return (t1 - t2);
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
