import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		int num, rev = 0;

		try (Scanner console = new Scanner(System.in)) {
			System.out.print("Enter the number ");
			num = console.nextInt();
			
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + rev);
        }
    }
} 
	
