package ketnoidata;

import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.record.OVertex;

import thucthe.Country;
public class CountryDB{
	public static ArrayList<OVertex> arrayCountry=new ArrayList<OVertex>();
	public static void addCountryDB(ODatabaseSession db, Country e) {
		
	    OVertex result = db.newVertex("Country");
	    result.setProperty("dinhDanh", e.getDinhDanh());
	    result.setProperty("moTa", e.getMoTa());
	    result.setProperty("nhanHienThi", e.getNhanHienThi());
	    result.setProperty("chucLuc", e.getChauLuc());
	    result.save();
	    
	    arrayCountry.add(result);

	}}
