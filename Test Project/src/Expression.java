
public class Expression //(10+2)(10-2) 
{

	public int Sum (int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("This method will retrun Sum "+c);
		return c;
	}
	
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("This method will retrun sub "+z);
		return z;
	}
	public void mul(int x1, int x2)
	{
		int z1;
		z1=x1*x2;
		System.out.println("This method will retrun multiplication "+z1);
	}
	public static void main(String[] args) 
	{
	Expression manoj= new Expression();
	int sum_results=manoj.Sum(10, 2);
	int sub_results=manoj.sub(10, 2);
	manoj.mul(sum_results, sub_results);
	}
}
