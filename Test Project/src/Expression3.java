
public class Expression3 {//10/2)+2)-2)*2)

	public int div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Div resutls of a and B "+c);
		return c;
	}
	public int sum (int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum resutls of a and B "+c);
		return c;
	}
	public int sub (int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("sub resutls of a and B "+c);
		return c;
	}
	public void mul (int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Mul resutls of a and B "+c);
	}
	public static void main(String[] args) 
	{
		Expression3 obj=new Expression3();
		int div_results=obj.div(10, 2);
		int sum_results=obj.sum(div_results, 2);
		int sub_results=obj.sub(sum_results, 2);
		obj.mul(sub_results, 2);
	}
}