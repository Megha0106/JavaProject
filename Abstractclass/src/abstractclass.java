import java.util.Scanner;

abstract class shape
{
	private
	    double x,y;
	abstract public void compute_area();
	double getx()
	{
		return x;
	}
	double gety()
	{
		return y;
	}
	void setx(double value)
	{
		x=value;
	}
	void sety(double value)
	{
		y=value;
	}
}

class triangle extends shape
{
	public void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of triangle");
		setx(sc.nextDouble());
		System.out.println("Enter breadth of triangle");
		sety(sc.nextDouble());
	}
	public void compute_area() {
		System.out.println("Area of the triangle is:"+getx()*gety()/2);
	}
}

class rectangle extends shape
{
	public void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle ");
		setx(sc.nextDouble());
		System.out.println("Enter breadth of rectangle");
		sety(sc.nextDouble());
	}
	public void compute_area()
	{
		System.out.println("Area of the rectangle is:"+getx()*gety());
	}
}

public class abstractclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Enter 1 for triangle,2 for rectangle,0 to exit.");
		   
			choice=sc.nextInt();
			
		    switch(choice) {
		    case 1:
		    	triangle t = new triangle();
		    	t.read();
		    	t.compute_area();
		    	break;
		    case 2:
		    	rectangle r = new rectangle();
		    	r.read();
		    	r.compute_area();
		    	break;
		    case 0 :
		    	System.out.println("Thank You!!!");
		    	break;
		    default : System.out.println("Enter valid input");
		    }
		}while(choice!=0);
	}
}