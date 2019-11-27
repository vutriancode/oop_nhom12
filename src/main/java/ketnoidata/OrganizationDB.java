package ketnoidata;

import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.record.OVertex;

import thucthe.Organization;

public class OrganizationDB{
	public static ArrayList<OVertex> arrayOrganization=new ArrayList<OVertex>();
	public static void addOrganizationDB(ODatabaseSession db, Organization e) {
	    OVertex result = db.newVertex("Organization");
	    result.setProperty("dinhDanh", e.getDinhDanh());
	    result.setProperty("moTa", e.getMoTa());
	    result.setProperty("nhanHienThi", e.getNhanHienThi());
	    result.setProperty("truSo", e.getTruSo());
	    result.save();
	    arrayOrganization.add(result);
	}}

