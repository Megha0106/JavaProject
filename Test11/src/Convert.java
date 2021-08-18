import java.util.*;
public class Convert {
	static Scanner sc=new Scanner(System.in);
	int h,m,s;
	int sec;
	Convert(int sec)
	{
		this.sec=sec;
		h=sec/3600;
		m=(sec-(h*3600))/60;
		s=(sec-(h*3600)-(m*60));
	}
	void display(){
		System.out.println("Total seconds-->"+sec);
		System.out.println("In 'Hours::Minutes::seconds' format");
		System.out.println(h+"::"+m+"::"+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sec;
		System.out.println("Enter seconds:");
		sec=Convert.sc.nextInt();
		Convert c=new Convert(sec);
		c.display();

	}

}
