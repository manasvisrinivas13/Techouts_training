import java.util.Scanner;

//This is a Functional Interface
interface company
{
	public default double profitcal(double CP, double SP)
	{
		@SuppressWarnings("unused")
		Double profit;
		return profit = CP-SP;
	}
	
	
	void getCompDetails(double p, String s);
	
	public static String companyName(String s)
	{
		System.out.println("Company Name: ABC");
		return s;
	}
	
}

class NewCompany implements company{

	@Override
	public void getCompDetails(double p, String s) {
	}
}



public class que22 {

	public static void main(String[] args)
	{
		NewCompany ABC = new NewCompany();
		double profit = ABC.profitcal(150000.54,40000.82);
		String name = company.companyName("ABC");

		company comp1 = (p, n)-> {
			System.out.println("The company "+n+" has made a profit of $"+p+" this financial year");
		};
		
		comp1.getCompDetails(profit, name);
		
		
		
	}
	
}
