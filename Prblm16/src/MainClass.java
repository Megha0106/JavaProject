
public class MainClass {

	public static void main(String[] args) {
		Student s[]=new Sem1[5];
		double temp1[]=new double[5];
		double temp2[]=new double[5];
		System.out.println("Enter details of students:");
		for(int i=0;i<2;i++)
		{
			s[i]=new Sem1();
			s[i].input();
			temp1[i]=s[i].sem_Avg();
			s[i]=new Sem2();
			s[i].input();
			temp2[i]=s[i].sem_Avg();
		}
		System.out.println("Details of students:");
		System.out.println("Name\tRoll No\tAverage\tPercentage");
		for(int i=0;i<2;i++)
		{
			double p=temp1[i]+temp2[i];
			System.out.println(s[i].name+"\t"+s[i].rno+"\t"+s[i].sem_Avg()+"\t"+p);
		}
	}

}
