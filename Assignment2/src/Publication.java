import java.util.*;
public class Publication {

	//data members
	protected String title;
	protected double price;
	protected int copies;
	public Scanner sc=new Scanner(System.in);
	//constructor to assign data members
	Publication(String type)
	{
		System.out.println("Enter details of "+type);
		System.out.println("Title:");
		title=sc.nextLine();
		System.out.println("Price:");
		price=sc.nextDouble();
		System.out.println("Copies:");
		copies=sc.nextInt();
		
	}
	//member functions
	public int getCopies()
	{
		return copies;
	}
	public void setCopies(int copy)
	{
		copies=copy;
	}
	public void saleCopy(int qty)
	{
		System.out.println("Total Publication Sale:$"+(qty*price));
	}
	//display publication
	public void displayPublication()
	{
		System.out.println("Title:"+title);
		System.out.println("Price:"+price);
		System.out.println("Total Copies:"+copies);
	}
}
