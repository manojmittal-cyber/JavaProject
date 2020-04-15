package AbstractionExamples;

//in abstract class there are both types of method.
//Abstract+concrete

public abstract class AbstractClass1 //abstract keyword will make the class abstract here
{
	public void method1(int a, int b)//abstract method with body
	{
		int c;
		c=a+b;		
		System.out.println("Sum is "+c);
	}
	public abstract void method2(); //abstract method without body
}