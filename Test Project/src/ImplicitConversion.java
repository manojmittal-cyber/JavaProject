
public class ImplicitConversion 
{
	int a=10;
	float c=15.20F;
	
	public void method1()
	{
		float b=a;
		System.out.println("This is example of Implicit Conversion "+b);
	}
	public void method2()
	{
		int d =(int)c;
		System.out.println("This is example of Explicit Conversion "+d);
	}
	public static void main(String[] args) 
	{
		ImplicitConversion obj= new ImplicitConversion();
		obj.method1();
		obj.method2();
	}
}