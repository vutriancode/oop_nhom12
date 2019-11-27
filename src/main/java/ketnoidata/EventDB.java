package ketnoidata;

import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.record.OVertex;

import thucthe.Event;

public class EventDB{
	public static ArrayList<OVertex> arrayEvent=new ArrayList<OVertex>();
	public static void addEventDB(ODatabaseSession db, Event e) {
	    OVertex result = db.newVertex("Event");
	    result.setProperty("dinhDanh", e.getDinhDanh());
	    result.setProperty("moTa", e.getMoTa());
	    result.setProperty("nhanHienThi", e.getNhanHienThi());
	    result.save();
	    arrayEvent.add(result);

	}}
