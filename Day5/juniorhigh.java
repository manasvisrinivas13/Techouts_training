package school;
import school.student;
import school.staff;
import school.studentmarks;

import java.io.IOException;
import java.util.Scanner;

import school.founders;

public abstract class juniorhigh
 { 
	public abstract void profile();

	public static void main (String[] args) throws IOException 
	{  
		{ 
			founders fo = new founders();
	        fo.profile();
	    }
		
	float sal;
	
		try (Scanner in = new Scanner(System.in))
	   {
			{
				student p = new student();
			    p.profile();
			    p.marks();
			}
			
			System.out.println("enter salary of the staff");
			sal = in.nextFloat();
		}

		staff s = new staff();
		s.profile();
		s.salary(sal);
		
		}

	
}
