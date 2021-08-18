import java.util.*;
public class MixedFraction extends Fraction {
	int improper;
	Scanner sc=new Scanner(System.in);
	MixedFraction(int a,int b){
		super(a,b);
		System.out.println("Enter improper:");
		improper=sc.nextInt();
		num=(improper*dem)+num;
		
	}
	

}
