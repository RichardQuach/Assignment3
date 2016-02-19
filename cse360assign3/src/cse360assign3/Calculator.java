
package cse360assign3;

/**
 * 
 * @author Richard Quach
 * @version February 19, 2016
 * pin: 712
 * 
 * Calculator performs mathematical operations to a total.
 */
public class Calculator {

	//this will be the total for the calculator
	private int total;
	
	//this is the string for the history of operations performed. It starts at 0
	private String history = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * returns the total from the calculator
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * adds a given value to the total
	 * @param value
	 */
	public void add (int value) {
		total += value;
		history = history + " + " + value;		//append to history string
	}
	
	/**
	 * subtracts a given value from the total
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;		//append to history string
	}
	
	/**
	 * multiples a given value to the total
	 * @param value
	 */
	public void multiply (int value) {
		total *= value;
		history = history + " * " + value;		//append to history string
	}
	
	/**
	 * divides a given value from the total
	 * @param value
	 */
	public void divide (int value) {			//append to history string
		if (value == 0) {						//if divide by 0 total -> 0
			total = 0;
		}
		else{						
			total /= value;
		}
		history = history + " / " + value;		//append to history string
	}
	
	/**
	 * returns a string of the history of calculations performed
	 * @return history
	 */
	public String getHistory () {
		return history;
	}
}
