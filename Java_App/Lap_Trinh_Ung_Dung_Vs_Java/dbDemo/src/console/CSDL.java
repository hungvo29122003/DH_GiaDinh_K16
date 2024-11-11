package console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
	 
	 //truy vấn CSDL dữ liệu (executeQuery), kết quả xuất ra màn hình console
	 public void KetQuaTruyVan(String sqlCommand) {
		 try {
			Connection conn = KetQuaKetNoi();
			
			//lấy kết quả trả về
			Statement state = conn.createStatement();
			ResultSet r = state.executeQuery(sqlCommand);
			
			//hiển thị ra màn hình 
			System.out.println("Mã NV | Họ lot | Tên | Địa chỉ | Trạng thái");
			while (r.next()) {
				System.out.println(r.getString("maNV") + "," + r.getString("hoLot")
				+ "," + r.getString("ten") + "," + r.getString("diaChi") + ","
				+ r.getString("trangThai"));
			}
			
			conn.close();
		} catch (Exception ex) {
			System.out.println("Lỗi: " + ex.getMessage());
		}
	 }

}
