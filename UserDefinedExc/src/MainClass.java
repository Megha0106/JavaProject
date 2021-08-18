import java.util.*;
class OddException extends Exception
{
	OddException()
	{
		System.out.println("Odd number");
	}
}
public class MainClass {

	public static void main(String[] args) {
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.println("Enter n:");
			n=sc.nextInt();
			if(n%2==0)
				System.out.println(n+" is even");
			else
				throw new OddException();
		}
		catch(OddException e1)
		{
			System.out.println("In catch-->"+e1);
		}
		catch(InputMismatchException e2){
			System.out.println(e2);
		}

	}

}
