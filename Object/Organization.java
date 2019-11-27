public class Organization extends Thucthe{
	public String truSo;
	public Organization (String dinhDanh,String nhan,String moTa) {
		super();
		this.dinhDanh=dinhDanh;
		this.nhan=nhan;
		this.moTa=moTa;
		
	}
	public String getTruSo() {
		return truSo;
	}
	public void setTruSo(String truSo) {
		this.truSo = truSo;
	}
}
