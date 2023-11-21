//4th program
import java.io.*;
public class Fileinput
{
	public static void main(String args[])throws IOException
	{
		//creating a file object 
		File f = new File("C:\\Users\\jayas\\OneDrive\\Desktop\\JAVA\\palindrome.java");
		
		try	
		{	
			//reading the file object
			InputStream is = new FileInputStream(f);
			//creating a byte array with size of the file
			//converting it into int as it returns long
			byte[] data = new byte[(int)f.length()];
			//
			int bytesRead = is.read(data);
			//is.read returns -1 when it reaches the End of the file
			if(bytesRead != -1)
			{
				//converting bytes into string
				String fileContent = new String(data);
				System.out.println(fileContent);
			}
			else
			{
				System.out.println("Error reading this file");
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}