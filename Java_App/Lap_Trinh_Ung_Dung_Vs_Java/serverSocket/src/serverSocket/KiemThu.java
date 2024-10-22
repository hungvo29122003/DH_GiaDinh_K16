package serverSocket;

import java.io.IOException;

public class KiemThu {

	public static void main(String[] args) {
		int port = 3333;
		int timeOut = 60000;
		
		try {
			Server server = new Server(port, timeOut);
			server.chay();
		}catch(IOException e) {
			System.out.println("Lỗi rồi: " + e.getMessage());
		}
	}
}
