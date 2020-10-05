import java.util.Scanner;

class AssertionError extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AssertionError(String s){
		super(s);
	}
}


public class Operations{
	
	public double calculate() throws AssertionError {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("WHat would you like to caluclate today");
		System.out.println("");
		int a = sc.nextInt();
		String x = sc.next();
		int b = sc.nextInt();
		
		
		switch(x) {
		case "+": 
			final double plus= (double) a+b;
			return plus;
		case "-":
			final double minus = a-b;
			return minus;
		case"*": 
			final double multiply = a*b;
			return multiply;
		case"/":
			final double divide = a/b;
			return divide;
		default: throw new AssertionError("Not a valid input");
		}
		
		
		
	}
	
	
}


class que21 extends Operations
{
	public static void main(String[] args) throws AssertionError 
	{
		Operations ops = new Operations();
		System.out.println(ops.calculate());
	}

}