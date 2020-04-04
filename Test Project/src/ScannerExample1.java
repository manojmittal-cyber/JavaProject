import java.util.Scanner;

public class ScannerExample1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		
		System.out.println("Value of Int,Float and String Are");
		int a=s.nextInt();
		float b=s.nextFloat();		
		String c=s.next();
		System.out.println("Int value is "+a);
		System.out.println("Float value is "+b);
		System.out.println("Value of String is "+c);
	}
}