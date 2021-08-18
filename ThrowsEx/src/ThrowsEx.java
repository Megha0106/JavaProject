import java.util.*;
public class ThrowsEx {

	int a,b;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	double divide()throws ArithmeticException
	{
		if(b==0)
			throw new ArithmeticException("/ by zero");
		return(a/b);
		
	}
	int multi()
	{
		return a*b;
	}
	public static void main(String[] args) {
		ThrowsEx obj=new ThrowsEx();
		obj.input();
		int a[]={1,2,3,4,5};
		System.out.println(a[4]);
		System.out.println("Division="+obj.divide());
		System.out.println("Multiplication="+obj.multi());
		
		

	}

}
