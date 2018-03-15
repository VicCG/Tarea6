package lambda;

public class Lambda {
	
	interface Calculadora{
		double operation(double a, double b);
	}
	
	private double operate(double a, double b, Calculadora c) {
		return c.operation(a, b);
	}

	public static void main(String[] args) {
		Lambda l=new Lambda();
		
		// TODO Auto-generated method stub
		Calculadora suma=(double a, double b)->(a+b);
		Calculadora resta=(double a, double b)->(a-b);
		Calculadora mult=(double a, double b)->(a*b);
		Calculadora div=(double a, double b)->{
			if(b!=0)
				return a/b;
			return 0;
		};
		
		System.out.println(l.operate(1, 2, suma));
		System.out.println(l.operate(1, 2, resta));
		System.out.println(l.operate(1, 2, mult));
		System.out.println(l.operate(1, 2, div));
	}

}
