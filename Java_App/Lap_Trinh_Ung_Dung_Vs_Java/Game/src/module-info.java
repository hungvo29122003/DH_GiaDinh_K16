module Game {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens xepSo to javafx.graphics, javafx.fxml;
}
