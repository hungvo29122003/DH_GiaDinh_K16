package console;

public class KiemThu {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/dbNhanSu4";
		String username = "root";
		String password = "Scarlett 2003";
		
		CSDL ketNoiCSDL = new CSDL(dbURL, username, password);
		String sqlCommand = "select * from conNguoi";
		
		ketNoiCSDL.KetQuaTruyVan(sqlCommand);
	}

}
