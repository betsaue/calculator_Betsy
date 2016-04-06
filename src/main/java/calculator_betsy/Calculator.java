package calculator_betsy;

public class Calculator {
	
	public double add(double a , double b ){
		double sum = (a+b);
		System.out.println("Sum of "+a +" and " +b +" : " + sum);
		System.out.println();
		return sum;
	}
	
	public double sub(double a , double b ){
		
		double diff = (a-b);
		System.out.println("Difference of "+a +" and " +b +" : " + diff);
		System.out.println();
		return diff;
	}

	public double mul(double a , double b ){
	
		double product = (a*b);
		System.out.println("Product of "+a +" and " +b +" : " + product);
		System.out.println();
		return product;
	}

	public double div(double a , double b ){
	
		double div = (a/b);
		System.out.println("Divident of "+a +" and " +b +" : "+ div);
		System.out.println();
		return div;
	}

}
