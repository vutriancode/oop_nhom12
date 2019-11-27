package module_import_dulieu;

import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class ReaderCsv {
	public static ArrayList<String[]> readDataLineByLine(String file) 
	{ 
	  
	    try { 
	        // Create an object of filereader 
	        // class with CSV file as a parameter. 
	        FileReader filereader = new FileReader(file); 
	  
	        // create csvReader object passing 
	        // file reader as a parameter 
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord;
	        ArrayList<String[]> k=new ArrayList<String[]>();
	  
	        // we are going to read data line by line 
	        while ((nextRecord = csvReader.readNext()) != null) { 
	             k.add(nextRecord); 
	        } 
	        return k;
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    }
		return null; 
	}
}
