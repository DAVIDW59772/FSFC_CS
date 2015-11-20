package Arrays;

import java.util.*;

public class SortingTypes {

	public static void main(String[] args) {
	
		bubbleSort();
		insertionSort();
		
	}	
		
	static void bubbleSort() {
		
	int temp = 0;
	int passes = 0;
	int location = 0;
	int size = 0;
	int filled = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How many numbers in the array would you like?");
	size = sc.nextInt();
	
	int [] listOne = new int[size]; 
	
	for(filled = 0; filled < size; filled++) {
		listOne[filled] = (int)(Math.random()*100);
	}
	
	for(passes = 0; passes < listOne.length-1; passes++) {
		for(location = 0; location < listOne.length-1; location++) {
			if(listOne[location] > listOne[location+1]) {
				temp = listOne[location];
				listOne[location] = listOne[location+1];
				listOne[location+1] = temp;
			}
			
		}
	
	}
		
	System.out.println(Arrays.toString(listOne));
	
	}
	
	static void insertionSort() {
		int temp = 0;
		int size = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers in the array would you like?");
		size = sc.nextInt();
		
		int [] listTwo = new int[size]; 
		
		for(int filled = 0; filled < size; filled++) {
			listTwo[filled] = (int)(Math.random()*100);
		}
		
		for(int position = 1; position < listTwo.length;++position) {
			while(position > 0 && listTwo[position] < listTwo[position-1]) {
				temp = listTwo[position];
				listTwo[position] = listTwo[position-1];
				listTwo[position-1] = temp;
				--position;
			}
		}
		
		System.out.println(Arrays.toString(listTwo));
		
	}
	
}

