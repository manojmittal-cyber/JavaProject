
public class Constructor1 
{
	
	//Constructor name and Class name will be same
	//Constructor is like a method
	//no return type for constructor
	//no need to call a constructor it will be called by itself when object of the class will be created	
	public Constructor1() //not returning anything and it is a default construcor
	{
		System.out.println("I am a default constructor");
	}
	public Constructor1(int z) //not returning anything and it is a one Parametrised construcor
	{
		System.out.println("I am one Parametrised constructor");
	}
	public Constructor1(int z,int m) //not returning anything and it is a two Parametrised construcor
	{
		System.out.println("I am two Parametrised constructor");
	}
	public static void main(String[] args) {

		Constructor1 obj=new Constructor1(10,20);
		Constructor1 obj1=new Constructor1(10);
		Constructor1 obj2=new Constructor1();
	}
}