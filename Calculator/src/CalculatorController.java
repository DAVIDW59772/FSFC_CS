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
			
		Calculator davidsCalculator = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first number");
		Float firstNum=sc.nextFloat();
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("What is your second number");
		Float secondNum=sc1.nextFloat();
		
		davidsCalculator.setNumberOne(firstNum);
		davidsCalculator.setNumberOne(secondNum);
			
		System.out.println("Adding " + firstNum + " and " + secondNum + " gives you " + davidsCalculator.add());
		System.out.println("Subtract " + firstNum + " and " + secondNum + " gives you " + davidsCalculator.subtract());
		System.out.println("Multiplying " + firstNum + " and " + secondNum + " gives you " + davidsCalculator.multiply());
		System.out.println("Dividing " + firstNum + " and " + secondNum + " gives you " + davidsCalculator.divide());
			
	}

}
