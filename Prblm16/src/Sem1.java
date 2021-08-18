
public class Sem1 extends Student {

	int s1,s2,s3,s4,s5;
	void input(){
		super.input();
		System.out.println("Enter marks of 5 subjects of fisrt sem out of 100:");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
	}
	double sem_Avg(){
		int sum=s1+s2+s3+s4+s5;
		return sum/5;
	}
}
