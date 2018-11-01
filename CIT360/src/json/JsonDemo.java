package json;

import java.io.FileWriter;
import java.io.IOException;
//import java.io.StringWriter;

import org.json.simple.JSONObject;

class JsonDemo {

   public static void main(String[] args) throws IOException{
	
      JSONObject obj = new JSONObject();

      obj.put("student_name","Harry Potter");
      obj.put("degree", "BIO");
      obj.put("roll", "104");
      obj.put("phone", new Integer(1234));

      FileWriter out = new FileWriter("C:\\Users\\Zerin\\Desktop\\jsonFile.json");
      //obj.writeJSONString(out);
      
      out.write(obj.toJSONString());
      out.close();
      
      System.out.println("Successfully Copied JSON Object to File...");
      System.out.println("\nJSON Object: " + obj);
      
      //String jsonText = out.toString();
      //System.out.print(jsonText);
   }
}

