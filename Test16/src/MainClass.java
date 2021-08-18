
public class MainClass {

	public static void main(String[] args) {
		Student[]obj1=new Sem1[2];
		Student[] obj2=new Sem2[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter details of "+(i+1)+"student:");
			obj1[i]=new Sem1();
			obj1[i].input();
			obj2[i]=new Sem2();
			obj2[i].input();
		}
		System.out.println("Details of student:");
		System.out.println("Roll No\tSem1\tSem2\tPercentage");
		for(int i=0;i<2;i++)
		{
			double p=(obj1[i].sem_avg()+obj2[i].sem_avg())/2;
			System.out.println(obj1[i].rno+"\t"+obj1[i].sem_avg()+"\t"+obj2[i].sem_avg()+"\t"+p);
		}

	}

}
