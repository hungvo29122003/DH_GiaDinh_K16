package databaseGUI;



import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GiaoDien {
	private String dbURL;
	private String username;
	private String password;
	private String sqlCommand;
	private Stage sanKhau;


	private TableView<ConNguoi> table;
	private TextField tFMaNV;
	private Button btThem;
	//khởi dựng construction
	public GiaoDien(String dbURL, String username, String password, String sqlCommand, Stage sanKhau) {
		this.dbURL = dbURL;
		this.username = username;
		this.password = password;
		this.sqlCommand = sqlCommand;
		this.sanKhau = sanKhau;
	}
	//tạo giao diện gồm tableView, các textField, nút nhấn
	public void hienThi() {
		
		//tạo bảng dữ liệu tableView
		table = new TableView<ConNguoi>();
		table.setLayoutX(5);
		table.setLayoutY(50);
		table.setPrefWidth(380);
		table.setPrefHeight(225);
		
		//tạo TextField mã nhân viên
		tFMaNV = new TextField();
		tFMaNV.setLayoutX(10);
		tFMaNV.setLayoutY(290);
		tFMaNV.setPrefWidth(50);
		tFMaNV.setPromptText("Mã NV");
		
		//tạo nút thêm để thêm mới nhân sự
		btThem = new Button("Thêm");
		btThem.setPrefWidth(50);
		btThem.setLayoutX(10);
		btThem.setLayoutY(320);
		btThem.setTooltip(new Tooltip("Thêm mới nhân sự: Cần điền đầy đủ thông tin. "));
		
		//tên chươn trình
		Text tenChuongTrinh = new Text(85,35,"Kết nối CSDL");
		tenChuongTrinh.setStroke(Color.BLUE);
		tenChuongTrinh.setFill(Color.AQUAMARINE);
		tenChuongTrinh.setStrokeWidth(2);
		tenChuongTrinh.setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR, 31));
		
		//đưa tất cả vào group
		Group group = new Group(tenChuongTrinh, table, tFMaNV, btThem);
		
		//trình diễn cảnh vật trên sân khấu
		
		Scene canhVat = new Scene(group, 390, 355);
		
		sanKhau.setTitle("CSDL");
		sanKhau.setResizable(false);
		sanKhau.setScene(canhVat);
		sanKhau.show();
		
		
	}
}
