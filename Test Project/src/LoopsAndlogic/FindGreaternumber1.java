package LoopsAndlogic;

public class FindGreaternumber1 
{
	public static void main(String[] args) 
	{
		int a=40, b=120, c=90;
		
		if (a>b)
		{
			if (a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
	}
}