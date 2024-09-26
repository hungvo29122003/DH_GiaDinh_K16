package application;

import javafx.scene.control.TextField;

public class ViewThuNghiem {
	// phương thức hiển thị giờ của hệ thồng lên textFieldGio
	// buttonGio đưuọc nhấn
	public void hienThiGio(String stringGio, TextField textFieldGio) {
		// hiển thị kết quả lên view
		textFieldGio.setText(stringGio);
	}
}
