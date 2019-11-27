package module_import_dulieu;
import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;

import ketnoidata.DataBase;
import ketnoidata.OrganizationDB;
import thucthe.Organization;

public class OrganizationReadData {
	static String file ="/home/vutrian/Desktop/oop_nhom12/Organization.csv";
	public static ArrayList<String> dinhdanhOrganization; 
	public static void readOrganizationdata() {
	      DataBase a=new DataBase("localhost","admin","root","an.vt172933");
	      OrientDB orient= a.remoteDatabase();
	      ODatabaseSession db=a.connectDataBase(a.remoteDatabase());
		Organization organization;
		String file=OrganizationReadData.file;
		ArrayList<String[]> listOrganization= ReaderCsv.readDataLineByLine(file);
		for (String[] i : listOrganization) {
			for(int k=0;k<30;k++) {
				organization=new Organization(i[0]+" "+String.valueOf(k),i[1],i[2],i[3]);
				OrganizationDB.addOrganizationDB(db, organization);
			}}
		a.closeConnectDB(orient, db);
	}
}