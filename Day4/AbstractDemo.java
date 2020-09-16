abstract class MyClass{
	
   public void disp(){
     System.out.println("Actual/Concrete method of parent class");
   }
   abstract public void disp2();
}

class AbstractDemo extends MyClass{
	
   // Must Override this method while extending MyClass
	
   public void disp2()
   {
       System.out.println("overriding abstract method from class MyClass");
   }
   public static void main(String args[]){
       AbstractDemo obj = new AbstractDemo();
       System.out.println("Calling the method disp() from Abstract class MyClass through class AbstractDemo. ");
       obj.disp();
       System.out.println("Calling the method disp2() from Abstract class MyClass through class AbstractDemo.");
       System.out.println("But overriding occurs. Hence disp2() is called from AbstractDemo");
       obj.disp2();
   }
}