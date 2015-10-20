/**
 * 
 */

/**
 * @author CompUser
 *
 */

import java.util.*;

public class CalculatorController {

	public static void main(String[] args) {
		float nOne, nTwo;
			
		Calculator davidsCalculator = new Calculator();
			
		nOne = Float.parseFloat(args[0]);
		nTwo = Float.parseFloat(args[1]);
		
		davidsCalculator.setNumberOne(nOne);
		davidsCalculator.setNumberOne(nTwo);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first number");
		String firstNum=sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("What is your second number");
		String secondNum=sc1.nextLine();
			
		System.out.println("Adding " + davidsCalculator.add());
		System.out.println("Subtract " + davidsCalculator.subtract());
		System.out.println("Multiplying " + davidsCalculator.multiply());
		System.out.println("Dividing " + davidsCalculator.divide());
			
	}

}
