
public class Constructor5 
{
	int x;
	
	public void main (int y)
	{
		x=y;
	}
	public static void main(String[] args) {
		Constructor5 obj=new Constructor5();
		obj.main(20);
		System.out.println("Value of global variable is "+obj.x);
	}
}