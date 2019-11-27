package module_import_dulieu;

import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;

import ketnoidata.DataBase;
import ketnoidata.PersonDB;
import thucthe.Person;

public class PersonReadData {
	static String file ="/home/vutrian/Desktop/oop_nhom12/Person.csv";
	public static ArrayList<String> dinhdanhPerson; 
	public static void readPersondata() {
	      DataBase a=new DataBase("localhost","admin","root","an.vt172933");
	      OrientDB orient= a.remoteDatabase();
	      ODatabaseSession db=a.connectDataBase(a.remoteDatabase());
		Person perSon;
		String file=PersonReadData.file;
		ArrayList<String[]> listPerson= ReaderCsv.readDataLineByLine(file);
		for (String[] i : listPerson) {
			for(int k=0;k<30;k++) {
				perSon=new Person(i[0]+" "+String.valueOf(k),i[1],i[2],i[3]);
				PersonDB.addPersonDB(db, perSon);
			}}
		a.closeConnectDB(orient, db);
	}}