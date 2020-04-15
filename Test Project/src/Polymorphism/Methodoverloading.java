package Polymorphism;

public class Methodoverloading 
{
	
	  public void show(int a, int b, int c) 
	  {
		  System.out.println("I am first method"); 
	  } 
	  
	  public void show(int a, int c,String b) 
	  { 
		  System.out.println("I am second method"); 
	  } 
	  
	  public void show() 
	  {
	  System.out.println("i am default method"); 
	  }
	 
	public static void main(String[] args) 
	{	
		  Methodoverloading method=new Methodoverloading();
		  method.show(10, 20, "a");
		  method.show(); method.show(10, 20, 30);
	}
	
}