package Polymorphism;
//Method Overriding
public class DynamicPolymorphism1 extends DynamicPolymorphism
{
	public void airthmatic(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Result of Opertaion Airthmatic is "+c);
	}
	public static void main(String[] args) 
	{
		DynamicPolymorphism1 obj=new DynamicPolymorphism1();
		obj.airthmatic(10, 2);
	}
}