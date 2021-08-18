
interface sports
{
	int sports_marks=5;
	public void display();
}
class Test implements sports
{
	int rno,m1,m2;
	Test(int a,int b,int c)
	{
		rno=a;
		m1=b;
		m2=c;
	}
	public void display(){
		System.out.println("Roll no:"+rno);
		System.out.println("Marks:"+(m1+m2));
		System.out.println("Total marks:"+(m1+m2+sports_marks));
	}
}
public class Interface {

	public static void main(String[] args) {
		Test t=new Test(101,20,20);
		t.display();
		System.out.println("Sports marks:"+Test.sports_marks);
		System.out.println("Sports marks:"+t.sports_marks);

	}

}
