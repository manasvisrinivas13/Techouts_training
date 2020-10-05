import java.util.Scanner;

public class invaliduser extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	invaliduser(String s)
	{super(s);}
}

class TestException
{
	public void validateUserName(String s) throws invaliduser
	{
		if(s.length()<10 || s.contains("&"))
		{
			throw new invaliduser("Invalid username");
	    }
		else
		{
			System.out.println("Welcome "+ s);
		}
	}


	public static void main(String[] args) throws invaliduser
	{
		Scanner sc = new Scanner(System.in);
		TestException te = new TestException();
		
		System.out.print("Enter Username");
		String s = sc.next();
		sc.close();
		te.validateUserName(s);
	}
}