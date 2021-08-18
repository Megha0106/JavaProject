import java.util.*;
abstract public class Bike {
	String Bike_name,Brand_name;
	String color;
	int chasis_no,cc,weight;
	double avg;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		sc.nextLine();
		System.out.println("Enter details of bike:");
		System.out.println("Bike name:");
		Bike_name=sc.nextLine();
		System.out.println("Brand name:");
		Brand_name=sc.nextLine();
		System.out.println("Chasis No:");
		chasis_no=sc.nextInt();
	}
	void display(){
		System.out.print(Bike_name+"\t"+Brand_name+"\t"+chasis_no);
	}
	abstract void specification();

}
