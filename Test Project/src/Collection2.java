import java.util.TreeSet;

public class Collection2 
{
	public static void main(String[] args) 
	{
		TreeSet<String> hs=new TreeSet<String>();
		
		hs.add("Manoj");
		hs.add("Mittal");
		hs.add("Welcome");
		hs.add("Welcome");
		
		for(String s: hs)
		{
			System.out.println(s);
		}		
	}
}