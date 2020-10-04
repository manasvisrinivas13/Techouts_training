package exceptionMulti;

public class MultipleCatchBlock
{

	public static void main(String[] args)
	{ 
		
		System.out.println("Example 1");
		try{    
            int a[]=new int[5];    
            a[5]=60/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");  
             
             
         System.out.println("Example 2"); 
         try{    
             int a[]=new int[4];    
             
             System.out.println(a[12]);  
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
            
            
            
         System.out.println("Example 3"); 
         try{    
             String s=null;  
             System.out.println(s.length());  
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");  
            
            
            
          System.out.println("Example 4");
          int[] arr = new int[4]; 
          
          try
          { 
              int i = arr[4]; 
                    
              // this statement will never execute 
              // as exception is raised by above statement 
              System.out.println("Inside try block"); 
              //return 1;
          } 
            
          catch(ArrayIndexOutOfBoundsException ex) 
          { 
              System.out.println("Exception caught in catch block"); 
              //return 0;
          } 
            
          finally
          { 
              System.out.println("finally block executed"); 
          }
          System.out.println("Outside try-catch-finally clause");

            
            
         
      /*  
       * if we remove these commented lines, 
       * the below try catch block will give out compile-time error.
       *  
       *  
       *  System.out.println("Example 6"); 
         try{    
        	    int a[]=new int[5];    
        	    a[5]=20/0;    
        	   }    
        	   catch(Exception e)
                   {
        		    System.out.println("common task completed");
        		    }    
        	   catch(ArithmeticException e)
                  {
        		   System.out.println("task1 is completed");
        		   }    
        	   catch(ArrayIndexOutOfBoundsException e)
                  {
        		   System.out.println("task 2 completed");
        		   }    
        	   System.out.println("rest of the code..."); 
         */    
             
         
    }  

}


