//Calling a method with a constructor using this keyword
public class Constructor4 
{
	public Constructor4()
	{
		this.manoj();
		System.out.println("I am a Default Constructor");
	}
	public void manoj()
	{
		System.out.println("I am a default method");
	}
	public static void main(String[] args) 
	{
	Constructor4 obj=new Constructor4();	
	}
}