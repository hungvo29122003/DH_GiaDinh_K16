module test {
	requires javafx.controls;
	requires java.desktop;
	
	opens caculater to javafx.graphics, javafx.fxml;
}
