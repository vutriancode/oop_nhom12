package quanhe;

import projectException.TypeException;
import thucthe.Person;
import thucthe.ThucThe;

public class gapGo extends QuanHe{
	
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
		}else {
			throw new TypeException("Sai kieu kieu phai la Person");
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
					throw new TypeException("Sai kieu kieu phai la Person");
				}
						
	}

	@Override
	public void inQuanHe() {
		// TODO Auto-generated method stub
		
	}
	

}
