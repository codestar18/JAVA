//Deserialization
import java.util.*;
import java.io.*;

public class EmployeeDeserializable
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis = new FileInputStream("EmployeeDetails.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e;
		while(fis.available()>0)
		{
			e = (Employee)ois.readObject();
			e.print();
		}
		ois.close();
		fis.close();
	}
}