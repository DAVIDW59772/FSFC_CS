import java.util.*;

public class CalculatorController {

	public static void main(String[] args) {
		float nOne, nTwo;
		
		Calculator davidsCalculator = new Calculator();
		
		nOne = Float.parseFloat(args[0]);
		nTwo = Float.parseFloat(args[1]);
		
		davidsCalculator.setNumberOne(nOne);
		davidsCalculator.setNumberOne(nTwo);
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		
		System.out.println("Adding " + davidsCalculator.add());
		System.out.println("Subtract " + davidsCalculator.subtract());
		System.out.println("Adding " + davidsCalculator.divide());
		System.out.println("Adding " + davidsCalculator.multiply());
		
		
	
	}
}
