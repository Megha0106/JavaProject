import java.util.*;
//Class for Small cars
public class SmallCar extends Car{

	SmallCar() {
		
		// TODO Auto-generated constructor stub
		super(carType.SMALL);
		construct();
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("\tBuilding a small car");
		showSmallCar(); //Show various small cars to build
	}
	//Method to Show various small cars to build
	void showSmallCar(){
		Scanner sc=new Scanner(System.in);
		int ch;
		do{
			System.out.println("-------------------------------------------");
			System.out.println("\t1:Maruti alto\n\t2:Honda Brio\n\t3:Main menu");
			System.out.println("\tEnter choice:");
			ch=sc.nextInt();
			System.out.println("-------------------------------------------");
			switch(ch){
			case 1:
				System.out.println("\tBulding Maruti Alto");
				System.out.println("\tSpecifications::");
				System.out.println("\tPrice: Rs.2.95 lakhs - Rs.4.41 lakhs");
				System.out.println("\tFuel economy: 22-32 km/l combined");
				System.out.println("\tSeating capacity: 4, 5");
				System.out.println("\tEngine: 0.80 L 3-cylinder, 0.80 L 3-cylinder natural gas");
				break;
			case 2:
				System.out.println("\tBulding Honda Brio");
				System.out.println("\tSpecifications::");
				System.out.println("\tPrice:Rs.5,17,000.00");
				System.out.println("\tFuel Type:Petrol");
				System.out.println("\tEngine Displacement:1198cc");
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
