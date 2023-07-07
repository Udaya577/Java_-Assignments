import java.util.*;
class Test2
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle(5.0F , 7.0F);
		System.out.println("area: "+t.area());
		System.out.print("perimeter: "+ t.perimeter());
	}
}
class Triangle
{
	float base,height;
	public Triangle(float b,float h)
	{
		base=b;
		height=h;
	}
	public float area()
	{
		return (float)(0.5*base*height);
	}
	public float perimeter()
	{
		return 3*base;
	}
}