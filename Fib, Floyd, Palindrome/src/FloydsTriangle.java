/**
 * 
 */

/**
 * @author CompUser
 *
 */
import java.util.*;

public class FloydsTriangle {

	public static void main(String[] args) {
		
		floydsTriangle();
		
	}
	
	static void floydsTriangle() {
		
		int requestedRows;
		int currentRow;
		int numbersInRow;
		int number = 1;
		
		Scanner rowsInput = new Scanner(System.in);
		try {
			System.out.println("How many levels of Floyd's Triangle would you like?");
			requestedRows = rowsInput.nextInt();
		} finally {
			rowsInput.close();
		}
		
		for(currentRow = 1; currentRow <= requestedRows; currentRow++) {
			for(numbersInRow = 1; numbersInRow <= currentRow; numbersInRow++) {
				System.out.print(number+" ");
				number++;
			}
		
			System.out.println();
			
		}
		
	}
	
}
