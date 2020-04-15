package LoopsAndlogic;

import java.util.Scanner;

public class Leapyear 
{
	public static void main(String[] args) 
	{
		int year = 2016;
		System.out.println("Enter the year");
		Scanner s=new Scanner(System.in);
		s.nextInt();
		
		if(year %4==0)
			if (year%100== 0)
			{
				if (year%400 ==0)
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not a leap year");
				}
			}
			else
			{
				System.out.println("leap year");
			}
		else 
		{
		System.out.println("not a leap year");	
		}
	}
}