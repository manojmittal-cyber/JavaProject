
public class ClassCChild extends ClassBFather
{
	public ClassCChild()
	{
		super(10);
		System.out.println("I am Child class Default Constructor");
	}
	public ClassCChild(int a)
	{
		System.out.println("I am Child class one Para Constructor");
	}
	public ClassCChild(int a, int b)
	{
		System.out.println("I am Child class 2 Para Constructor");
	}
	public static void main(String[] args) 
	{
		ClassCChild obj=new ClassCChild();
	}
}