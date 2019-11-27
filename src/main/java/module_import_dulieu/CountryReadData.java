package module_import_dulieu;
import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;

import ketnoidata.DataBase;
import ketnoidata.CountryDB;
import thucthe.Country;

public class CountryReadData {
	static String file ="/home/vutrian/Desktop/oop_nhom12/Country.csv";
	public static ArrayList<String> dinhdanhCountry; 
	public static void readCountrydata() {
	      DataBase a=new DataBase("localhost","admin","root","an.vt172933");
	      OrientDB orient= a.remoteDatabase();
	      ODatabaseSession db=a.connectDataBase(a.remoteDatabase());
		Country country;
		String file=CountryReadData.file;
		ArrayList<String[]> listCountry= ReaderCsv.readDataLineByLine(file);
		for (String[] i : listCountry) {
			for(int k=0;k<30;k++) {
				country=new Country(i[0]+" "+String.valueOf(k),i[1],i[2],i[3]);
				CountryDB.addCountryDB(db, country);
			}}
		a.closeConnectDB(orient, db);
	}
}