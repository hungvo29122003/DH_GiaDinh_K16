package application;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ViewCalculater {
	// phương thức hiển thị kết quả sẽ hiển thị ketQua lên textield
	public void hienThiKetQua(int ketQua, TextField textFieldKetQua) {
		textFieldKetQua.setText(String.valueOf(ketQua));
	}
}
