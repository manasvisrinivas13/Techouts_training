package school;
import java.util.*;
	
import java.util.Scanner;

public interface studentmarks 
{
     default void marks() 
 {   
    	 int i;
   try (Scanner sn = new Scanner(System.in)) 
   {

   String[] arrayname=new String[5];
	   System.out.println("enter the marks of the student");
	   for(i=0;i<arrayname.length;i++)
	   {
		  arrayname[i]= sn.next();
	   }
	   System.out.println("The marks "+Arrays.toString(arrayname));
   }
 }
}
