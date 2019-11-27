package quanhe;

import projectException.TypeException;
import thucthe.ThucThe;

public abstract class QuanHe {
	protected ThucThe thucThe1 ;
	protected ThucThe thucThe2;
	public abstract ThucThe getThucThe1();

	public abstract void setThucThe1(ThucThe thucThe1) throws TypeException;

	public abstract ThucThe getThucThe2();

	public abstract void setThucThe2(ThucThe thucThe2) throws TypeException;
	public abstract void inQuanHe();
}
