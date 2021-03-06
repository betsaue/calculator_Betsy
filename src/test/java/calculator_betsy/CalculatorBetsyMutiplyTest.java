package calculator_betsy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorBetsyMutiplyTest {

	Calculator cal = new Calculator();

	@Test
	public void multiplytest1() {
		assertEquals("Unexepected error during mutiplication", 4.84, cal.mul(2.2,2.2), 0.001d );	
	}

	@Test
	public void multiplytest2() {
		assertEquals("Unexepected error during mutiplication", -4.84, cal.mul(-2.2,2.2), 0.001d );
	}
	
	@Test
	public void multiplytest3() {
		assertEquals("Unexepected error during mutiplication", 4.84, cal.mul(-2.2,-2.2), 0.01d );
	}
	
	@Test
	public void multiplytest4() {
		assertEquals("Unexepected error during mutiplication", 0, cal.mul(-0,45.5), 0.0d );
	}
	
	@Test
	public void multiplytest5() {
		assertEquals("Unexepected error during mutiplication", 23554.20, cal.mul(100.99,233.233), 0.001d );
	}

}
