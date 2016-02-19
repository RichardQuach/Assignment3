package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	//checks if calculator does not return null
	public void testCalculator() {
		Calculator calculator = new Calculator();
		assertNotNull(calculator);
	}
	
	@Test
	//checks total
	public void testTotal() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.getTotal());
	}

	@Test
	//checks if add function works
	public void testAdd() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		assertEquals(5, calculator.getTotal());
	}
	
	@Test
	//checks if add function works adding negatives
	public void testAddNegative() {
		Calculator calculator = new Calculator();
		calculator.add(69);
		calculator.add(-68);
		assertEquals(1, calculator.getTotal());
	}
	
	
	@Test
	//checks if subtract function works
	public void testSubtract() {
		Calculator calculator = new Calculator();
		calculator.subtract(7);
		assertEquals(-7, calculator.getTotal());

	}
	
	@Test
	//checks if add function works adding negatives
	public void testSubtractNegative() {
		Calculator calculator = new Calculator();
		calculator.add(69);
		calculator.subtract(-68);
		assertEquals(137, calculator.getTotal());
	}
	
	
	@Test
	//checks if multiply function works
	public void testMultiply() {
		Calculator calculator = new Calculator();
		calculator.add(5);
		calculator.multiply(4);
		assertEquals(20, calculator.getTotal());
	}
	
	@Test
	//checks if divide function works
	public void testDivide() {
		Calculator calculator = new Calculator();
		calculator.add(30);
		calculator.divide(6);
		assertEquals(5, calculator.getTotal());
	}
	
	@Test
	//checks if integer division works
	public void testIntegerDivision() {
		Calculator calculator = new Calculator();
		calculator.add(13);
		calculator.divide(2);
		assertEquals(6, calculator.getTotal());
	}
	
	@Test
	//checks if divide function works
	public void testDividebyZero() {
		Calculator calculator = new Calculator();
		calculator.add(30);
		calculator.divide(0);
		assertEquals(0, calculator.getTotal());
	}
	
	@Test
	//checks if add function works adding negatives
	public void testDividewhenZero() {
		Calculator calculator = new Calculator();
		calculator.add(69);
		calculator.divide(0);
		calculator.divide(6);
		assertEquals(0, calculator.getTotal());
	}
	
	@Test
	//checks if still total rest works for additional operations after dividing by zero
	public void testAfterDividebyZero() {
		Calculator calculator = new Calculator();
		calculator.add(10);
		calculator.subtract(-19);
		calculator.divide(0);
		calculator.add(-20);
		calculator.multiply(-6);
		assertEquals(120, calculator.getTotal());
	}
	
	@Test
	//checks getHistory
	public void testgetHistory() {
		Calculator calculator = new Calculator();
		assertEquals("0", calculator.getHistory());
	}
	
	@Test
	//checks if history function works with add
	public void testgetHistoryAddition() {
		Calculator calculator = new Calculator();
		calculator.add(69);
		assertEquals("0 + 69", calculator.getHistory());
	}
	
	@Test
	//checks if history function works with subtract
	public void testgetHistorySubtraction() {
		Calculator calculator = new Calculator();
		calculator.add(69);
		calculator.subtract(-12);
		assertEquals("0 + 69 - -12", calculator.getHistory());
	}
	
	@Test
	//checks if history function works with multiply
	public void testgetHistoryMultiply() {
		Calculator calculator = new Calculator();
		calculator.add(69);
		calculator.subtract(32);
		calculator.multiply(-4);
		assertEquals("0 + 69 - 32 * -4", calculator.getHistory());
	}
	
	@Test
	//checks if history function works with divide
	public void testgetHistoryDivide() {
		Calculator calculator = new Calculator();
		calculator.add(69);
		calculator.subtract(18);
		calculator.multiply(3);
		calculator.divide(2);
		assertEquals("0 + 69 - 18 * 3 / 2", calculator.getHistory());
	}
	
	@Test
	//checks history function as given in the example
	public void testgetHistoryExample() {
		Calculator calculator = new Calculator();
		calculator.add(4);
		calculator.subtract(2);
		calculator.multiply(2);
		calculator.add(5);
		assertEquals("0 + 4 - 2 * 2 + 5", calculator.getHistory());
	}
	
	@Test
	//checks if it can handle a decently sized amount of operations
	public void testAmount(){
		Calculator calculator = new Calculator();
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.add(2);
		calculator.divide(2);
		calculator.multiply(2);
		calculator.subtract(1);
		calculator.subtract(1);
		calculator.subtract(1);
		calculator.subtract(1);
		calculator.subtract(1);
		calculator.subtract(1);
		calculator.subtract(1);
		calculator.subtract(1);
		calculator.subtract(1);
		calculator.subtract(1);
		calculator.subtract(1);
		
		assertEquals(25, calculator.getTotal());
	}
}
