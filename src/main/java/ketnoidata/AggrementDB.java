package ketnoidata;

import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.record.OVertex;

import thucthe.Aggrement;


public class AggrementDB{
	public static ArrayList<OVertex> arrayAggrement=new ArrayList<OVertex>();
	public static void addAggrementDB(ODatabaseSession db, Aggrement e) {
	    OVertex result = db.newVertex("Aggrement");
	    result.setProperty("dinhDanh", e.getDinhDanh());
	    result.setProperty("moTa", e.getMoTa());
	    result.setProperty("nhanHienThi", e.getNhanHienThi());
	    result.save();
	    arrayAggrement.add(result);

	}}
