package Polymorphism;

public class VarArgsMethod 
{
	public void show(int a)
	{
		System.out.println("int method");
	}
	public void show(int... a)
	{
		System.out.println("VarArgs method");
	}
	public static void main(String[] args) 
	{
		VarArgsMethod var=new VarArgsMethod();
		var.show(10,20,30,40);
		var.show();
	}
}