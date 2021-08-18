package vehicle_package;
import java.util.*;
public class Bike implements Vehicle{
	int gear_val,speed;
	Scanner sc=new Scanner(System.in);
	Bike()
	{
		gear_val=1;
		speed=0;
		System.out.println("****Bike is started****");
	}
	//-----------gear change method------------------------------------------------------------------------------
	public void gear_change(){
		System.out.println("Enter\n1:Gear Up\n2:Gear Down");
		int ch=sc.nextInt();
		if(ch==1)//increase gear
		{
			if(gear_val==1)
				System.out.println("At highest gear");
			else
				gear_val--;
		}
		else{//decrease gear
			if(gear_val==5)
				System.out.println("At lowest gear");
			else
				gear_val++;
		}
		//setting speed
		if(gear_val==1)
			speed=0;
		else if(gear_val==2)
			speed=15;
		else if(gear_val==3)
			speed=25;
		else if(gear_val==4)
			speed=35;
		else
			speed=45;
		
	}
	//--------------------Speed change method---------------------------------------------
	public void speed_up(){
		System.out.println("Enter speed:");
		speed=sc.nextInt();//enter speed
		//change gear according to speed
		if(speed==0)
			gear_val=1;
		else if(speed>0&&speed<=15)
			gear_val=2;
		else if(speed>15&&speed<=25)
			gear_val=3;
		else if(speed>25&&speed<=35)
			gear_val=4;
		else
			gear_val=5;
		
	}
	//----------------------Apply breaks method----------------------------
	public void apply_break(){
		gear_val=1;
		speed=0;
		System.out.println("Bike stopped");
		
	}
	//---------------------display methods---------------------------------
	public void display(){
		System.out.println("Gear-->"+gear_val+"Speed-->"+speed);
	}
	

}
