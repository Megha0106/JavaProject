import java.util.Scanner;

public class LuxuryCar extends Car{

	LuxuryCar() {
		// TODO Auto-generated constructor stub
		super(carType.LUXURY);
		construct();
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("\tBuliding luxury car");
		showLuxuryCar(); //Show luxury cars to build 
	}
	//method to Show luxury cars to build
	void showLuxuryCar(){
		Scanner sc=new Scanner(System.in);
		int ch;
		do{
			System.out.println("-------------------------------------------");
			System.out.println("\t1:Audi A6\n\t2:Volvo XC90\n\t3:Main menu");
			System.out.println("\tEnter choice:");
			ch=sc.nextInt();
			System.out.println("-------------------------------------------");
			switch(ch){
			case 1:
				System.out.println("\tBulding Audi A6");
				System.out.println("\tSpecifications::");
				System.out.println("\tPrice: Rs.54.43 Lakh");
				System.out.println("\tFuel economy: 14 km/l combined");
				System.out.println("\tEngine:2.0 L 4-cylinder");
				break;
			case 2:
				System.out.println("\tBulding Volvo XC90 ");
				System.out.println("\tSpecifications::");
				System.out.println("\tPrice:Rs.80.91 Lakh");
				System.out.println("\tSeating capacity: 4, 7");
				System.out.println("\tEngine: 2.0 L 4-cylinder, 2.0 L 4-cylinder diesel");
				break;
			case 3:
				System.out.println("\tBack to main menus");
				break;
			default:
				System.out.println("\tEnter valid choice..");
			}
		}while(ch!=3);
	
		
	}
}
