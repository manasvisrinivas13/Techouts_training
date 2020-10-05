package Consumerex1;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ques24
{
	
	Consumer<ArrayList<Integer>> threeseven = (x) -> {
        for(int num: x) {
            if (!(num > 3 && num < 7)) 
            {System.out.println(num);}
    } };
}
class mainex
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		ques24 Obj = new ques24();
		for(int i=1;i<=10;i++) 
		{  numlist.add(i);}
		Obj.threeseven.accept(numlist);
		
		
	}
}