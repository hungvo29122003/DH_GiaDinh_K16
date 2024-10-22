package clientSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	//khai báo thuộc tính
	private String serverName;
	private int port;
	
	// khởi dựng
	public Client(String serverName, int port) {
		this.serverName = serverName;
		this.port = port;
	}
	
	//xây dựng phương thức kết nối đến server
	public void ketNoiDenMayChu() {
		try {
			//thiết lập kết nối đến server: 
			System.out.println("Máy trạm: Đang kết nối đến máy chủ....");
			Socket client = new Socket(serverName, port);
			System.out.println("Máy trạm: Đã kết nối đến máy chủ "
					+ client.getRemoteSocketAddress()
					+ client.getLocalSocketAddress() 
					+ " từ máy trạm" + client.getLocalSocketAddress());
			
			//mở kênh xuất dữ liệu - gửi dữ liệu đến client
			
			OutputStream out = client.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(out);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("Tôi là máy trạm"
					+ client.getLocalSocketAddress() + " chào máy chủ");
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			//mở kênh nhập dữ liệu - nhân dữ liệu do máy chủ gửi
			InputStream in = client.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);
			BufferedReader bufferedReader = new BufferedReader(reader);
			System.out.println("Máy chủ: " + bufferedReader.readLine());
			
			client.close();
		}catch (IOException e) {
			System.out.println("Kết nối thất bại: " + e.getMessage());
		}
	}

}
