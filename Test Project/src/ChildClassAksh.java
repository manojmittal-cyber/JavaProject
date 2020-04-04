
public class ChildClassAksh extends ParentClassManoj
{
	public void method2()
	{
		this.class1();
		this.class1(10, 2);
		System.out.println("I am default child class method");
	}
	public void method3(int x)
	{
		System.out.println("I am one paremerteised child class method");
	}
	public void method4(int x, int y)
	{
		System.out.println("I am two paramerised child class method");
	}
	public static void main(String[] args) 
	{
		ChildClassAksh obj=new ChildClassAksh();
		obj.method2();
	}
}