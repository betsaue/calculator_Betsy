package calculator_betsy;

public class Calculator {
	
	public double add(double a , double b ){
		double sum = (a+b);
		System.out.println("Sum : " + sum);
		return sum;
	}
	
	public double sub(double a , double b ){
		
		double diff = (a-b);
		System.out.println("Difference : " + diff);
		return diff;
	}

	public double mul(double a , double b ){
	
		double product = (a*b);
		System.out.println("Product : " + product);
		return product;
	}

	public double div(double a , double b ){
	
		double div = (a/b);
		System.out.println("Divident : " + div);
		return div;
	}

}
