public class MyClass {
  public static void main(String[] args) {
    int myInt = 13;
    double myDouble = myInt; // Automatic casting: int to double
    System.out.print("Type casting\nWidening casting\nFrom Integer ");
    System.out.println(myInt);      // Outputs 13
    System.out.print("To double ");
    System.out.println(myDouble);   // Outputs 13.0
    
    myInt = (int) myDouble; // Manual casting: double to int
    System.out.print("Narrow casting\nFrom double ");
    System.out.println(myDouble);   // Outputs 13.0
    System.out.print("To integer ");
    System.out.println(myInt);      // Outputs 13
  }
}