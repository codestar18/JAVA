import java.io.*;
import java.util.*;

public class Filehandling
{
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Directory path:");
		String directory_path =  sc.nextLine();
		
		File directory = new File(directory_path);
		
		if(directory.exists()&&directory.isDirectory())
		{
			System.out.println("The provided path is a valid directory path and it exists");
			File[] files = directory.listFiles();
			double sum =0;
			for(int i =0;i<files.length;i++)
			{
				System.out.println(files[i].getName()+" - "+files[i].length()+"bytes");
				sum = sum+files[i].length();
			}
			System.out.println("Total size of all the files in the directory::"+sum+"bytes");
		}
		else if(!directory.exists())
		{
			System.out.println("This directory doesn't exist");
		}
		else
		{
			System.out.println("The given path is not a directory");
		}
		
	}
}