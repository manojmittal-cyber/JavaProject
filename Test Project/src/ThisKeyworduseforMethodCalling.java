//Use of this keyword to call method

public class ThisKeyworduseforMethodCalling 
{
	public void method1()
	{
		System.out.println("I am a default method");
	}
	public void method2(int a)
	{	
		this.method1();
		System.out.println("I am one Parameterised method");
		this.method3(10, 20);
	}
	public void method3(int a, int b)
	{
		System.out.println("I am 2 parameterised method");
	}
	public static void main(String[] args) 
	{
		ThisKeyworduseforMethodCalling obj=new ThisKeyworduseforMethodCalling();
		obj.method2(10);
	}
}
