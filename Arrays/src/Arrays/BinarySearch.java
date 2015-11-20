package Arrays;

import java.util.Scanner;

public class BinarySearch {
	
	public static void input() {
		int filled = 0;
		int size = 0;
		int sV = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers in the array would you like?");
		size = sc.nextInt();
		
		int [] listOne = new int[size];
		
		for(filled = 0; filled < size; filled++) {
			listOne[filled] = (int)(Math.random()*100);
		}
			
		System.out.println("What number would you like to search for within the array?");
		sV = sc.nextInt();
		
	}
	
	public static void main(String[] args) {
		
		String result = binarySearch(listOne, sV)?"Value found within array." :"Value not found within array";
		System.out.println(result);
	
	}
	
	public static boolean binarySearch(listOne,sV) {
		input();
		int left = 0;
		int right = listOne.length-1;
		
		for(int i = 0; i < array.lenght; i++) {                                                                                                                                                                                                                                                                                                                                                                            
				int middle = (right + left)/2;
				if (array[middle] == sV) {
					return true;
				} else if (array[middle] > sV) { 
					end = middle - 1;
				} else {
					start = middle + 1;
				}
	
		}
		return false;
	
	}
}