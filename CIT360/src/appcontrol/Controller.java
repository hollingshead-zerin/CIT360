package appcontrol;

import java.util.HashMap;

public class Controller {

	public static HashMap<String, Calc> key =new HashMap <String, Calc>();
	
	public void Controller() {
		
	}
	
	public static void handleOperator(String operator, Float input1) {
		key.put("a", new Area());
		key.put("c", new Circum());
		key.put("s", new Sphere());
		
		Calc handler = key.get(operator);
		handler.execute(input1);
		
	}
	
	//https://www.youtube.com/watch?v=AcOkhFGpiek
	
}
