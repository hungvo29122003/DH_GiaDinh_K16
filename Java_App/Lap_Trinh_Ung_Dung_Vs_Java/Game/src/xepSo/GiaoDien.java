package xepSo;
	




import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class GiaoDien{
	private Stage sanKhau;
	
	private Scene canhVat1, canhVat2;
	
	private GridPane gridpane;
	private short n = 100;
	
	private byte m = 10;
	
	private Button[][] b = new Button[n][m];
	
	private byte[][] a = new byte[m][m];
	
	private byte hang;
	
	private byte cot;
	
	private ComboBox<String> cbKichThuoc;
	private ComboBox<String> cbCachSapXep;
	
	private byte cachSapXep;
	
	public GiaoDien(Stage sanKhau) {
		this.sanKhau = sanKhau;
	}
	
	public void hienThi() {
		Label labelTitle = new Label("Tuỳ chọn ban đầu");
		
		
		cbKichThuoc = new ComboBox<String>();
		cbKichThuoc.getItems().addAll("3x3", "4x4","5x5","6x6","7x7","8x8","9x9");
		cbKichThuoc.setPromptText("Chọn số ô của trò chơi");
		cbKichThuoc.setPrefWidth(n*3);
		
		cbCachSapXep = new ComboBox<String>();
		cbCachSapXep.getItems().addAll("1. Tăng theo hàng từ trái sang phải ",
				"2. Tăng theo cột từ trên xuống dưới",
				"3. Tăng theo hàng zig-zag");
		cbCachSapXep.setPromptText("Chọn cách chơi - cách sắp xếp");
		cbCachSapXep.setPrefWidth(n*3);
		
		Button buttonOK;
		
		buttonOK = new Button("OK");
		buttonOK.setPrefWidth(n*3);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(labelTitle, cbKichThuoc, cbCachSapXep, buttonOK);
		canhVat1 = new Scene(vBox, n *2.1, n*0.93);
		
		sanKhau.setScene(canhVat1);
		sanKhau.setTitle("Cài đặt");
		sanKhau.setResizable(false);
		sanKhau.show();
		xuLyButtonOK(buttonOK);
	}
	
	public void hienThi2() {
		gridpane = new GridPane();
		gridpane.setPadding(new Insets(5));
		gridpane.setHgap(3);
		gridpane.setVgap(3);
		khoiTaoGiaTri();
		m = Byte.parseByte(cbKichThuoc.getValue().charAt(0) + "");
		cachSapXep = Byte.parseByte(cbCachSapXep.getValue().charAt(0) + "");
		
		for (byte i = 0; i < m; i++) {
			for (byte j = 0; j < m; j++) {
				b[i][j] = new Button("" + a[i][j]);
				
				b[i][j].setPrefSize(n, n);
				b[i][j].setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR, 35));
				gridpane.add(b[i][j], j, i);
			}
		}
		
		b[hang][cot].setText("");
		
		canhVat2 = new Scene(gridpane, m * n, m* n);
		
		sanKhau.setScene(canhVat2);
		sanKhau.setTitle("Xếp số: " + cbCachSapXep.getValue());
	
	}
	
	public void xuLyButtonOK(Button buttonOK) {
		buttonOK.setOnAction(e -> {
			if (cbKichThuoc.getValue() != null && cbCachSapXep.getValue() != null) {
				if (cbKichThuoc.getValue() == "3x3" && cbCachSapXep.getValue().charAt(0) == '1') {
					hienThi2();
				} else {
					thongBao("Tùy chọn này chưa được cài đặt. Bạn cần: "
							+ "\n   - Chọn ô số: 3x3"
							+ "\n   - Chọn cách chơi: 1.Tăng theo hàng");
				}
			} else {
				thongBao("Bạn chưa chọn Số ô hoặc Cách chơi.");
			}
		});
	}
	
	public void thongBao(String a) {
		
	}
	
	//khởi tạo giá trị cho a[][], vị trí ô trống [hang][cot]
	public void khoiTaoGiaTri() {
		hang = (byte) (m-1);
		cot = (byte) (m-1);
		
		
		if(cachSapXep ==1) {
			for(byte i = 0;i< m; i++ ) {
				for(byte j = 0; j < m; j++) {
					a[i][j] = (byte) (i*m + j + 1); //giá trị ô trống a[m-1][m-1] = m*m
					
				}
			}
		}
		
		byte i1, j1, i2, j2;
		byte soLanHoanDoi = (byte)(m*m);
		
		if(soLanHoanDoi %2 ==1) {
			soLanHoanDoi--;
		}
		for(byte k = 0; k < soLanHoanDoi; k++) {
			do {
				i1 = (byte) (Math.random() * m);
				j1 = (byte) (Math.random() *m);
			} while(a[i1][j1] == m*m); 
				
			do {
				i2 = (byte)(Math.random() * m);
				j2 = (byte)(Math.random() * m);
			} while(a[i2][j2] == m*m || a[i2][j2] == a[i1][j1]);
			
			byte tam;
			tam = a[i1][j1];
			a[i1][j1] = a[i2][j2];
			a[i2][j2] = tam;
		}
	}
}
