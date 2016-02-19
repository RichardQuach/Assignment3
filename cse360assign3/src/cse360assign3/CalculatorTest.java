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
	//checks if subtract function works
	public void testSubtract() {
		Calculator calculator = new Calculator();
		calculator.subtract(7);
		assertEquals(-7, calculator.getTotal());

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
	//checks if divide function works
	public void testDividebyZero() {
		Calculator calculator = new Calculator();
		calculator.add(30);
		calculator.divide(0);
		assertEquals(0, calculator.getTotal());
	}
	
	@Test
	//checks if history function works(just returns empty string for now)
	public void testgetHistory() {
		Calculator calculator = new Calculator();
		assertEquals("", calculator.getHistory());
	}
}
