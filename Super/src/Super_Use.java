class Base
{
	private int a;
	public int b;
	Base(int x,int y)
	{
		a=x;
		b=y;
	}
	public void display()
	{
		System.out.println("a="+a);
	}
}
class Child extends Base{
	int b;
	Child(int x,int y,int z)
	{
		super(x,y);
		b=z;
	}
	public void display()
	{
		super.display();
		System.out.println("B="+b);
		System.out.println("B in super:"+super.b);
	}
}
public class Super_Use {

	public static void main(String[] args) {
	
		Child c=new Child(10,20,30);
		c.display();

	}

}
