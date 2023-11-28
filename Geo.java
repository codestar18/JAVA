//
import java.util.*;

class GeometricObject
{
	float x,y;
	String color;
	boolean filled=true;
	GeometricObject(float x, float y, String color, boolean filled)
	{
		this.x = x;
		this.y = y;
		this.color = color;
		this.filled=filled;
	}
	void print()
	{
		System.out.print("X:"+x);
		System.out.print("Y:"+y);
		System.out.print("Color:"+color);
		System.out.print("Filled:"+filled);
	}
}
class Rectangle extends GeometricObject
{
	Rectangle(float x, float y, String color, boolean filled)
	{
		super(x,y,color,filled);
	}
	void findArea()
	{
		float area = x*y;
		System.out.println("Area of Rectangle:"+area);
	}
	void findPerimeter()
	{
		float p = 2*(x+y);
		System.out.println("Perimeter of Rectangle:"+p);
	}
	void print()
	{
		super.print();
		/*System.out.println("X:"+x);
		System.out.println("Y:"+y);
		System.out.println("Color:"+color);
		System.out.println("Filled:"+filled);*/
	}
		
}
public class Geo
{
	public static void main(String args[])
	{
		
		Rectangle r = new Rectangle(2,5,"Blue",true);
		//GeometricObject g = new GeometricObject(2,5,"Blue",true);
		r.findArea();
		r.findPerimeter();
		r.print();
	}
}
		
	