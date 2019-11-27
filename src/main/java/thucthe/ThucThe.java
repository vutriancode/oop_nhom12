package thucthe;

public abstract class ThucThe {
	protected String dinhDanh;
	protected String nhanHienThi;
	protected String moTa;
	
	public ThucThe(String dinhDanh, String nhanHienThi, String moTa) {
		super();
		this.dinhDanh = dinhDanh;
		this.nhanHienThi = nhanHienThi;
		this.moTa = moTa;
	}
	public String getDinhDanh() {
		return dinhDanh;
	}
	public void setDinhDanh(String dinhDanh) {
		this.dinhDanh = dinhDanh;
	}
	public String getNhanHienThi() {
		return nhanHienThi;
	}
	public void setNhanHienThi(String nhanHienThi) {
		this.nhanHienThi = nhanHienThi;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	

}
