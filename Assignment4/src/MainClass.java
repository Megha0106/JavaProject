import java.util.*;
//base class
abstract class Shape{
	//data members
	double side1,side2;
	Scanner sc=new Scanner(System.in);
	//methods
	public void input()
	{
		System.out.println("Enter dimensions:");
		System.out.println("Side1:");
		side1=sc.nextDouble();
		System.out.println("Side2:");
		side2=sc.nextDouble();
	}
	abstract public double compute_area();
	public void display(double area)
	{
		System.out.println("Side1\tSide2\tArea");
		System.out.println(side1+"\t"+side2+"\t"+area);
		
	}
}
//derived classes
class Triangle extends Shape{
	public double compute_area()//overriding
	{
		return 0.5*side1*side2;
	}
}
class Rectangle extends Shape{
	public double compute_area()//overriding
	{
		if(side1==side2)
			System.out.println("It is square...");
		return side1*side2;
	}
}
public class MainClass {

	public static void main(String[] args) {
		Shape s=null;
		int ch;
		double area;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("--------------------------------------------------------------");
			System.out.println("1:To compute area of triangle\n2:To compute area of rectangle\n3:Exit");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				s=new Triangle();
				break;
			case 2:
				s=new Rectangle();
				break;
			case 3:
				System.out.println("Thank you.....");
				System.exit(1);
			}
			s.input();
			System.out.println("---------------------------------------------------------------");
			area=s.compute_area();
			s.display(area);
		}while(true);
		

	}

}
