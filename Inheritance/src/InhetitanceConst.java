
class Shape
{
	int side1,side2;
	Shape(int i,int j)
	{
		side1=i;
		side2=j;
		System.out.println("In shape class");
	}
	public void read()
	{
		System.out.println("Side1:"+side1+"Side2="+side2);
	}
}
class Rectangle extends Shape{
	Rectangle(int i,int j)
	{
		super(i,j);
		System.out.println("In rectangle class");
	}
}
class Square extends Rectangle
{
	Square(int i,int j){
		super(i,j);
		System.out.println("In the Square");
	}
}
public class InhetitanceConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square(10,20);
		s.read();

	}

}
