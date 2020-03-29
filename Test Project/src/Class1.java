
public class Class1 
{ //This is the boundary of Class. class contains variables and methods

	int a; //This is a variable
	
	public void method1() //This is a void method inside Class
	{//this is boundry of method similar to class
		System.out.println("This is void Method1"); //SYSO is used to print value
	}
	
	public static void main(String[] args)//This is main method 
	{
		Class1 manoj=new Class1(); //this is object creation
		manoj.a=12;
		System.out.println(manoj.a);
		manoj.a=15;
		System.out.println(manoj.a);
		manoj.method1(); //this is how you can call a method using object
		System.out.println("This is a simple Java Program");
		//code is ran line by line
	}
}
