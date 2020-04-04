import java.util.Scanner;

//((((((x1-x2)+x3)*x4)+x5)/x6
public class ScannerExpression 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Value of X1 is");
		int X1=obj.nextInt();
		System.out.println("Value of X2 is");
		int X2=obj.nextInt();
		int sub=X1-X2;
		System.out.println("Value of X3 is");
		int X3= obj.nextInt();
		int sum= sub+X3;
		System.out.println("Value of X4 is");
		int X4=obj.nextInt();
		int mul=sum*X4;
		System.out.println("Value of X5 is");
		int X5=obj.nextInt();
		int sum1=mul+X5;
		System.out.println("Value of X6 is");
		int X6=obj.nextInt();
		int div=sum1/X6;
		System.out.println("final output is "+div);
	}
}