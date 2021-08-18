import java.util.*;
public class Fraction {
	int dem,num;
	Scanner s=new Scanner(System.in);
	Fraction(int a,int b){
		num=a;
		dem=b;
	}

	void add(Fraction f)
	{
		int n=(num*f.dem)+(f.num*dem);
		int d=(dem*f.dem);
		System.out.println("Addition="+n+"/"+d);
	}
}
