package xepSo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class XuLy {
	private Stage sanKhau;
	private Scene canhVat1;
	private byte m;
	
	private Button[][] b;
	private byte[][] a;
	private byte hang = 0;
	private byte cot = 0;
	
	private byte cachSapXep;

	public XuLy(Stage sanKhau, Scene canhVat1, byte m, Button[][] b, byte[][] a, byte hang, byte cot, byte cachSapXep) {
		super();
		this.sanKhau = sanKhau;
		this.canhVat1 = canhVat1;
		this.m = m;
		this.b = b;
		this.a = a;
		this.hang = hang;
		this.cot = cot;
		this.cachSapXep = cachSapXep;
	}
	
	//còn thiếu di chuyển
	
	public void hoanDoiO(byte i, byte j) {
		if((i -1 == hang && j == cot) || (i + 1 == hang && j == cot)
				||(i == hang && j -1 == cot) ||(i == hang && j + 1 == cot)) {
			byte tam;
			tam = a[i][j];
			a[i][j] = a[hang][cot];
			a[hang][cot] = tam;
			
			b[hang][cot].setText("" + a[hang][cot]);
			
			//cập nhật ví trí ô trống
			hang = i;
			cot = j;
		}
		
		public void thangCuoc() {
			
		}
	}

}
