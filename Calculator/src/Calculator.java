/**
 * 
 */

/**
 * @author CompUser
 *
 */

public class Calculator {
	private float numberOne;
	private float numberTwo;


	public Calculator(){}

	public float getNumberOne(){
		return this.numberOne;
	}
	public void setNumberOne(float n1){
		this.numberOne = n1;
	}
	public float getNumberTwo(){
		return this.numberTwo;
	}
	public void setNumberTwo(float n2){
		this.numberTwo = n2;
	}
	
	public float add(){
		return numberOne + numberTwo;
	}
	public float subtract(){
		return numberOne - numberTwo;
	}
	public float multiply(){
		return numberOne * numberTwo;
	}
	public float divide(){
		return this.numberOne / numberTwo;
	}
	
}
