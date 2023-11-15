//Multilevel Inheritance
/*Calc(parent)
	^
  AdvCalc(child for Calc)(parent for VeryAdvCalc)
	^
 VeryAdvCalc(child for AdvCalc)
*/
import java.util.*;
import java.lang.*;
class Calc
{
	int a, b;
	Calc(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	void add()
	{
		System.out.println("Addition:"+(a+b));
	}
	void sub()
	{
		System.out.println("Subtraction:"+(a-b));
	}
}
class AdvCalc extends Calc
{
	
	AdvCalc(int a, int b)
	{
		super(a,b);
	}
	void mul()
	{
		System.out.println("Multiplication:"+(a*b));
	}
	void div()
	{
		if(b!=0)
		{
			System.out.println("Division:"+(a/b));
		}
		else
		{
			System.out.println("Cannot divide by zero.");
		}
	}
}
class VeryAdvCalc extends AdvCalc
{
	VeryAdvCalc(int a, int b)
	{
		super(a,b);
	}
	void power()
	{
		double res = Math.pow(a,b);
		System.out.println("Result for Power:"+res);
	}
}
public class Inheritance
{
	public static void main(String args[])
	{
		VeryAdvCalc obj = new VeryAdvCalc(2,2);
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.power();
	}
}