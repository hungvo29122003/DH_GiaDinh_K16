package mvcGUI;


import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerStudent implements Initializable {
	@FXML
	private TextField textFieldid;
	@FXML
	private TextField textFieldFullName;
	@FXML
	private TextField textFieldPhoneNumber;
	@FXML
	private TextArea textArea;
	
	// khai báo biến cục bộ
	private ModelStudent student;
	private ViewStudent view;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		student = new ModelStudent(123, "Nguyễn Thị Tý", "0901111111", LocalDateTime.now());
		view = new ViewStudent();
		view.showDetail(student, textFieldid, textFieldFullName, textFieldPhoneNumber);
	}
	public void actionButton(ActionEvent event) {
		student.update(textFieldid, textFieldFullName, textFieldPhoneNumber);
		save();
	}
	public void save() {
		boolean isSuccess = student.save();
		if (isSuccess) {
			view.showUpdate(student, textArea);
		} else {
			view.ShowErrorMessage();
		}
	}
}
