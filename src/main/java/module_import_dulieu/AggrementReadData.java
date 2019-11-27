package module_import_dulieu;
import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;

import ketnoidata.DataBase;
import ketnoidata.AggrementDB;
import thucthe.Aggrement;

public class AggrementReadData {
	static String file ="/home/vutrian/Desktop/oop_nhom12/Aggrement.csv";
	public static ArrayList<String> dinhdanhAggrement; 
	public static void readAggrementdata() {
	      DataBase a=new DataBase("localhost","admin","root","an.vt172933");
	      OrientDB orient= a.remoteDatabase();
	      ODatabaseSession db=a.connectDataBase(a.remoteDatabase());
		Aggrement aggrement;
		String file=AggrementReadData.file;
		ArrayList<String[]> listAggrement= ReaderCsv.readDataLineByLine(file);
		for (String[] i : listAggrement) {
			for(int k=0;k<30;k++) {
				aggrement=new Aggrement(i[0]+" "+String.valueOf(k),i[1],i[2]);
				AggrementDB.addAggrementDB(db, aggrement);
			}}
		a.closeConnectDB(orient, db);
	}
}