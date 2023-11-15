//Shape Interface
import java.util.*;
interface ShapeObj
{
	void calculateArea();
	void calculatePerimeter();
}
class Circle implements ShapeObj
{
	int r;
	Circle(int r)
	{
		this.r = r;
	}
	public void calculateArea()
	{
		double area = 3.14*r*r;
		System.out.println("Area of the Circle:"+ area);
	}
	public void calculatePerimeter()
	{
		double perimeter = 2*3.14*r;
		System.out.println("Perimeter of the Circle:"+ perimeter);
	}
}
class Rectangle implements ShapeObj
{
	int l,b;
	Rectangle(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	public void calculateArea()
	{
		int area = l*b;
		System.out.println("Area of the Rectangle:"+area);
	}
	public void calculatePerimeter()
	{
		int perimeter = 2*(l+b);
		System.out.println("Perimeter of the Rectangle:"+perimeter);
	}
}
public class Shape
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle(4);
		Rectangle r = new Rectangle(3,4);
		c.calculateArea();
		c.calculatePerimeter();
		r.calculateArea();
		r.calculatePerimeter();
	}
}
