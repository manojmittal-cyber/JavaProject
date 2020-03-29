
public class Class2 
{
	int age; //this is a global variable and have scope in entire class
	int roll_no; //this is a global variable and have scope in entire class
	public void display1()
	{
		int z=10; //this is a local variable and have scope in this method only
		System.out.println("Welcome guyz to first Java class");
	}	
	public static void main(String[] args) 
	{
	Class2 manoj = new Class2();
	manoj.age = 31;
	manoj.roll_no=007;
	manoj.display1();
	System.out.println(manoj.age);
	System.out.println(manoj.roll_no);
	}
}