package Consumerex1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ques25 {
	
	
	
	Consumer<ArrayList<Integer>> multiply2 = list->list.forEach(a-> System.out.print(a*2+" "));
	

  	
	Consumer<ArrayList<Integer>> dispList = 
			list -> list.stream().forEach(a -> System.out.print(a + " ")); 


			
			
			
}
class consumer
{
	public static void main(String[] args)
	{
		ques25 Obj = new ques25();
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i=1;i<11;i++) {
			intList.add(i);
		}
		System.out.println("Displaying 1-10 from list\n"+intList);
		try
		{
			System.out.println("Displaying 1-10 using consumer interface");
			Obj.dispList.accept(intList);
			System.out.println("\nDisplaying doubling of 1-10 using consumer interface");
			Obj.multiply2.accept(intList);
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
