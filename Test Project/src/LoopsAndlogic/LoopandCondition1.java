package LoopsAndlogic;
import java.util.Scanner;

public class LoopandCondition1 
{
	public static void main(String[] args) {
		System.out.println("Enter the Value of a");
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		
		if(a<10)
		{
			System.out.println("A is lesster than 10");
		}
		else
		{
			System.out.println("A is bigger than 10");
		}
		
		if(a%2==0)
		{
			System.out.println("Remainder is even");
		}
		else
		{
			System.out.println("Remainder is odd");
		}
		
		System.out.println("Enter the Marks");
		int marks=s.nextInt();
		
		if ((marks>0)&&(marks<=33))
				{
					System.out.println("Fail");
				}
		
		else if ((marks>33) && (marks<=60))
				{
					System.out.println("Pass");
				}
		else if ((marks>60)&&(marks<=80))
				{
					System.out.println("first");
				}
		else if ((marks>60)&&(marks<=80))
		{
			System.out.println("first");
		}
		
	}
}