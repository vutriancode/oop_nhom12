public class Person extends Object{
	public String chucvu;
	
	public Person (String dinhDanh,String nhan,String moTa) {
		super();
		this.dinhDanh=dinhDanh;
		this.nhan=nhan;
		this.moTa=moTa;
			
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
}
