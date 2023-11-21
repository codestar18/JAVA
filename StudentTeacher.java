//Program 1 DA_5
import java.util.*;
class NameHolder
{
	String name;
	synchronized String getName()
	{
		while(name == null)
		{
			try
			{
				wait(2000);
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
		String n = name;
		name = null;
		return n;
		//notify();
	}
	synchronized void putName(String name)
	{
		this.name = name;
		
		System.out.println("Teacher - "+name);
		
		try
		{
			wait(2000);
			notify();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
		
	}
}
class Teacher implements Runnable
{
	NameHolder h;
	public Teacher(NameHolder h)
	{
		this.h = h;
	}
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		do
		{
			System.out.print("Enter the name :");
			name = sc.nextLine();
			if(!name.equals("stop"))
			{
				h.putName(name);
			}
		}while(!name.equals("stop"));
	}
}
class Student implements Runnable
{
	NameHolder h;
	public Student(NameHolder h)
	{
		this.h = h;
	}
	public void run()
	{
		String s;
		do
		{
			s = h.getName();
			if(s != null)
			{
				System.out.println("Student - "+s);
			}
		}while(s != null && !s.equals("stop"));
		
	}
}
public class StudentTeacher
{
	public static void main(String args[])
	{
		NameHolder h = new NameHolder();
		
		Student s = new Student(h);
		Teacher t = new Teacher(h);
		
		Thread studentThread = new Thread(s);
		Thread teacherThread = new Thread(t);
		teacherThread.start();
		studentThread.start();
		
	}
}