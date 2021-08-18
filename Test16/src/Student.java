import java.util.*;
abstract public class Student {
	int rno;
	Scanner sc=new Scanner(System.in);
	void input(){
		System.out.println("Roll No:");
		rno=sc.nextInt();
	}
	abstract double sem_avg();

}
