package thucthe;

public class Country  extends ThucThe{
	private String chauLuc;

	
	public Country(String dinhDanh, String nhanHienThi, String moTa, String chauLuc) {
		super(dinhDanh, nhanHienThi, moTa);
		this.chauLuc = chauLuc;
	}

	public String getChauLuc() {
		return chauLuc;
	}

	public void setChauLuc(String chauLuc) {
		this.chauLuc = chauLuc;
	}
	

}
