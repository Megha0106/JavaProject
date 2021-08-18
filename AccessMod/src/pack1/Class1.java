package pack1;

public class Class1 {
	int x;
	public void read()
	{
		x=10;
	}
	void readdata()
	{
		read();
	}

}
class class3
{
	void readclass3()
	{
		Class1 c=new Class1();
		c.x=20;
		c.readdata();
	}
}
