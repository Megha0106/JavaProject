import java.util.*;
public class MainClass {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");

		Fraction f=new MixedFraction(s.nextInt(),s.nextInt());
		System.out.println("Enter second number:");
		Fraction f1=new MixedFraction(s.nextInt(),s.nextInt());
		f.add(f1);
	}

}
