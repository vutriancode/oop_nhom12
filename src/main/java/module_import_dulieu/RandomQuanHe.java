package module_import_dulieu;

import java.util.ArrayList;
import java.util.Random;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.record.OEdge;
import com.orientechnologies.orient.core.record.OVertex;

import ketnoidata.DataBase;

public class RandomQuanHe {
	public static void randomQuanHe(ArrayList<OVertex> a,ArrayList<OVertex> b,String quanhe) {
		DataBase dataBase=new DataBase("localhost","admin","root","an.vt172933");
	    OrientDB orient= dataBase.remoteDatabase();
	    ODatabaseSession db=dataBase.connectDataBase(dataBase.remoteDatabase());
		for(OVertex i : a ) {
			int m=new Random().nextInt(b.size());
			for(int k =0;k<m;k++) {
				OVertex tg=b.get(new Random().nextInt(b.size()));
				OEdge edge1 =i.addEdge(tg, quanhe);
				edge1.save();
				
			}
		}
		dataBase.closeConnectDB(orient, db);
	}
}
	
