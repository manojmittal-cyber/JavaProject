import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Textinfilepractice1 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\mmitt\\OneDrive\\Desktop\\Javatestfile.txt");
		//making connection
		FileReader fr=new FileReader(f);
		//reading file
		BufferedReader b=new BufferedReader(fr);
		//reading file using bufferreader to read line by line
		String s;
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		}
	}
}