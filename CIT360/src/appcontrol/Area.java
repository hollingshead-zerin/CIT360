package appcontrol;

import java.text.DecimalFormat;

public class Area implements Calc {
	public void execute(Float input1) {
		double area = 3.14 * Math.pow(input1,2);
		area = Double.valueOf(new DecimalFormat("#.##").format(area));
		System.out.println("The Area of the Circle: " + area);
	}
	
}
