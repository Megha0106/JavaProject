import java.util.*;
//shape class
 abstract class Shape
{
	int val1,val2; //data members
	//input method
	public void input()
	{
		System.out.println("Enter dimensions:");
		Scanner sc=new Scanner(System.in);
		val1=sc.nextInt();
		val2=sc.nextInt();
		sc.close();
	}
	abstract public void compute_area();
}
//class Triangle
class Triangle extends Shape
{
	public void compute_area()//implementation of abstract method
	{
		double area=0.5*val1*val2;
		System.out.println("Area of triangle:"+area);
	}
}
//class Rectangle
class Rectangle extends Shape
{
	public void compute_area()//implementation of abstract method
	{
		double area=val1*val2;
		System.out.println("Area of rectangle:"+area);
	}
}
//driver function
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1:Triangle\n2:Rectangle\nEnter choice:");
		int choice=s.nextInt();
		s.close();
		
		if(choice==1)
		{
			Shape sh=new Triangle();
			sh.input();
			sh.compute_area();
		}
		else
		{
			 Shape sh=new Rectangle();
			sh.input();
			sh.compute_area();
		}
	}

}
