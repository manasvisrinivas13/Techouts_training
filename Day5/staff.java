package school;

import java.util.Scanner;

class staff {
	
	public void profile() {
		
		 int id;
			String name;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("enter staff ID");
			id = in.nextInt();
			System.out.println("enter name.");
			name = in.next();
		}
	    
	     
	    System.out.println("staff ID:"+id);
	    System.out.println("Name:"+name);
	    
	}
	
 public void salary(float sal) {
	 
	 double tax = 0;
	 
	if (sal>=80000) 
	{
	  	tax = sal*0.21;
	}
	else if (sal<80000) 
	{
		tax = sal*0.15;
	}
	else
		System.out.println("wrong salary value!");
	
	System.out.println("your salary is "+sal+".\nThe tax is "+tax);
	
}
}
