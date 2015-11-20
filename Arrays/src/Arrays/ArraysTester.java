/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author CompUser
 *
 */
public class ArraysTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//arrayTestOne();
		//arrayTestTwo();
		arrayTestThree();
		
	}	
	
	static void arrayTestOne() {
		double[] myListOne = {3.5, 5.99, 3.8, 8.69, 23.4};
		for (int i = 0; i < myListOne.length; i++) {
			System.out.println(myListOne[i]);
		}
		
		double total = 0;
		
		for(int i = 0; i < myListOne.length; i++) {
			total += myListOne[i];
		}
		
		System.out.println("Total of array is " + total + ".");
		
		double max = myListOne[0];
		for(int i = 1; i < myListOne.length; i++) {
			if(myListOne[i] > max) {
				max = myListOne[i];


		System.out.println("Largest value is " + max + ".");
			}
			

		}
	}
	
	static void arrayTestTwo() {
		
		int r;
		int c;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("How many rows do you want?");
		r = sc.nextInt();

		System.out.println("How many columns would you like?");
		c = sc.nextInt();
		
		int[][] bigArray = new int[r][c];
		
		for(int rows = 0; rows < r; rows++) {
			for(int columns = 0; columns < c; columns++) {
				System.out.println("What number would you like to to input into array location [" + rows +"][" + columns + "]");
				bigArray[rows][columns] = sc.nextInt();
				System.out.println("Thank you.");
			}
		}
		sc.close();
	}

	static void arrayTestThree(){
		
		int r;
		int c;
		
		
		int rows = 5;
		int columns = 3;
		
		int[][] bowlingArray = new int[rows][columns];
		
		Scanner sc = new Scanner(System.in);
		
		for(r = 0; r < rows; r++) {
			for(c = 0; c < columns; c++) {
				System.out.println("What is score number " + (c+1) + " of player number " + (r+1) + "?");
				bowlingArray[r][c] = sc.nextInt();
				System.out.println("Thank you.");
			}
		}
		for(r = 0; r < rows; r++) {
			for(c = 0; c < columns; c++) {
				System.out.print(bowlingArray[r][c]);
			}
		}
		sc.close();
	}
	
}
