interface InterfaceOne {
  public void MethodOne();
}

interface InterfaceTwo {
  public void MethodTwo(); 
}

class DemoClass implements InterfaceOne, InterfaceTwo {
  public void MethodOne() {
    System.out.println("MethodOne is called in DemoClass from InterfaceOne");
  }
  public void MethodTwo() {
    System.out.println("MethodTwo is called in DemoClass from InterfaceTwo");
  }
}

class Interface {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.MethodOne();
    myObj.MethodTwo();
  }
}