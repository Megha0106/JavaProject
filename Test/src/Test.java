import java.util.*;

interface Shape
{
	
	int a1=20;
	void area(int a,int b);
	
}
class Triangle implements Shape{

	private int x;
	public void area(int a,int b)
	{
		System.out.println("Area of triangle:"+(0.5*a*b));

		System.out.println(a1);
	}
}
public class Test {
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.area(10,20);
	}

}
