import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		int base,power;
		    try (Scanner console = new Scanner(System.in)) {
				System.out.print("Enter the base number ");
				base = console.nextInt();
				System.out.print("Enter the power ");
				power = console.nextInt();
			}
			
		    int result=1;
			for (int i=0; i<power; i++) 
			{
		    	result=result*base;
		    }
			System.out.print(result);
		
		
	}

}
