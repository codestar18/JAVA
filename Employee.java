import java.util.*;
import java.io.*;

public class Employee implements Serializable
{
	int id , salary;
	long mob_num;
	String name, email;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee Id:");
		id = sc.nextInt();
		System.out.print("Enter the Employee name:");
		name = sc.next();
		System.out.print("Enter the Employee Salary:");
		salary = sc.nextInt();
		System.out.print("Enter the Mobile number:");
		mob_num = sc.nextLong();
	}
	public void print()
	{
		
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+id);
		System.out.println("Salary:"+salary);
		System.out.println("Mobile Number:"+mob_num);
		System.out.println();
	}
		

}