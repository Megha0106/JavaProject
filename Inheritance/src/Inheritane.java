import java.util.*;
class Shape
{
	int side1,side2;
	Scanner sc=new Scanner(System.in);
	public void read(String s)
	{
		
		
		System.out.println("Enter dimensions of "+s+":");
		side1=sc.nextInt();
		side2=sc.nextInt();
	}
}
class Triangle extends Shape
{
	public double area()
	{
		return 0.5*side1*side2;
	}
}
class Rectangle extends Shape
{
	public double area()
	{
		return side1*side2;
	}
}
class Rhombus extends Shape
{
	public double area()
	{
		return 0.5*side1*side2;
	}
}
class Square extends Rectangle
{
	public double area()
	{
		if(side1==side2)
			return side1*side2;
		else 
			return 0;
	}
}
public class Inheritane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		t.read("triangle");
		System.out.println("Area of triangle:"+t.area());
		
		Rectangle r=new Rectangle();
		r.read("rectangle");
		System.out.println("Area of rectangle:"+r.area());
		
		Rhombus ro=new Rhombus();
		ro.read("rhombus");
		System.out.println("Area of rhombus:"+ro.area());
		
		Square s=new Square();
		s.read("square");
		System.out.println("Area of square:"+s.area());

	}

}
