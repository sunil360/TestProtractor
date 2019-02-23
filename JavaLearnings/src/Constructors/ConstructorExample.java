package Constructors;

public class ConstructorExample {
	
	public ConstructorExample()
	{
		System.out.println("Default Constructor");
	}
	
	public ConstructorExample(int age, String name)
	{
		System.out.println("Age is= " +age);
		System.out.println("Name is= " +name);
	}
	
	

	
	public static void main(String[] args) {
		
		ConstructorExample consexample= new ConstructorExample();
		ConstructorExample consexample1= new ConstructorExample(10, "Sunil Kumar");
		
			
		

	}

}
