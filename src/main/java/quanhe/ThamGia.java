package quanhe;

import thucthe.Event;

import projectException.TypeException;
import thucthe.Aggrement;
import thucthe.Organization;
import thucthe.Person;
import thucthe.ThucThe;

public class ThamGia extends QuanHe{
	
	@Override
	public ThucThe getThucThe1() {
		// TODO Auto-generated method stub
		return this.thucThe1;
	}

	@Override
	public void setThucThe1(ThucThe thucThe1) throws TypeException {
		// TODO Auto-generated method stub
		if(thucThe1 instanceof Person) {
			this.thucThe1=thucThe1;
		}else if(thucThe1 instanceof Organization) {
			this.thucThe1=thucThe1;
		}
		else{
			throw new TypeException("Sai kieu kieu phai la Person hoặc Organization");
		}
		
	}

	@Override
	public ThucThe getThucThe2() {
		// TODO Auto-generated method stub
		return this.thucThe2;
	}

	@Override
	public void setThucThe2(ThucThe thucThe2) throws TypeException {
		// TODO Auto-generated method stub
				if(thucThe2 instanceof Organization) {
					this.thucThe2=thucThe2;
				}else if(thucThe2 instanceof Event) {
					this.thucThe2=thucThe2;
				}else if(thucThe2 instanceof Aggrement) {
					this.thucThe2=thucThe2;
				}
				else{
					throw new TypeException("Sai kieu kieu phai la Organization,Event,Aggrement");
				}
						
	}
	@Override
	public void inQuanHe() {
		System.out.println(thucThe1.getNhanHienThi()+"->kí thỏa thuân với->"+thucThe2.getNhanHienThi() );
		
	}	

}
