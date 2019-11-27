package quanhe;

import projectException.TypeException;
import thucthe.Aggrement;
import thucthe.Country;
import thucthe.Event;
import thucthe.Person;
import thucthe.ThucThe;

public class HuyBo extends QuanHe{
	
	@Override
	public ThucThe getThucThe1() {
		// TODO Auto-generated method stub
		return this.thucThe1;
	}

	@Override
	public void setThucThe1(ThucThe thucThe1) throws TypeException {
		// TODO Auto-generated method stub
		if(thucThe1 instanceof Event) {
			this.thucThe1=thucThe1;
		}
		else if(thucThe1 instanceof Aggrement){
			this.thucThe1=thucThe1;
		}else {
			throw new TypeException("Sai kieu kieu phai la Event or Aggrement");
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
				if(thucThe2 instanceof Country) {
					this.thucThe2=thucThe2;
				}else if(thucThe2 instanceof Person){
					this.thucThe2=thucThe2;
				}else {
					throw new TypeException("Sai kieu kieu phai la Country");
				}
						
	}
	@Override
	public void inQuanHe() {
		System.out.println(thucThe1.getNhanHienThi()+"->kí thỏa thuân với->"+thucThe2.getNhanHienThi() );
		
	}	

}
