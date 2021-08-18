import java.util.*;
interface Figure{
	Scanner sc=new Scanner(System.in);
	double PI=3.14;
	void area();
}
class Circle implements Figure{
	double r;
	Circle()
	{
		System.out.println("Enter radius of circle:");
		r=sc.nextDouble();
	}
	public void area()
	{
		double a=PI*r*r;
		System.out.println("Area of circle="+a);
	}
	
}
class Clone implements Figure{
	double r,h;
	Clone()
	{
		System.out.println("Enter radius and height of clone:");
		r=sc.nextDouble();
		h=sc.nextDouble();
	}
	public void area(){
		double a=PI*r*(r+Math.sqrt(h*h+r*r));
		System.out.println("Area of clone="+a);
	}
	
}
public class FigureDemo {

	public static void main(String[] args) {
		Figure f=new Circle();
		f.area();
		f=new Clone();
		f.area();

	}

}
