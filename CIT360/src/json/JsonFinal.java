package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import mvc.EmployeeModel;

public class JsonFinal {

	private static final String filePath = "C:\\Users\\Zerin\\Desktop\\jsonFile.json";

	
	public static void main(String[] args) {


	    try {
	
	    	
	    	
	        JSONObject obj = new JSONObject();

	        obj.put("student_name","Harry Potter");
	        obj.put("degree", "BIO");
	        obj.put("roll", "104");
	        obj.put("phone", new Long(1234));

	        FileWriter out = new FileWriter(filePath);
	        //obj.writeJSONString(out);
	        
	        out.write(obj.toJSONString());
	        out.close();
	        
	        System.out.println("Successfully Copied JSON Object to File...");
	        System.out.println("\nJSON Object: " + obj);

	           	
	} catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    } catch (NullPointerException ex) {
        ex.printStackTrace();
    }
	    
	    try {
	    	
	    	FileReader reader = new FileReader(filePath);

	        JSONParser jsonParser = new JSONParser();
	        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
	        
	        // get a String from the JSON object
	        String student_name = (String) jsonObject.get("student_name");
	        System.out.println("The first name is: " + student_name);

	        String degree = (String) jsonObject.get("degree");
	        System.out.println("Their Degree is: " + degree);
	        
	        String roll = (String) jsonObject.get("roll");
	        System.out.println("Their Role is: " + roll);
	        
	        Long phone = (Long) jsonObject.get("phone");
	        System.out.println("Their Phone Number is: " + phone);
	        
	        
	        
	    	
	    } catch (FileNotFoundException ex) {
	        ex.printStackTrace();
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    } catch (ParseException ex) {
	        ex.printStackTrace();
	    } catch (NullPointerException ex) {
	        ex.printStackTrace();
	    }
	    
	    
	    
	    
	    
	}
}
