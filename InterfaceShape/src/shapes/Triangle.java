package shapes;

public class Triangle implements Shape {

	double base,height;
	Triangle()
	{
		System.out.println("Enter base of triangle:");
		base=sc.nextDouble();
		height=sc.nextDouble();
	}
	public double area()
	{
		return 0.5*base*height;
	}
	public double perimeter()
	{
		double side1,side2;
		System.out.println("Enter side1 and side2:");
		side1=sc.nextDouble();
		side2=sc.nextDouble();
		return(side1+side2+base);
	}
}
