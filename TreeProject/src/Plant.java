import java.util.*;
class Plant extends Tree {

	//data members
	private int avg_lifespan;
	private String plant_Date;
	private int end_Date;
	//constructor
	Plant()
	{
		super("Plant");
	}
	//read method
	void read()
	{
		super.read();
		System.out.println("Average Lifespan:");
		avg_lifespan=sc.nextInt();
		System.out.println("Date of plantation:");
		System.out.println("Date:");
		int date=sc.nextInt();
		System.out.println("Month:");
		int month=sc.nextInt();
		System.out.println("Year:");
		int year=sc.nextInt();
		plant_Date=Integer.toString(date)+"/"+Integer.toString(month)+"/"+Integer.toString(year);
	}
	//display method
	void display()
	{
		super.display();
		System.out.println("End date:");
		System.out.println(end_Date);
	}
}
