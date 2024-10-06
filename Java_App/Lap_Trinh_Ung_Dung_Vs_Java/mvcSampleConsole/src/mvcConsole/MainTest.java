package mvcConsole;


public class MainTest  {
	public static void main(String[] args) {
		ControllerStudent controllerStudent = new ControllerStudent();
		controllerStudent.update(123, "Nguyễn Thị Tý", "0901111212");
		controllerStudent.save();
	}
}
