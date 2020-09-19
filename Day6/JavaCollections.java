package school;

import java.util.*;  

public class JavaCollections
{  
	
public static void main(String args[])
 {  
	String name = null;
	String city = null;
    @SuppressWarnings("resource")
    
    Scanner in = new Scanner(System.in);
 
    ArrayList<String> list=new ArrayList<String>();   
    ArrayList<String> second=new ArrayList<String>();
    System.out.println("Iterating the ArrayList:");
  
    for(int i=0;i<2;i++)
    {
	  System.out.println("enter name "+(i+1)+": ");
	  name = in.next();
      list.add(name);
      System.out.println("enter city "+(i+1)+": ");
	  city = in.next();
      second.add(city);
    }                      //Adding same object in arraylist using for loop
  

    //Traversing list through Iterator  
    System.out.println("The names in Array list are as follows: ");
    {
    	Iterator<String> itr=list.iterator();  
  
        while(itr.hasNext())
       {  
         System.out.println(itr.next());  
       } 
    }
    
      System.out.println("The Cities in Array list are as follows: ");
        { 
        	Iterator<String> itr7=second.iterator();  
  
           while(itr7.hasNext())
          {  
             System.out.println(itr7.next());  
          } 
        }
    
    LinkedList<String> al=new LinkedList<String>(); 
    //LinkedList
    System.out.println("\nAdding in a LinkedList:");
    al.add("This is");  
    al.add("Add method");  
    al.add("in");  
    al.add("LinkedList");  
    
    Iterator<String> itr1=al.iterator();  
    while(itr1.hasNext())
    {  
      System.out.println(itr1.next());  
    }  
    
    PriorityQueue<String> queue=new PriorityQueue<String>(); 
    
    System.out.println("\nPriority Queue:");
    
    queue.add("element one");  
    queue.add("product two");  
    queue.add("service three");  
    queue.add("written four"); 
    
    System.out.println("head element:"+queue.element());  
    System.out.println("head peek:"+queue.peek());  
    System.out.println("iterating the queue elements:");  
    
    Iterator<String> itr3=queue.iterator();  
      while(itr3.hasNext())
       {  
          System.out.println(itr3.next());  
       } 
      
    queue.remove();  
    queue.poll();  
    
    System.out.println("after removing two elements:");  
    
    Iterator<String> itr4=queue.iterator();  
       while(itr4.hasNext())
        {  
           System.out.println(itr4.next());  
        } 
   } 

}  
       
    /*
    Vector<String> v=new Vector<String>();
    System.out.println("\nVector:");
    v.add("Ayush");  
    v.add("Amit");  
    v.add("Ashish");  
    v.add("Garima");  
    Iterator<String> itr11=v.iterator();  
    while(itr11.hasNext())
    {  
    System.out.println(itr11.next());  
    } 
    
    Stack<String> stack = new Stack<String>(); 
    System.out.println("\nStack:");
    stack.push("Ayush");  
    stack.push("Garvit");  
    stack.push("Amit");  
    stack.push("Ashish");  
    stack.push("Garima");  
    stack.pop();  
    Iterator<String> itr2=stack.iterator();  
    while(itr2.hasNext())
    {  
    System.out.println(itr2.next());  
    } 
    */ 
  