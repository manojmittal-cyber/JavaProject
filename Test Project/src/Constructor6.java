//Usage of This Keyword
//1. This can be used to call constructors. Syntax would be this(), this(1), this(1,2)
//2. This can be used to call methods. syntax would be this.(method_name)
//3. This can be used to differentiate between Global and Local variable. Below is the example of same.

public class Constructor6 
{
	int x=10;
	
	public void manoj(int x)
	{
		this.x=x;
	}
	public static void main(String[] args) 
	{
		Constructor6 obj=new Constructor6();
		System.out.println("Value before updating is "+obj.x);
		obj.manoj(40);
		System.out.println("Value after updating is "+obj.x);
		obj.manoj(50);
		System.out.println("Latest Value is "+obj.x);
	}
}