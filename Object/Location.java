public class Location extends Kethuathuoctinhchung{
	public String quocGia;
	
	public Location (String dinhDanh,String nhan,String moTa) {
		super();
		this.dinhDanh=dinhDanh;
		this.nhan=nhan;
		this.moTa=moTa;
		
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
}
