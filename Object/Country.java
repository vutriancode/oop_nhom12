
public class Country extends Thucthe {
	public String chauLuc;
	

	public Country(String dinhDanh,String nhan,String moTa) {
		super();
		this.dinhDanh=dinhDanh;
		this.nhan=nhan;
		this.moTa=moTa;
		
	}
	public String getChauLuc() {
		return chauLuc;
	}

	public void setChauLuc(String chauLuc) {
		this.chauLuc = chauLuc;
	}

}
