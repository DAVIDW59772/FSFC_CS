/**
 * 
 */

/**
 * @author CompUser
 *
 */
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		fibonacciSequence();
	
	}
	
	static void fibonacciSequence() {
		
		int totalNumbers;
		int lastNumber = 1;
		int secondLastNumber = 0;
		int i = 0;
		int printedNumber = 1;
		
		Scanner linesInput = new Scanner(System.in);
		try {
			System.out.println("How many fibonacci numbers would you like?");
			totalNumbers = linesInput.nextInt();
		} finally {
			linesInput.close();
		}
			
		for(i = 1; i <= totalNumbers; i++) {
			System.out.println(i + " " + printedNumber);
			printedNumber = lastNumber + secondLastNumber;
			secondLastNumber = lastNumber;
			lastNumber = printedNumber;
			
		}
		
	}
	
}

