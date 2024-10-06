package mvcGUI;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainTest extends Application {
	@Override
	public void start(Stage sanKhau) {
		try {
			// TODO: handle exception
			// tải giao diện từ file fxml đã thiết kế
			Parent giaoDienParent = FXMLLoader.load(getClass().getResource("ViewStudent.fxml"));
			Scene canhVat = new Scene(giaoDienParent);
			sanKhau.setTitle("Quản lý đơn giản - MVC");
			sanKhau.setScene(canhVat);
			sanKhau.show();
			sanKhau.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
