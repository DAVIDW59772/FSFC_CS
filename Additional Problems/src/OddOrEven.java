/**
 * 
 */

/**
 * @author CompUser
 *
 */

import java.util.*;

public class OddOrEven {

	public static void main(String[] args) {
		
		oddOrEven();
		
	}
	
	static void oddOrEven() {
		
		int number;
		int r;
		
		Scanner inputtedNum = new Scanner(System.in);
		try {
			System.out.println("What number would you like to test for being even or odd?");
			number = inputtedNum.nextInt();

		} finally {
			inputtedNum.close();
		}
		r = number%2;
		if(r == 0) {
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}
		

	}

	
}
