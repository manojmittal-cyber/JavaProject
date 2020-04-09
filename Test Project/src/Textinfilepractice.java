import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Textinfilepractice 
{
	public static void main(String[] args) throws IOException 
	{
	 File f=new File("C:\\Users\\mmitt\\OneDrive\\Desktop\\Javatestfile.txt");
	 //till hear established the connection with file
	 FileReader fr=new FileReader(f);
	 //now at this step we are reading the file using file reader
	 
	 int a;
	 while((a=fr.read())!= -1)
	{
	     System.out.println((char)a);
	}
	 
	}
}