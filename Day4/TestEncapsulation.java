class Encapsulate 
{ 
    private String Name; 
    private int Age; 
  
    public int getAge()  
    { 
      return Age; 
    } 
    public String getName()  
    { 
      return Name; 
    } 
       
    public void setAge( int newAge) 
    { 
      Age = newAge; 
    } 

    public void setName(String newName) 
    { 
      Name = newName; 
    } 
} 

public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
        System.out.println("Encapsulation");  
        // setting values of the variables  
        obj.setName("Manasvi"); 
        obj.setAge(23); 
          
        // Displaying values of the variables 
        System.out.println("Using getName() with encapsulation");
        System.out.println("My name: " + obj.getName()); 
        System.out.println("Using getAge() with encapsulation");
        System.out.println("My age: " + obj.getAge()); 
        } 
} 