package calculator_betsy;

import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorBetsySubtractTest {

	Calculator cal = new Calculator();

	@Test
	public void subtracttest1() {
		assertEquals("Unexepected error during subtraction", 0.0, cal.sub(2.2,2.2), 0.0d );
		
	}

	@Test
	public void subtracttest2() {
		assertEquals("Unexepected error during subtraction", -4.4, cal.sub(-2.2,2.2), 0.0d );
	}
	
	@Test
	public void subtracttest3() {
		assertEquals("Unexepected error during subtraction", 0, cal.sub(-2.2,-2.2), 0.0d );
	}
	
	@Test
	public void subtracttest4() {
		assertEquals("Unexepected error during subtraction", 0, cal.sub(-0,0), 0.0d );
	}
	
	@Test
	public void subtracttest5() {
		assertEquals("Unexepected error during subtraction", -132.24, cal.sub(100.99,233.233), 0.010d );
	}


}
