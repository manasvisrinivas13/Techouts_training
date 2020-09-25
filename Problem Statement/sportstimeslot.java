package sportslot;
import java.util.Scanner;

import sportslot.Badminton;
import sportslot.Football;
import sportslot.BoxCricket;

public abstract class sportstimeslot {
		
	public abstract void sportstimeslot();
	
	public static void main(String[] args) { 
		Badminton b = new Badminton();
		Football f = new Football();
		BoxCricket c = new BoxCricket();
		
		int s;
        Scanner sc= new Scanner(System.in); 
   
        System.out.println("The List of Sports:\n1.Badminton\n2.Football\n3.Box Cricket.\nSelect one number out of the three");
		s = sc.nextInt();
		
		switch(s)
		{
		case 1: {
			     System.out.println("BADMINTON\n");
			     b.sportstimeslot();
		        }
		          break;
		          
		case 2: {
			System.out.println("FOOTBALL\n");
			f.sportstimeslot();
		}
                  break;  
                  
		case 3: {
			System.out.println("BOX CRICKET");
			c.sportstimeslot();
		}
                  break;    
                  
        default: System.out.println("error!");          
		}

		
	}

}
