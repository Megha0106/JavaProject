import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total number of vehicles:");
		n=s.nextInt();
		Bike b[]=new Bike[n];
		for(int i=0;i<n;i++){
			System.out.println("1:Cruiser\n2:Sports");
			int ch=s.nextInt();
			if(ch==1)
				b[i]=new Cruiser();
			else 
				b[i]=new Sport();
			b[i].input();
			b[i].specification();
		}
		for(int i=0;i<n;i++)
			b[i].display();

	}

}
