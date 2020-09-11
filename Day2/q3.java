import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		int marks;
		try (Scanner console = new Scanner(System.in)) {
			System.out.print("Enter test score : ");
			  marks = console.nextInt();
		}
		
	      if(marks>50)
		{ System.out.print("PASS!");
		}
		else if (marks<=50)
		{ System.out.print("FAIL :( ");}
	}

}
