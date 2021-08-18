package shapes;

public class Rectangle implements Shape{

	double length,breadth;
	Rectangle()
	{
		System.out.println("Enter length and breadth of rectangle:");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
}
