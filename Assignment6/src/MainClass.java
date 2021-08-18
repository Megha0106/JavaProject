import java.util.*;
class Student{
	int rno;
	int total,total_sub;
	double avg;
	Scanner s=new Scanner(System.in);
	
	Student(int i){
		System.out.println("Enter details of "+i+"th student");
		try{
			System.out.println("\tEnter roll number:");
			rno=s.nextInt();
			System.out.println("\tEnter total marks:");
			total=s.nextInt();
			System.out.println("\tEnter total number of subjects:");
			total_sub=s.nextInt();
			avg=total/total_sub;
		}
		catch(InputMismatchException e1){
			System.out.println("Exception-->All fields should be integer only");
		}
		catch(ArithmeticException e1){
			System.out.println("Exception-->Number of subjects is 0");
		}
		
	}
	public void display(int i)
	{
		System.out.println(i+"\t"+rno+"\t"+avg);
	}
}
public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student stud[]=new Student[2];
		int n;
		System.out.println("Enter total number of students:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			try{
				stud[i]=new Student(i+1);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("***Exception-->Maximum number of student is 2***");
				n=2;
			}
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Marks of students--->");
		System.out.println("SrNo\tRoll No\tAverage Marks");
		for(int i=0;i<n;i++)
		{
			stud[i].display(i+1);
		}

	}

}
