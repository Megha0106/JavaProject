package shapes;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shape s=null;
		int ch;
		do{
			System.out.println("---------------------------------------------");
			System.out.println("1:Triangle\n2:Rectangle\n3Circle\n4:Exit");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			System.out.println("---------------------------------------------");
			switch(ch)
			{
			case 1:
				s=new Triangle();
				break;
			case 2:
				s=new Rectangle();
				break;
			case 3:
				break;
			case 4:
				System.out.println("Thank you...");
				System.exit(1);
			}
			int choice;
			do{
				System.out.println("1:Area\n2:Perimeter\n3:Main Menu");
				choice=sc.nextInt();
				if(choice==1)
					System.out.println("Area"+s.area());
				else if(choice==2)
					System.out.println("Perimeter:"+s.perimeter());
			}while(choice!=3);
	
		}while(true);

	}

}
