package calculator_betsy;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorBetsyAddSubMulDiv {
	double a = 0.0;
	double b = 0.0;
	Calculator cal = new Calculator();

	@Test
	public void addtest1() {
		assertEquals("Unexepected error during addition", 4.4, cal.add(2.2,2.2), 0.0d );
		
	}

	@Test
	public void addtest2() {
		assertEquals("Unexepected error during addition", 0.0, cal.add(-2.2,2.2), 0.0d );
	}
	
	@Test
	public void addtest3() {
		assertEquals("Unexepected error during addition", -4.4, cal.add(-2.2,-2.2), 0.0d );
	}
	
	@Test
	public void addtest4() {
		assertEquals("Unexepected error during addition", -0, cal.add(-0,0), 0.0d );
	}
	
	@Test
	public void addtest5() {
		assertEquals("Unexepected error during addition", 0, cal.add(-0,0), 0.0d );
	}
}
