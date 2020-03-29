
public class Expression1 
{
	int sum_results, sub_results;

	public int sum(int a, int b)
	{
		sum_results=a+b;
		return sum_results;
	}
	public int sub(int a, int b)
	{
		sub_results=a-b;
		return sub_results;
	}
	public void mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Retrun is mulitiplication "+c);
	}
	public static void main(String[] args) 
	{
	Expression1 exp=new Expression1();
	exp.sum(10, 2);
	exp.sub(10, 2);
	exp.mul(exp.sum_results, exp.sub_results);
	}
}
