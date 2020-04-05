
public class StaticKeyword2 
{
	static int a=0;
	
	public void method1()
	{
		a=a+1;
	}
	public static void main(String[] args) 
	{
		StaticKeyword2 obj=new StaticKeyword2();
		obj.method1();
		System.out.println(obj.a);
		
		StaticKeyword2 obj1=new StaticKeyword2();
		obj1.method1();
		System.out.println(obj1.a);
		
		StaticKeyword2 obj2=new StaticKeyword2();
		obj2.method1();
		System.out.println(obj2.a);
	}
}