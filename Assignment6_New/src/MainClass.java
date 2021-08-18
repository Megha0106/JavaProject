/*import java.util.*;
class Student{
	int rno,n;
	int marks[]=new int[5];
	int total=0;
	Scanner s=new Scanner(System.in);
	void input(){
		System.out.println("Enter roll number:");
		rno=s.nextInt();
		System.out.println("Enter total number of subjects:");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			try{
				System.out.println("Enter marks of "+(i+1)+"th subject:");
				marks[i]=s.nextInt();
				total+=marks[i];
			}
			//Number format exception
			catch(InputMismatchException e1){
				System.out.println("*****Exception-->Please enter integers only*****");
				i--;
			}
			//array index out of bounds exception
			catch(ArrayIndexOutOfBoundsException e2){
				System.out.println("****Exception-->Maximum subjects should be 5*****");
				break;
			}
		}
	}
	void display(){
		System.out.println("Roll number:"+rno);
		System.out.print("Average:");
		//divide by zero exception
		try{
			System.out.println(total/n);
			
		}catch(ArithmeticException e2){
			System.out.println("****Exception-->Marks are not entered****");
			
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		Student s[]=new Student[10];
		

	}

}*/
