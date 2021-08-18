import java.util.*;
//base class
public class Publication {

	private String title;
	private double price;
	private int copies;
	Scanner sc=new Scanner(System.in);
	//constructor to set values
	Publication()
	{
		System.out.println("Title:");
		title=sc.nextLine();
		
		System.out.println("Price:");
		price=sc.nextDouble();
		System.out.print("Copies:");
		copies=sc.nextInt();
	}
	//methods
	public String getTitle()
	{
		return title;
	}
	public double getPrice()
	{
		return price;
	}
	public int getCopies()
	{
		return copies;
	}
	//method to set copies
	public void setCopies(int c)
	{
		copies=c;
	}
	//method to search
	public boolean search(String key)
	{
		if(key.equalsIgnoreCase(title))
			return true;
		return false;
	}
	public double sellCopy(int n)
	{
		System.out.println("Total bill:"+(n*price));
		return n*price;
	}
	public void display(){}
	public void orderCopies(){}
	public void adjustQty(){}
}
