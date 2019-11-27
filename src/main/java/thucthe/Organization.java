package thucthe;

public class Organization extends ThucThe{
	private String truSo;
	public Organization(String dinhDanh, String nhanHienThi, String moTa,String truSo) {
		super(dinhDanh, nhanHienThi, moTa);
		this.truSo=truSo;
		// TODO Auto-generated constructor stub
	}

	public String getTruSo() {
		return truSo;
	}

	public void setTruSo(String truSo) {
		this.truSo = truSo;
	}
}
