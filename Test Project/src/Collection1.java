import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collection1 
{
	public static void main(String[] args) 
	{
		/* HashSet<Integer> hs= new HashSet<Integer>(); */
		/* LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>(); */
		TreeSet<Integer> hs=new TreeSet<Integer>();
						
		hs.add(1211);
		hs.add(12345);
		hs.add(12345);
		hs.add(7895);
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
	}
}