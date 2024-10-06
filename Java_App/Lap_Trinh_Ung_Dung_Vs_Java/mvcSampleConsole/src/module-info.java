module mvcSampleConsole {
	requires javafx.controls;
	
	opens mvcConsole to javafx.graphics, javafx.fxml;
}
