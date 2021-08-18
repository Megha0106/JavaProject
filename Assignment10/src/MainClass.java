import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			//Take user input
			System.out.println("================Main Menus================");
			System.out.println("1:Small Cars\n2:Luxury cars\n3:Sedan Cars\n4:SUV Cars\n0:Exit");
			System.out.print("Enter choice:");
			choice=sc.nextInt();
			System.out.println("==========================================");
			switch(choice){
			case 1:
				//build small car
				CarFactory.bulidCar(carType.SMALL);
				break;
			case 2:
				//build luxury car
				CarFactory.bulidCar(carType.LUXURY);
				break;
			case 3:
				//build sedan car
				CarFactory.bulidCar(carType.SEDAN);
				break;
			case 4:
				//build SUV car
				CarFactory.bulidCar(carType.SUV);
				break;
			case 0:
				System.out.println("\tThank You..");
				break;
			}
			
		}while(choice!=0);

	}

}
