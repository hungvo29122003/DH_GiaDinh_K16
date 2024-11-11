package xepSo;

import javafx.application.Application;
import javafx.stage.Stage;

public class KiemThu extends Application {

	@Override
	public void start(Stage sanKHau) throws Exception {
		GiaoDien giaoDien = new GiaoDien(sanKHau);
		giaoDien.hienThi();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
