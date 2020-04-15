package AbstractionExamples;

public class AbstractClass2 extends AbstractClass1
{
	public void method2()
	{
		System.out.println("Class2 has provided the body");
	}
	public static void main(String[] args) 
	{
		AbstractClass2 obj=new AbstractClass2();
		obj.method1(10, 2);
		obj.method2();
	}
}