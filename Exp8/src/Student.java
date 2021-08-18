import java.util.Scanner;
import java.io.Serializable;
public class Student implements Serializable {
	int s_id;
	String name,city,cls;
	double marks;
	
	
	public Student() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Roll No:");
		s_id=sc.nextInt();
		System.out.print("Name:");
		name=sc.next();
		//sc.next();
		System.out.print("City:");
		sc.next();
		System.out.print("Class:");
		sc.next();
		System.out.print("Marks:");
		marks=sc.nextDouble();
	}


	
	

}
