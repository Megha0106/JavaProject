import java.util.*;
public class Sem2 extends Student{

	double s[]=new double[5];
	Scanner sc=new Scanner(System.in);
	void input(){
		System.out.println("Enter marks of 2nd sem:");
		for(int i=0;i<5;i++)
		{
			s[i]=sc.nextDouble();
		}
		
	}
	double sem_avg()
	{
		double total=0;
		for(int i=0;i<5;i++)
		{
			total+=s[i];
		}
		return total/5;
	}

}
