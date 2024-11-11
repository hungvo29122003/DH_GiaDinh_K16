package databaseGUI;

public class ConNguoi {
	private String maNV;
	private String ten;
	private String hoLot;
	private String diaChi;
	private String trangThai; //true đang làm việc, false ko làm việc
	
	
	public ConNguoi(String maNV, String ten, String hoLot, String diaChi, String trangThai) {
		super();
		this.maNV = maNV;
		this.ten = ten;
		this.hoLot = hoLot;
		this.diaChi = diaChi;
		this.trangThai = trangThai;
	}


	public String getMaNV() {
		return maNV;
	}


	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public String getHoLot() {
		return hoLot;
	}


	public void setHoLot(String hoLot) {
		this.hoLot = hoLot;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public String getTrangThai() {
		return trangThai;
	}


	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
}
