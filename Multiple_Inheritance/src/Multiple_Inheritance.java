interface sports{
	int sports_marks=5;
	void display();
}
class Test{
	int m1,m2,rno;
	Test(int a,int b,int c)
	{
		rno=a;m1=b;m2=c;
	}
}
class Result extends Test implements sports{
	Result(int a,int b,int c)
	{
		super(a,b,c);
	}
	public void display()
	{
		System.out.println("Roll no:"+rno);
		System.out.println("Marks:"+(m1+m2));
		System.out.println("Total marks:"+(m1+m2+sports_marks));
	}
}
public class Multiple_Inheritance {

	public static void main(String[] args) {
		Result r=new Result(101,20,20);
		r.display();

	}

}
