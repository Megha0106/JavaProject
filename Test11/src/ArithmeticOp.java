import java.util.*;
public class ArithmeticOp {
	static int add(int a,int b)
	{
		return a+b;
	}
	static int sub(int a,int b){
		return a-b;
	}
	static int multi(int a,int b){
		return a*b;
	}
	static double div(int a,int b){
		return a/b;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Addition="+ArithmeticOp.add(a, b));
		System.out.println("Subtraction="+ArithmeticOp.sub(a, b));
		System.out.println("Multiplication="+ArithmeticOp.multi(a, b));
		System.out.println("Division="+ArithmeticOp.div(a, b));
	}

}
