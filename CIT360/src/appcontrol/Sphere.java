package appcontrol;

import java.text.DecimalFormat;

public class Sphere implements Calc {
	public void execute(Float input1) {
		double area3 = 4 * 3.14 * (Math.pow(input1, 2));
		area3 = Double.valueOf(new DecimalFormat("#.##").format(area3));
		System.out.println("The Area of a Sphere is: " + area3);
	}

}
