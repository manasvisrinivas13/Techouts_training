package sportslot;

import java.util.HashMap;
import java.util.Scanner;


public class Badminton extends sportstimeslot
{

	public void sportstimeslot()
	{
		HashMap<String, String> slot = new HashMap<String, String>();
        String t, name;
		Scanner in = new Scanner(System.in);
	    // Add keys and values (time, name)
	    slot.put("11:00am", "");
	    slot.put("12:00pm", "");
	    slot.put("3:00pm", "");
	    slot.put("4:00pm", "");
	    slot.put("5:00pm", "");
	    slot.put("6:00pm", "");
	    slot.put("2:00pm", "");
	    slot.put("1:00pm", "");
	    slot.put("9:00am", "");
	    slot.put("10:00am", "");
	    System.out.println("The Time slots:");
	    
	    for (String i : slot.keySet()) {
	    	  System.out.print(i+" ");
	    	}
	    System.out.println("\nEnter the time slot");
	    t = in.next();
	    System.out.println("enter the name");
	    name = in.next();
	    slot.put(t, name);
	    System.out.println("The Details are:\nName :"
	    	   +name+"\nSport :Badminton\ntime slot taken :"+t);
	    slot.remove(t);
 System.out.println("\nTime slots Remaining:");
	    
	    for (String i : slot.keySet()) {
	    	  System.out.print(i+" ");
	    	}
		
	}
   
}
