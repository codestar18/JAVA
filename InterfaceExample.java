//CAT1 - 5th question 
import java.util.*;

interface Interface1
{
	int a = 10;
	int b = 5;
	void add();
	void sub();
}
interface Interface2
{
	double x = 10.679;
	double y = 5.963;
	void add();
	void sub();
}
class Answer implements Interface1, Interface2
{
	public void add()
	{
		int res1 = a+b;
		System.out.println("Integer Result: "+res1);
		double res2 = x+y;
		System.out.println("Double Result: "+res2);
	}
	public void sub()
	{
		int res3 = a-b;
		System.out.println("Integer Result: "+res3);
		double res4 = x-y;
		System.out.println("Double Result: "+res4);
	}
	
}
public class InterfaceExample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Answer a = new Answer();
		a.add();
		a.sub();
	}
}