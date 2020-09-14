
class Shape{
	
	public void intro(){
		System.out.println("Method Overloading.\nintro method in Shape class with no argument and void return type");
	}
	protected void intro(String ShapeName){
		System.out.println("Method Overloading.\nintro method in Shape class with an argument and void return type\nThe Shape name is "+ShapeName );
	}
	public void intro(String ShapeName,int dimension){
		System.out.println("Method Overloading.\nintro method in Shape class with two arguments and void return type.\nThe Shape name is: "+ShapeName+ " and the dimension is:"+dimension);
	}
	
}

class Circle extends Shape{
	public void intro(String ShapeName){
		System.out.println("Inherited class Shape to Circle.\nUpcasting.\nintro method overriden in Circle class having same method signature.\nThe Shape name is: "+ShapeName);
	}	
}

public class Polymorphism {
	public static void main(String[] args) {
		System.out.println("POLYMORPHISM");
		Shape shapeObj=new Shape();
		shapeObj.intro();
		shapeObj.intro("Rhombus");
		shapeObj.intro("Square",10);
	System.out.println("Method Overriding.");	
	Circle cirObj=new Circle ();//upcasting
	cirObj.intro("Circle");
		
	}

}
