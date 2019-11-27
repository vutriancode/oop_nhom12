package ketnoidata;

import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.record.OVertex;

import thucthe.Location;

public class LocationDB{
	public static ArrayList<OVertex>arrayLocation=new ArrayList<OVertex>();
	public static void addLocationDB(ODatabaseSession db, Location e) {
	    OVertex result = db.newVertex("Location");
	    result.setProperty("dinhDanh", e.getDinhDanh());
	    result.setProperty("moTa", e.getMoTa());
	    result.setProperty("nhanHienThi", e.getNhanHienThi());
	    result.setProperty("quocGias", e.getQuocGia());
	    arrayLocation.add(result);
	}}

