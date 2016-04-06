package calculator_betsy;

public class Main {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.add(3.0,7.5);
		cal.sub(8.2, 5.0);
		cal.mul(4.4, 2.2);
		cal.div(8.0, 2.0);
		
		cal.add(100.99, 233.233);
		cal.mul(3.3, 3.3);

	}

}
