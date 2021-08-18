import java.util.*;
class Student{
	Scanner s=new Scanner(System.in);
	int rno;
	int total,total_sub;
	double avg;
	
	//--------------------------method to input values---------------------
	void input(int i)throws InputMismatchException,ArithmeticException{
		System.out.println("Enter detils of "+i+"th student-->");
		System.out.print("\tRoll number:");
		rno=s.nextInt();
		System.out.print("\tMarks:");
		total=s.nextInt();
		System.out.print("\tTotal number of subjects:");
		total_sub=s.nextInt();
		avg=total/total_sub;
	}
	//---------------------method to display details of student---------------
	void display(){
		System.out.println(rno+"\t\t"+total+"\t"+avg);
	}
}
//-------------------------------user defined exception----------------------------------------------------
class AuthenticationException extends Exception{
	AuthenticationException()
	{
		System.out.println("***Invalid passord...Do enter correct***");
	}
}
//----------------------------------driver class-------------------------------------------------------------
public class MainClass {

	public static void main(String[] args) {
		int n;
		String pass;
		Scanner sc=new Scanner(System.in);
		//---------------------authenticating user------------------------------
		System.out.println("------------------------Welcome---------------------");
		for(int i=0;i<3;i++) //only three attempts
		{
			try{
				System.out.println("Enter passord:");
				pass=sc.next();
				if(pass.equals("Password"))
					break;
				else{
					throw new AuthenticationException();
				}
			}
			catch(AuthenticationException e){
				if(i==2)
				{
					System.out.println("***Sorry..you are unauthenticated user***");
					System.exit(1);
				}
			}
		}
		System.out.println("----------------Welcome, you are authenticated user-------------------------------------");
		System.out.println("Enter total number of students:");
		n=sc.nextInt();
		Student stud[]=new Student[2];
		for(int i=0;i<n;i++)
		{
			try{
				stud[i]=new Student();
				stud[i].input(i+1);
			}
			catch(InputMismatchException e1){
				System.out.println("***Exception-->All fields should be integer only***");
				i--;
			}
			catch(ArithmeticException e2){
				System.out.println("*****Exception-->Enter valid number of total subjects*****");
				i--;
			}
			catch(ArrayIndexOutOfBoundsException e2){
				System.out.println("***Exception-->Maximum number of students should be 5***");
				n=2;
			}
			finally{
				System.out.println("-----You have entered details of "+(i+1)+"th students----");
			}
		}
		//-------------------display details of students------------------------------------------
		System.out.println("---------------------------------------------");
		System.out.println("RollNo\tTotal Marks\tAverage");
		for(int i=0;i<n;i++)
			stud[i].display();
		System.out.println("-----------------------------------------------");
		System.out.println("Thank you...");

	}

}
