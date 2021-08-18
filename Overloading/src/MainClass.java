class Shape{
	double val1,val2;
	void input(double a,double b)
	{
		val1=a;val2=b;
	}
	void area()
	{
		System.out.println("Area in base class");
	}
}
class Triangle extends Shape{
	void area()
	{
		System.out.println("Area of triangle="+(0.5*val1*val2));
	}
}
public class MainClass {
	public static void main(String[] args) {
		Shape s=new Triangle();
		s.input(10.5, 12.5);
		s.area();

	}

}
