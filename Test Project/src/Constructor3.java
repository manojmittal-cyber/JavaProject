
public class Constructor3 
{
	public Constructor3()
	{
		this (1,2,3);
		System.out.println("I am a Default constructor");
	}
	public Constructor3(int a, int b)
	{
		this();
		System.out.println("I am a 2 Parameterised constructor");
	}
	public Constructor3(int a)
	{	
		this(1,2);
		System.out.println("I am a one Parameterised constructor");
	}
	public Constructor3(int a, int b, int c)
	{	
		System.out.println("I am a Three parameterised constructor");
	}
	public static void main(String[] args) 
	{
	Constructor3 obj=new Constructor3(1);	
	}
}