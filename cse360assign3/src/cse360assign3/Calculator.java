
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

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * gets the total value
	 * @return
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
	}
	
	/**
	 * subtracts a given value from the total
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		
	}
	
	/**
	 * multiples a given value to the total
	 * @param value
	 */
	public void multiply (int value) {
		total *= value;
		
	}
	
	/**
	 * divides a given value from the total
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0){
			total = 0;
		}
		else{
			total /= value;
		}
		
	}
	
	/**
	 * returns a string of the history of calculations performed
	 * @return
	 */
	public String getHistory () {
		return "";
	}
}
