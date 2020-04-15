package LoopsAndlogic;

public class Swappingwithout3rdvariable 
{
	public static void main(String[] args) 
	{
		//swapping  with 3rd variable
		/*
		 * int a=15, b=20;
		 * 
		 * int t;
		 * 
		 * t=a; //t=15 
		 * a=b; //a=20
		 * b=t; //b=15
		 */
		
		
		//swapping without 3rd variable
		int a=15, b=20;
		
		a=a+b; //a(35)=15+20
		b=a-b; //b(15)=35-20
		a=a-b; //a(20)=35-15
		
		System.out.println("value of a "+a);
		System.out.println("Value of b "+b);
		
	}
}