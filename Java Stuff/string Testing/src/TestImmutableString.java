
public class TestImmutableString {
	public static void main(String args[]){
		String titleOne = "Operation Flashpoint";
		String titleTwo = "Operation Flashpoint";
		String titleThree = "Cold War Assualt";
		String titleFour = new String("Operation Flashpoint");
		String str = "Marksman";
		String subStringOne = str.substring(0,5);
		String subStringTwo = titleThree.substring(6);
		
		System.out.println(titleThree.substring(0,4));
		
		System.out.println(titleOne == titleTwo);
		
		System.out.println(titleOne == titleFour);
		
		System.out.println(subStringOne);
		
		System.out.println(subStringTwo);
	}
}
