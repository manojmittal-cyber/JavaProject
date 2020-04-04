//Variable- An entity that can take value and it can be changed
//static - an entity that can take value but it can't be changed
public class FinalKeyword 
{
	final int x = 10;
	public static void main(String[] args) 
	{
		FinalKeyword obj=new FinalKeyword();
		//obj.x=20;
		System.out.println("Value of X is static as "+obj.x);
	}
}