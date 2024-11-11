package databaseGUI;

import javafx.application.Application;
import javafx.stage.Stage;

public class KiemThu extends Application {

	@Override
	public void start(Stage sanKhau) {
		
		//thông tin kết nối CSDL
		String dbURL = "jdbc:mysql://localhost:3306/dbNhanSu4";
		String username = "root";
		String password = "Scarlett 2003";
		String sqlCommand = "Select * from conNguoi";
		
		//tạo giao diện
		GiaoDien giaoDien = new GiaoDien(dbURL, username, password, sqlCommand, sanKhau);
		giaoDien.hienThi();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
