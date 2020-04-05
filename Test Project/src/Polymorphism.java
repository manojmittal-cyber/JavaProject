//Poly-morphoism stands for one thing many form
//there are 2 parts of it
//1. Static polymorphism/compile time poly/method overloading
//2. dynamic poly/run time/method overriding

//in Static poly, Method name would be same--Method input will not be same---methoud output could be same or not
//in dynamic poly, method name will be same--method input will be same--method output will be same. implementation wil be different

//This is example of Static Poly 
public class Polymorphism 

{
	public void sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("First method sum is "+c);
	}
	public void sum(int a, int b, int c)
	{
		int d;
		d=a+b+c;
		System.out.println("Second method sum is "+d);
	}
	public static void main(String[] args) 
	{
		Polymorphism obj=new Polymorphism();
		obj.sum(10, 2);
		obj.sum(10, 1, 1);
	}
}