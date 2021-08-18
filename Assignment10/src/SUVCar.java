import java.util.Scanner;


public class SUVCar extends Car{

	SUVCar() {
		super(carType.SUV);
		construct();
		// TODO Auto-generated constructor stub
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("\tBuilding SUV car");
		showSUVCar(); //show SUV cars to build
	}
	//Method to show SUV cars to build
	void showSUVCar(){
		Scanner sc=new Scanner(System.in);
		int ch;
		do{
			System.out.println("-------------------------------------------");
			System.out.println("\t1:Nissan Magnite\n\t2:Kia Sonet\n\t3:Main menu");
			System.out.println("\tEnter choice:");
			ch=sc.nextInt();
			System.out.println("-------------------------------------------");
			switch(ch){
			case 1:
				System.out.println("\tBulding Nissan Magnite");
				System.out.println("\tSpecifications::");
				System.out.println("\tPrice: Rs.4.99 Lakh");
				System.out.println("\tMileage:17.7 to 19.42 kmpl");
				System.out.println("\tEngine:999cc");
				break;
			case 2:
				System.out.println("\tBulding Kia Sonet ");
				System.out.println("\tSpecifications::");
				System.out.println("\tPrice:Rs.6.72 Lakh");
				System.out.println("\tMileage:18.2 to 24.1 kmpl");
				System.out.println("\tEngine: 998 to 1493 cc");
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
