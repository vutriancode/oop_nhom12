package ketnoidata;

import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.record.OVertex;

import thucthe.Person;

public class PersonDB{
	public static ArrayList<OVertex> arrayPerson=new ArrayList<OVertex>(); 
	public static void  addPersonDB(ODatabaseSession db,Person perSon) {
	    OVertex result = db.newVertex("Person");
	    result.setProperty("dinhDanh", perSon.getDinhDanh());
	    result.setProperty("moTa", perSon.getMoTa());
	    result.setProperty("nhanHienThi", perSon.getNhanHienThi());
	    result.setProperty("chucVu", perSon.getChucVu());
	    result.save();
	    arrayPerson.add(result);

	}}
