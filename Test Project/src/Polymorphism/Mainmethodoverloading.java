package Polymorphism;

public class Mainmethodoverloading 
{
	public static void main(String[] args) 
	{
		System.out.println("i AM METHOD 1");
		Mainmethodoverloading m1=new Mainmethodoverloading();
		m1.main(10);
	}
	public static void main(int a) 
	{
		System.out.println("i am method 2");
	}
}