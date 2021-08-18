package vehicle_package;
import java.util.*;
public class Bicycle implements Vehicle {
	int gear_val,speed;
	Scanner sc=new Scanner(System.in);
	Bicycle()
	{
		gear_val=0;
		speed=0;
		System.out.println("***Bicycle is started***");
	}
	//-----------gear change method------------------------------------------------------------------------------
	public void gear_change(){
		System.out.println("Enter gear value:");
		gear_val=sc.nextInt();
		if(gear_val<0||gear_val>18)
		{
			System.out.println("It should be in range 0 to 18");
			gear_change();
		}
			
	}
	//--------------------Speed change method------------------------------------------------------------------
	public void speed_up(){
		System.out.println("Enter speed:");
		speed=sc.nextInt();
		
	}
	//----------------------Apply breaks method----------------------------
	public void apply_break(){
		gear_val=0;
		speed=0;
		System.out.println("Bicycle stopped");
		
	}
	//---------------------display methods---------------------------------
	public void display(){
		System.out.println("Gear-->"+gear_val+"Speed-->"+speed);
	}
	

}
