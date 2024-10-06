module mvsSampleGUI {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens mvcGUI to javafx.graphics, javafx.fxml;
}
