package nhom12_oop.nhom12_oop;

import java.util.ArrayList;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;

import ketnoidata.AggrementDB;
import ketnoidata.CountryDB;
import ketnoidata.DataBase;
import ketnoidata.EventDB;
import ketnoidata.LocationDB;
import ketnoidata.OrganizationDB;
import ketnoidata.PersonDB;
import module_import_dulieu.AggrementReadData;
import module_import_dulieu.CountryReadData;
import module_import_dulieu.EventReadData;
import module_import_dulieu.LocationReadData;
import module_import_dulieu.OrganizationReadData;
import module_import_dulieu.PersonReadData;
import module_import_dulieu.RandomQuanHe;

/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args )
    {
      DataBase a=new DataBase("localhost","admin","root","an.vt172933");
      OrientDB orient= a.remoteDatabase();
      ODatabaseSession db=a.connectDataBase(a.remoteDatabase());
      a.taoDoiTuong(db);
      a.taoQuanHe(db);
      a.closeConnectDB(orient, db);
      
      
      PersonReadData.readPersondata();
      AggrementReadData.readAggrementdata();
      EventReadData.readEventdata();
      CountryReadData.readCountrydata();
      LocationReadData.readLocationdata();
      OrganizationReadData.readOrganizationdata();
 
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,PersonDB.arrayPerson,"GapGo");
      RandomQuanHe.randomQuanHe(OrganizationDB.arrayOrganization,EventDB.arrayEvent,"ToChuc");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,EventDB.arrayEvent,"ToChuc");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,CountryDB.arrayCountry,"KiThoaThuan");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,OrganizationDB.arrayOrganization,"ThamGia");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,EventDB.arrayEvent,"ThamGia");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,AggrementDB.arrayAggrement,"ThamGia");
      RandomQuanHe.randomQuanHe(OrganizationDB.arrayOrganization,OrganizationDB.arrayOrganization,"ThamGia");
      RandomQuanHe.randomQuanHe(OrganizationDB.arrayOrganization,EventDB.arrayEvent,"ThamGia");
      RandomQuanHe.randomQuanHe(OrganizationDB.arrayOrganization,AggrementDB.arrayAggrement,"ThamGia");
      RandomQuanHe.randomQuanHe(EventDB.arrayEvent,LocationDB.arrayLocation,"DienRaTai");
      RandomQuanHe.randomQuanHe(EventDB.arrayEvent,CountryDB.arrayCountry,"DienRaTai");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,CountryDB.arrayCountry,"UngHo");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,AggrementDB.arrayAggrement,"UngHo");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,EventDB.arrayEvent,"UngHo");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,CountryDB.arrayCountry,"UngHo");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,EventDB.arrayEvent,"UngHo");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,AggrementDB.arrayAggrement,"UngHo");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,CountryDB.arrayCountry,"PhanDoi");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,EventDB.arrayEvent,"PhanDoi");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,AggrementDB.arrayAggrement,"PhanDoi");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,CountryDB.arrayCountry,"PhanDoi");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,EventDB.arrayEvent,"PhanDoi");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,AggrementDB.arrayAggrement,"PhanDoi");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,EventDB.arrayEvent,"PhatBieuTai");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,CountryDB.arrayCountry,"CangThangVoi");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,EventDB.arrayEvent,"UngHo");
      RandomQuanHe.randomQuanHe(PersonDB.arrayPerson,AggrementDB.arrayAggrement,"UngHo");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,EventDB.arrayEvent,"UngHo");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,AggrementDB.arrayAggrement,"UngHo");
      RandomQuanHe.randomQuanHe(CountryDB.arrayCountry,CountryDB.arrayCountry,"DamPhanVoi");
      System.out.println("Da xong");
      
    }
}
