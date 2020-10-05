import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

class Sapi 
{
	IntStream a = IntStream.of(1,2,3,4,5,6,7,8,9);
	IntStream b = IntStream.of(1,2,3,4,5,6,7,8,9);
	IntStream c = IntStream.of(1,2,3,4,5,6,7,8,9);
	IntStream d = IntStream.of(1,2,3,4,5,6,7,8,9);
	IntStream e = IntStream.of(1,2,3,4,5,6,7,8,9);
	
	void count() 
	{	
		long obj = a.count();
		System.out.println("Count:"+obj);
		a.close();
	}
	
	void add()
	{	
		int obj2 = b.sum();
		System.out.println("Sum:"+obj2);
		b.close();
	}
	
	void min() 
	{	
		OptionalInt obj3 = c.min();
		System.out.println("Minimum:"+obj3.getAsInt());
		c.close();
	}
	
	void average() 
	{	
		OptionalDouble obj4= d.average();
		if(obj4.isPresent()) {
			System.out.println("Average:"+ obj4.getAsDouble());
		}
		d.close();
	}
	
	void max()
	{	
		OptionalInt obj5 = e.max();
		System.out.println("Maximum:"+obj5.getAsInt());
		e.close();
	}
	

}
public class Streamapi
{
		public static void main(String[] args)
		{
		Sapi sapi = new Sapi();
		sapi.count();
		sapi.add();
		sapi.min();
		sapi.average();
		sapi.max();
		}
	
}

//count,sum,min,avg,max