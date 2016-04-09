package calculator_betsy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorBetsyDivisionTest {

	Calculator cal = new Calculator();

	@Test
	public void divisiontest1() {
		assertEquals("Unexepected error during division", 1, cal.div(2.2,2.2), 0.001d );
		
	}

	@Test
	public void divisiontest2() {
		assertEquals("Unexepected error during division", -1, cal.div(-2.2,2.2), 0.001d );
	}
	
	@Test
	public void divisiontest3() {
		assertEquals("Unexepected error during division", 1 , cal.div(-2.2,-2.2), 0.01d );
	}
	
	@Test
	public void divisiontest4() {
		assertEquals("Unexepected error during division", 0, cal.div(-0,45.5), 0.0d );
	}
	
	@Test
	public void divisiontest5() {
		assertEquals("Unexepected error during division", (45.5/0.0) , cal.div(45.5,0.0), 0.0d );
	}
	
	@Test
	public void divisiontest6() {
		assertEquals("Unexepected error during division", 0.433, cal.div(100.99,233.233), 0.001d );
	}

}
