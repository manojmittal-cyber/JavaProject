package LoopsAndlogic;

public class findGreaternumber 
{
	public static void main(String[] args) 
	{
		int a=90, b=35, c=50; 
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if (b>c && b>a)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
	}
}