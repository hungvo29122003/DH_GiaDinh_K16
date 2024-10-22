package serverSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server {
	private ServerSocket serverSocket;
	
	// khởi dựng
	public Server(int port, int timeOut) throws IOException{
		try {
			serverSocket = new ServerSocket(port); // port > 1023
			serverSocket.setSoTimeout(timeOut);
		} catch(IOException e){
			System.out.println("lỗi rồi: " + e.getMessage());
		}
	}
	
	// phương thức
	public void chay() {
		while(true) {
			try {
				// máy chủ mở cổng và chwof máy trạm kết nối vào
				System.out.println("Máy chủ: Đang chờ máy trạm kết nối vào " 
				+ serverSocket.getLocalPort() + "...");
				Socket incomingSocket = serverSocket.accept();
				System.out.println("Máy chủ: Đã có máy trạm" 
						+ incomingSocket.getRemoteSocketAddress()
						+"kết nối vào máy chủ "
						+ incomingSocket.getLocalSocketAddress());
				// mở kênh nhập dữ liệu - nhận dữ liệu do máy trạm xuất
				
			InputStream in = incomingSocket.getInputStream();
			InputStreamReader  reader = new InputStreamReader(in);
			
			BufferedReader bufferedReader = new BufferedReader(reader);
			System.out.println("Máy trạm: " + bufferedReader.readLine());
			
			// mở kênh ghi dữ liệu - gửi dữ liệu đến máy trạm
			OutputStream out = incomingSocket.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(out);
			
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("Tôi là máy chủ "
					+ incomingSocket.getLocalSocketAddress()
					+ "chào máy trạm");
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			incomingSocket.close();
			} catch(SocketTimeoutException s){
				System.out.println("Hết thời hạn rôi!");
				try {
					serverSocket.close();
				} catch (IOException e) {
					System.out.println("Lối rồi: " + e.getMessage());
				}
				break;
			} catch (IOException e) {
				System.out.println("Lỗi rồi: " + e.getMessage());
				break;
			}
		}
	}
}
