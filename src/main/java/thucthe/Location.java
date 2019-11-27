package thucthe;

public class Location extends ThucThe {
	private String quocGia;
	public Location(String dinhDanh, String nhanHienThi, String moTa,String quocGia) {
		super(dinhDanh, nhanHienThi, moTa);
		// TODO Auto-generated constructor stub
		this.quocGia=quocGia;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	
}
