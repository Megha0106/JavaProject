
public class Student {
	int rno;
	String name;
	//parameterized constructor
	Student(int a,String b)
	{
		rno=a;
		name=b;
	}
	Student(Student s)
	{
		rno=s.rno;
		name=s.name;
	}
	void display()
	{
		System.out.println(rno+"\t"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Megha");
		Student s2=new Student(s1);
		s1.display();
		s2.display();

	}

}
