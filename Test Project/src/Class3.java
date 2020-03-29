
public class Class3 
{
	public void first()
	{
		System.out.println("Default Method");
	}
	
	public void second(int a, int b)
	{
		System.out.println("2 Parametrised Method");
	}
public static void main(String[] args) 
{
	Class3 manoj=new Class3();
	manoj.first();
	manoj.second(10, 200);
}
}