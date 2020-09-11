
public class Java {

	public String Inheritance;
	public String Polymorphism;
	public String Abstraction;
	public String Encapsulation;

	{
		Inheritance = "Null";
		Polymorphism = "Null";
		Abstraction = "Null";
		Encapsulation = "Null";
	}

	public static void main(String[] args) {
		Java java = new Java();

		java.Inheritance = "Inheritence: Inheritance is an important pillar of OOP.\n" 
		    + " \t     It is the mechanism in Java by which one class is allow to inherit "
			+ "the features of another class.";
		System.out.println(java.getOopsDescription(java.Inheritance));
		System.out.println();
		
		java.Polymorphism = "Polymorphism: In Java it's a concept by which we can perform"
				+ "a single action in different ways.\n"
				+ "\t      Polymorphism is derived from 2 Greek words: poly and morphs.\n"
				+ "\t      The word \"poly\" means many and \"morphs\" means forms.";
		System.out.println(java.getOopsDescription(java.Polymorphism));
		System.out.println();
		
		java.Abstraction = "Abstraction: Data abstraction is the process of hiding" 
				+ "certain details and showing only essential information to the user.\n"
				+ "\t     Abstraction can be achieved with either abstract classes or interfaces";
		System.out.println(java.getOopsDescription(java.Abstraction));
		System.out.println();
		
		java.Encapsulation = "Encapsulation: Encapsulation in Java is a mechanism"
				+ "wrapping the data and code acting on the data together as a"
				+ "single unit.\n\t       In encapsulation, the variables of a class"
				+ " will be hidden from other classes, and can be accessed only through"
				+ "the methods of their current class.";
		System.out.println(java.getOopsDescription(java.Encapsulation));
		System.out.println();
		
	}

	public String getOopsDescription(String str) {
		return str;

	}

}