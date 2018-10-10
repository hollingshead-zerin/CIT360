package appcontrol;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Float input1;
		String operator;
		
		System.out.println("Enter the radius of a circle: ");
		input1 = Float.parseFloat(input.nextLine());
		
		System.out.println("Enter the calculation you want to do: (a, c or s)" );
		operator = input.nextLine();
		
		
		
		Controller.handleOperator(operator, input1);
		
		
		input.close();
		
	}

}
