package thucthe;

public class Person extends ThucThe{
	private String chucVu;
	public Person(String dinhDanh, String nhanHienThi, String moTa, String chucVu) {
		super(dinhDanh, nhanHienThi, moTa);
		this.chucVu = chucVu;
	}

	

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
}
