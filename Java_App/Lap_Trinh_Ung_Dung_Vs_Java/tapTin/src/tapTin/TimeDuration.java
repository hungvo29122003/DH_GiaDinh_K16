package tapTin;

public final class TimeDuration {
	private long thoiDiemBatDau;
	private long thoiDiemKetThuc;
	
	private boolean dangChay = false;
	
	public void start() {
		if(dangChay) {
			throw new IllegalStateException
			("phải stop trước khi gọi lại start.");
		}
		thoiDiemBatDau = System.currentTimeMillis();
		thoiDiemKetThuc = 0;
		dangChay = true;
	}
	
	public void stop() {
		if(!dangChay) {
			throw new IllegalStateException("không thể stop vì chưa start");
		}
		thoiDiemKetThuc = System.currentTimeMillis();
		dangChay = false;
	}
	@Override
	public String toString() {
		return (thoiDiemKetThuc - thoiDiemBatDau) + "ms";
	}
}
