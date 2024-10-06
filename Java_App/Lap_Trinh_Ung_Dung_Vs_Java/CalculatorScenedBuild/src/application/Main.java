package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage sanKhau) {
		try {
			// TODO: handle exception
			// tải giao diện từ file fxml đã thiết kế
			Parent giaoDienParent = FXMLLoader.load(getClass().getResource("calculater.fxml"));
			Scene canhVat = new Scene(giaoDienParent);
			sanKhau.setTitle("Ứng dụng - Calculater");
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
