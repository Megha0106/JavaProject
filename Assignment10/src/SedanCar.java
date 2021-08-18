import java.util.Scanner;


public class SedanCar extends Car{

	SedanCar() {
		// TODO Auto-generated constructor stub
		super(carType.SEDAN);
		construct();
		
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("\tBulding Sedan car");
		showSedanCar(); //show sedan cars to build
	}
	//Method to show sedan cars to build
	void showSedanCar(){
		Scanner sc=new Scanner(System.in);
		int ch;
		do{
			System.out.println("-------------------------------------------");
			System.out.println("\t1:Skoda Rapid\n\t2:Honda Amaze\n\t3:Main menu");
			System.out.println("\tEnter choice:");
			ch=sc.nextInt();
			System.out.println("-------------------------------------------");
			switch(ch){
			case 1:
				System.out.println("\tBulding Skoda Rapid");
				System.out.println("\tSpecifications::");
				System.out.println("\tPrice: Rs.7.49 - 13.29 Lakh");
				System.out.println("\tFuel economy: 16-19 km/l combined");
				System.out.println("\tEngine:999cc");
				break;
			case 2:
				System.out.println("\tBulding Honda Amaze ");
				System.out.println("\tSpecifications::");
				System.out.println("\tPrice:Rs.6.17 lakhs - Rs.9.99 lakhs");
				System.out.println("\tSeating capacity: 4, 7");
				System.out.println("\tEngine: 1.2 L 4-cylinder, 1.5 L 4-cylinder diesel");
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
