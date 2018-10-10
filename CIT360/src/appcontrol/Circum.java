package appcontrol;

import java.text.DecimalFormat;

public class Circum implements Calc {
		public void execute(Float input1) {
			double cirumference = 2 * 3.14 * input1;
			cirumference = Double.valueOf(new DecimalFormat("#.##").format(cirumference));
			System.out.println("The Circumference of a Circle is: " + cirumference);
		}
		
}
