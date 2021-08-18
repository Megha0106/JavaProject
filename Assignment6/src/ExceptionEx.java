import java.util.*;
public class ExceptionEx {

	public static void main(String[] args) {
		int n,sum=0;
		double avg;
		int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array:");
		n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			try{
				System.out.println("Enter "+(i+1)+"th element:");
				arr[i]=s.nextInt();
				sum+=arr[i];
			}
			//number format exception
			catch(InputMismatchException e1){
				s.nextLine();
				System.out.println("Please enter integer only");
				i--;
			}
			//Array index out of bounds
			catch(ArrayIndexOutOfBoundsException e2){
				System.out.println("Maximum size of array is 5 only");
				break;
			}
		}
		System.out.println("Addition of entered numbers:"+sum);
		//divide by zero exception
		try{
			System.out.println("Average:"+(sum/n));
		}
		catch(ArithmeticException e3){
			
		}

	}

}
