package module_import_dulieu;
import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;

import ketnoidata.DataBase;
import ketnoidata.LocationDB;
import thucthe.Location;

public class LocationReadData {
	static String file ="/home/vutrian/Desktop/oop_nhom12/Location.csv";
	public static ArrayList<String> dinhdanhLocation; 
	public static void readLocationdata() {
	      DataBase a=new DataBase("localhost","admin","root","an.vt172933");
	      OrientDB orient= a.remoteDatabase();
	      ODatabaseSession db=a.connectDataBase(a.remoteDatabase());
		Location location;
		String file=LocationReadData.file;
		ArrayList<String[]> listLocation= ReaderCsv.readDataLineByLine(file);
		for (String[] i : listLocation) {
			for(int k=0;k<30;k++) {
				location=new Location(i[0]+" "+String.valueOf(k),i[1],i[2],i[3]);
				LocationDB.addLocationDB(db, location);
			}}
		a.closeConnectDB(orient, db);
	}
}