
public class Constructor2 
{
	public Constructor2(int a, int b)
	{
		int sum;
		sum=a+b;
		System.out.println("Sum is "+sum);
		int sub;
		sub=a-b;
		System.out.println("sub is "+sub);
		int mul;
		mul=a*b;
		System.out.println("mul is "+mul);
		int div;
		div=a/b;
		System.out.println("div is "+div);
	}
	public static void main(String[] args) {
		
		Constructor2 obj=new Constructor2(10, 2);
	}
}