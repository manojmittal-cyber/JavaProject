import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Textinfilepractice2 
{
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\mmitt\\OneDrive\\Desktop\\Javatestfile.txt");
		FileWriter fw=new FileWriter(f,true);
		/*fw.write("My name is Manoj Mittal");
		fw.write("i am second line");
		fw.close();
		*/
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0;i<10;i++)
		{
			bw.write("My name is manoj mittal");
			bw.newLine();
		}
		bw.close();
	}
}