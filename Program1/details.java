package program1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class details 
{
	public void inform() 
	{
	String name = null, age = null, gender = null, contact = null, address = null;
	Stack<String> st = new Stack<String>();
	Scanner sc = new Scanner(System.in);
   
         System.out.println("Enter Name, Age, Gender, Contact No. and Address");
                      name = sc.next();
                      st.add(name);
                      age = sc.next();
                      st.add(age);
                      gender = sc.next();
                      st.add(gender);
                      contact = sc.next();
                      st.add(contact);
                      address = sc.next();
                      st.add(address); 
   
    	Iterator<String> itr3=st.iterator(); 
        System.out.println("Person's Details:");
        while(itr3.hasNext())
         {  
            System.out.println(itr3.next());  
         } 
       
         System.out.println("Display details from TreeMap");
	
	     Map<Integer, String> hash_map = new HashMap<Integer, String>();  
	 
                hash_map.put(1,name); 
                hash_map.put(2,age); 
                hash_map.put(3,gender); 
                hash_map.put(4,contact); 
                hash_map.put(5,address); 

      // Creating the TreeMap using the Map 
     TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(hash_map); 

      // Displaying the TreeMap 
      System.out.println("TreeMap: "+ tree_map); 
     
    	
    	
    }
    
}

	
	










