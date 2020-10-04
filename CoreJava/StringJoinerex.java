package Streamexample;

import java.util.StringJoiner;  
public class StringJoinerex {  
    public static void main(String[] args) {  
    	//Comma(,) as delimiter
        StringJoiner mystring = new StringJoiner(",");   
          
        mystring.setEmptyValue("This is a default String");  
       
        System.out.println("Default String: "+mystring);  
          
          
        // Adding strings to StringJoiner  
        mystring.add("Manasvi");  
        mystring.add("Aakash"); 
        mystring.add("Dhvani");
        mystring.add("Vineeth");
        mystring.add("Rohan");
        System.out.println(mystring);  
        
        int length = mystring.length();  
        System.out.println("Length of the StringJoiner: "+length);  
        
        String s = mystring.toString();  
        System.out.println(s);   
    }  
}