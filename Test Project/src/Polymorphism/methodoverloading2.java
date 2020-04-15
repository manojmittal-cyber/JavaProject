package Polymorphism;

public class methodoverloading2 
{
	public void abc(StringBuffer a)
	{
		System.out.println("I am Stringbuffer method");
	}
	public void abc(String a)
	{
		System.out.println("i am string method");
	}
	public static void main(String[] args) 
	{
		methodoverloading2 m1=new methodoverloading2();
		m1.abc("abc");
		m1.abc(new StringBuffer("xyz"));
		//m1.abc(null);
		//m1.abc('a');
	}
}