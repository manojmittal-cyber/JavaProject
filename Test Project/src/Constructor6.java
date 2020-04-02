
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