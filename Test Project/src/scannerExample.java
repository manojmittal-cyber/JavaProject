
import java.util.Scanner;

public class scannerExample 
{
	public static void main(String[] args) {
		
		System.out.println("Value of A is ");
		Scanner obj=new Scanner(System.in);
	
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		int c=a+b;
		System.out.println("Value of c is" +c);
	}
}