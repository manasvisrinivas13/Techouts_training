package Streamexample;

import java.util.stream.Collectors;  
import java.util.List;  
import java.util.Set; 
import java.util.ArrayList;  
class Student{    
   int id;     
   String name;  
   int age;           
   public Student(int id, String name, int age) {   
       this.id = id;         
       this.name = name;       
       this.age = age;      
   } 
}  
public class Collectorex {     
   public static void main(String[] args) {       
      List<Student> sl = new ArrayList<Student>();       
      //Adding Students        
      sl.add(new Student(11,"Michael",22));         
      sl.add(new Student(22,"Matilda",18));         
      sl.add(new Student(33,"Solomon",18));         
      sl.add(new Student(44,"Nalini",23));         
      sl.add(new Student(55,"Lucky",23));                  
      //Fetching student data as a Set       
      Set<Student> students = sl.stream()
                           .filter(n-> n.id>22)
                           .collect(Collectors.toSet());
      //Iterating Set       
      for(Student stu : students) { 
         System.out.println(stu.id+" "+stu.name+" "+stu.age); 
      }           
   } 
}
