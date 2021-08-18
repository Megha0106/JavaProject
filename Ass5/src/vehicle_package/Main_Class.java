package vehicle_package;


import java.util.Scanner;

public class Main_Class {

	public static void main(String[] args) {
		System.out.println("********************Welcome to vehicle driving training*****************");
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("1:Car training\n2:Bike training\n3:Bicycle training");
		System.out.println("Enter choice:");
		ch=sc.nextInt();
		Vehicle c=null;
		switch(ch)
		{
		case 1:
			System.out.println("------Start car driving training------------------");
			c=new Car();
			break;
		case 2:
			System.out.println("-------Start Bike driving trianing------------------");
			c=new Bike();
			break;
		case 3:
			System.out.println("-------Start bicycle training------------------------------");
			c=new Bicycle();
			break;
		default:
				System.out.println("Enter correct type of vehicle....");
				c=null;
		}
		do {
			System.out.println("1.Gear Change\n2:Speed change\n3:Apply break");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				c.gear_change();
				c.display();
				break;
			case 2:
				c.speed_up();
				c.display();
				break;
			case 3:
				c.apply_break();
				c.display();
				System.exit(1);
				break;
			}
		} while (true);


	}

}
