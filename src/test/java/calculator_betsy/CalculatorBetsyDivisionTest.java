package calculator_betsy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorBetsyDivisionTest {

	Calculator cal = new Calculator();

	@Test
	public void multiplytest1() {
		assertEquals("Unexepected error during division", 1, cal.div(2.2,2.2), 0.001d );
		
	}

	@Test
	public void multiplytest2() {
		assertEquals("Unexepected error during division", -1, cal.div(-2.2,2.2), 0.001d );
	}
	
	@Test
	public void multiplytest3() {
		assertEquals("Unexepected error during division", 1 , cal.div(-2.2,-2.2), 0.01d );
	}
	
	@Test
	public void multiplytest4() {
		assertEquals("Unexepected error during division", 0, cal.div(-0,45.5), 0.0d );
	}
	
	@Test
	public void multiplytest5() {
		assertEquals("Unexepected error during division", ∞ , cal.div(45.5,0.0), 0.0d );
	}
	
	@Test
	public void multiplytest6() {
		assertEquals("Unexepected error during division", 0.433, cal.div(100.99,233.233), 0.001d );
	}

}
