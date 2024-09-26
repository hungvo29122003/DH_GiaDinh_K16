package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ModelThuNghiem {
	private String gio;
	
	public ModelThuNghiem(String gio) {
		this.gio = gio;
	}
	public String getGio() {
		return gio;
	}
	public void setGio(String gio) {
		this.gio = gio;
	}
//	 phương thức giohientai sẽ cập nhật lại giờ hiện hành qua chuỗi giờ
	public void gioHienTai() {
		// xử lý dữ liệu ở model
		String stringGio = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		setGio(stringGio);
	}
}
