
public class AbstractClass3 implements AbstractInterface
{
	public void method1()
	{
		System.out.println("This is first interface");
	}
	public void method2()
	{
		System.out.println("This is second interface");
	}
	public static void main(String[] args) 
	{
		AbstractClass3 obj=new AbstractClass3();
		obj.method1();
		obj.method2();
	}
}