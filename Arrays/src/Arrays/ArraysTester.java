/**
 * 
 */
package Arrays;

/**
 * @author CompUser
 *
 */
public class ArraysTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		arrayTestOne();
	
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

			}
		System.out.println("Larget value is " + max + ".");

		}
	}
}