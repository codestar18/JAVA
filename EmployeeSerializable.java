import java.io.*;
import java.util.*;
public class EmployeeSerializable
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("EmployeeDetails.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Employees:");
		int n = sc.nextInt();
		
		Employee e[] = new Employee[n];
		
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter the Details of Employee"+(i+1));
			e[i] = new Employee();
			e[i].input();
			oos.writeObject(e[i]);
		}
		System.out.println("\nEmployee Details whose salaries are greater than 25000\n");
		for(int j =0;j<n;j++)
		{
			if(e[j].salary>25000)
			{
				e[j].print();
			}
		}
		
		//System.out.println("All data are written into the file EmployeeDetails.txt");
		oos.close();
		fos.close();
	}	
}