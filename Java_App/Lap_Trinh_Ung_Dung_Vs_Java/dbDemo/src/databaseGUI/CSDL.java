package databaseGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CSDL {
	private String dbURL;
	private String username;
	private String password;
	
	
	
	 public CSDL(String dbURL, String username, String password) {
		super();
		this.dbURL = dbURL;
		this.username = username;
		this.password = password;
	}


	// tạo kết nối đến CSDL
	 public Connection KetQuaKetNoi() {
		 Connection conn = null;
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Kết nối thành công:");
		} catch (Exception ex) {
			System.out.println("Kết nối thất bại:" + ex.getMessage());
		}
		 return conn;
	 }
	 
	 //truy vấn CSDL dữ liệu (executeQuery), kết quả xuất ra về lưu trong observableList
	 public ObservableList<ConNguoi> KetQuaTruyVan(Connection conn, String sqlCommand) {
		 ObservableList<ConNguoi> dsConNguoi = null;
		 ConNguoi user = null;
		 try {
			 Statement stage = conn.createStatement();
			 //lấy kết quả trả về từ câu truy vấn
			 ResultSet r = stage.executeQuery(sqlCommand);
			 
			 //đưa kết quả truy vấn vào observableList
			 dsConNguoi = FXCollections.observableArrayList();
			 boolean trangThai;
			 while (r.next()) {
				 trangThai = r.getBoolean("trangThai");
				 if(trangThai) {
					 user = new ConNguoi(r.getString("maNV"), r.getString("hoLot"),
							 r.getString("ten"), r.getString("diaChi"), "Đang làm việc");
				 } else {
					 user = new ConNguoi(r.getString("maNV"), r.getString("hoLot"),
							 r.getString("ten"), r.getString("diaChi"), "Không làm việc");
					 dsConNguoi.add(user);
				 }
				 
				 //đóng kết nối
				 conn.close();
			 }
			
		} catch (Exception ex) {
			System.out.println("Lỗi: " + ex.getMessage());
		}
		return dsConNguoi;
	 }

}
