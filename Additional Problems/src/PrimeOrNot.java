/**
 * 
 */

/**
 * @author CompUser
 *
 */

import java.util.*;

public class PrimeOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		primeTester();
		
	}

	static void primeTester() {
		
		int inputtedNum;
		int i;
		
		Scanner numInput= new Scanner(System.in);
		try {
			System.out.println("What number would you like to test for being prime?");
			inputtedNum = numInput.nextInt();
		} finally {
			numInput.close();
		}
		
		for(i = 0; i <= inputtedNum; i++) {
//			inputtedNum/i;
		}
			
	
	}
	
}
