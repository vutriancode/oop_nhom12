package quanhe;

import projectException.TypeException;
import thucthe.Organization;
import thucthe.Person;
import thucthe.ThucThe;

public class ToChuc extends QuanHe{
	
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
		}else if(thucThe1 instanceof Organization){
			throw new TypeException("Sai kieu kieu phai la Person hoac Organization");
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
				if(thucThe1 instanceof Person) {
					this.thucThe2=thucThe2;
				}else {
					throw new TypeException("tham so 2 co kieu kieu phai la Event");
				}
						
	}

	@Override
	public void inQuanHe() {
		// TODO Auto-generated method stub
		
	}
	

}