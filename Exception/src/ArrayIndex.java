import java.util.*;
public class ArrayIndex {

	public static void main(String[] args) {
		int n;
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			try{
				arr[i]=s.nextInt();
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception:"+e);
			}
		}
		System.out.println("Array elements:");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);

	}

}
