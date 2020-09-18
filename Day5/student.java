package school;
import java.util.Scanner;

class student extends juniorhigh {
	 int id;
	String name;
	
	@Override
			public void profile() {
				try (Scanner in = new Scanner(System.in)) {
					System.out.println("enter student ID");
					id = in.nextInt();
					System.out.println("enter name.");
					name = in.next();
				}
			    
			     
			    System.out.println("student ID:"+id);
			    System.out.println("Name:"+name);
			  
				
	}

	

}
