package ketnoidata;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;
import com.orientechnologies.orient.core.metadata.schema.OClass;
import com.orientechnologies.orient.core.metadata.schema.OType;

public class DataBase {

	private String addressDataBase;
	private String nameDataBase;
	private String userName;
	private String passWord;
	
	public DataBase(String addressDataBase, String nameDataBase, String userName, String passWord) {
		super();
		this.addressDataBase = addressDataBase;
		this.nameDataBase = nameDataBase;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public String getAddressDataBase() {
		return addressDataBase;
	}

	public void setAddressDataBase(String addressDataBase) {
		this.addressDataBase = addressDataBase;
	}

	public String getNameDataBase() {
		return nameDataBase;
	}

	public void setNameDataBase(String nameDataBase) {
		this.nameDataBase = nameDataBase;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public OrientDB remoteDatabase() {
	    OrientDB orient = new OrientDB("remote:"+getAddressDataBase(), OrientDBConfig.defaultConfig());
	    return orient;
	}
	public ODatabaseSession connectDataBase(OrientDB orient) {
    ODatabaseSession db = orient.open(getNameDataBase(), getUserName(), getPassWord());
    return db;
    }
	public void closeConnectDB(OrientDB orient,ODatabaseSession db) {
		  db.close();    
		  orient.close();
	}
	public void taoDoiTuong(ODatabaseSession db) {
		if(db.getClass("Person")==null){
			OClass person=db.createVertexClass("Person");
			person.createProperty("dinhDanh", OType.STRING);
			person.createProperty("nhanHienThi", OType.STRING);
			person.createProperty("moTa", OType.STRING);
			person.createProperty("chucVu", OType.STRING);
			person.createIndex("dinhDanh_person", OClass.INDEX_TYPE.UNIQUE, "dinhDanh");
			
		}
		if(db.getClass("Country")==null){
			OClass country=db.createVertexClass("Country");
			country.createProperty("dinhDanh", OType.STRING);
			country.createProperty("nhanHienThi", OType.STRING);
			country.createProperty("moTa", OType.STRING);
			country.createProperty("chucLuc", OType.STRING);
			country.createIndex("dinhDanh_contry", OClass.INDEX_TYPE.UNIQUE, "dinhDanh");}
		if(db.getClass("Location")==null){
			OClass location=db.createVertexClass("Location");
			location.createProperty("dinhDanh", OType.STRING);
			location.createProperty("nhanHienThi", OType.STRING);
			location.createProperty("moTa", OType.STRING);
			location.createProperty("quocGia", OType.STRING);
			location.createIndex("dinhDanh_location", OClass.INDEX_TYPE.UNIQUE, "dinhDanh");}
		if(db.getClass("Organization")==null){
			OClass organization=db.createVertexClass("Organization");
			organization.createProperty("dinhDanh", OType.STRING);
			organization.createProperty("nhanHienThi", OType.STRING);
			organization.createProperty("moTa", OType.STRING);
			organization.createProperty("truSo", OType.STRING);
			organization.createIndex("dinhDanh_organization", OClass.INDEX_TYPE.UNIQUE, "dinhDanh");}
		if(db.getClass("Event")==null){
			OClass event=db.createVertexClass("Event");
			event.createProperty("dinhDanh", OType.STRING);
			event.createProperty("nhanHienThi", OType.STRING);
			event.createProperty("moTa", OType.STRING);	
			event.createIndex("dinhDanh_event", OClass.INDEX_TYPE.UNIQUE, "dinhDanh");}
		if(db.getClass("Aggrement")==null){
			OClass aggrement=db.createVertexClass("Aggrement");
			aggrement.createProperty("dinhDanh", OType.STRING);
			aggrement.createProperty("nhanHienThi", OType.STRING);
			aggrement.createProperty("moTa", OType.STRING);
			aggrement.createIndex("dinhDanh_aggrement", OClass.INDEX_TYPE.UNIQUE, "dinhDanh");}
}
	public void taoQuanHe(ODatabaseSession db){
	    if (db.getClass("CangThangvoi") == null) {
	        db.createEdgeClass("CangThangvoi");
	      }
	    if (db.getClass("DamPhanVoi") == null) {
	        db.createEdgeClass("DamPhanVoi");
	      }
	    if (db.getClass("DienRaTai") == null) {
	        db.createEdgeClass("DienRaTai");
	      }
	    if (db.getClass("GapGo") == null) {
	        db.createEdgeClass("GapGo");
	      }
	    if (db.getClass("HuyBo") == null) {
	        db.createEdgeClass("HuyBo");
	      }
	    if (db.getClass("KiThoaThuan") == null) {
	        db.createEdgeClass("KiThoaThuan");
	      }
	    if (db.getClass("PhanDoi") == null) {
	        db.createEdgeClass("PhanDoi");
	      }
	    if (db.getClass("PhatBieuTai") == null) {
	        db.createEdgeClass("PhatBieuTai");
	      }
	    if (db.getClass("ThamGia") == null) {
	        db.createEdgeClass("ThamGia");
	      }
	    if (db.getClass("UngHo") == null) {
	        db.createEdgeClass("UngHo");
	      }
	    if (db.getClass("ToChuc") == null) {
	        db.createEdgeClass("ToChuc");
	      }
		}
	}
