import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 *
 */
public class Palindrome {
	
	public static void main(String[] args) {
		 
		palindromeTester();
		
	}
	
	static void palindromeTester() {
		
		String word;
		String reversedWord;
		
		
		Scanner wordInput = new Scanner(System.in);
		try {
			System.out.println("What single word would you like to test to see if it is a palindrome?");
			word = wordInput.nextLine();
		} finally {
			wordInput.close();
		}
		
		reversedWord = new StringBuilder(word).reverse().toString();
		
		if(reversedWord.equals(word)) {
			System.out.println("The word is a palindrome");	
		} else {
			System.out.println("The word is not a palindrome");
		}
		
	}
		

}
