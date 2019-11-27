package module_import_dulieu;
import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;

import ketnoidata.DataBase;
import ketnoidata.EventDB;
import thucthe.Event;

public class EventReadData {
	static String file ="/home/vutrian/Desktop/oop_nhom12/Event.csv";
	public static ArrayList<String> dinhdanhPerson; 
	public static void readEventdata() {
	      DataBase a=new DataBase("localhost","admin","root","an.vt172933");
	      OrientDB orient= a.remoteDatabase();
	      ODatabaseSession db=a.connectDataBase(a.remoteDatabase());
		Event event;
		String file=EventReadData.file;
		ArrayList<String[]> listEvent= ReaderCsv.readDataLineByLine(file);
		for (String[] i : listEvent) {
			for(int k=0;k<30;k++) {
				event=new Event(i[0]+" "+String.valueOf(k),i[1],i[2]);
				EventDB.addEventDB(db, event);
			}}
		a.closeConnectDB(orient, db);
	}
}