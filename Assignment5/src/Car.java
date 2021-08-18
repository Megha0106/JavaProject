import java.util.*;

public class Car implements Vehicle{
	int gear_val,speed;
	public Scanner s=new Scanner(System.in);
	Car()
	{
		gear_val=1;
		speed=0;
	}
	public void gear_change()
	{
		System.out.println("Enter\n1:Increase Power\n2:Decrese power");
		int ch=s.nextInt();
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
			speed=23;
		else if(gear_val==3)
			speed=40;
		else if(gear_val==4)
			speed=64;
		else
			speed=79;
	}
	public void speed_up()
	{
		System.out.println("Enter speed:");
		speed=s.nextInt();//enter speed
		//change gear according to speed
		if(speed==0)
			gear_val=1;
		else if(speed>0&&speed<=23)
			gear_val=2;
		else if(speed>23&&speed<=40)
			gear_val=3;
		else if(speed>40&&speed<=64)
			gear_val=4;
		else
			gear_val=5;
	}
	public void apply_break()
	{
		gear_val=1;
		speed=0;
		System.out.println("Car stopped");
	}
	public void display()
	{
		System.out.println("Gear-->"+gear_val+"Speed-->"+speed);
	}
}