
public class Expression2 { //(10+2)-2)+2)*2)/2)

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum of A and B is "+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Sub of A and B is "+c);
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Mul of A and B is "+c);
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Sum of A and B is "+c);
	}
	public static void main(String[] args) 
	{
	Expression2 obj=new Expression2();
	int sum_results =obj.sum(10, 2);
	int sub_results= obj.sub(sum_results, 2);
	int sum_results1=obj.sum(sub_results, 2);
	int mul_results=obj.mul(sum_results1, 2);
	obj.div(mul_results, 2);
	}
}