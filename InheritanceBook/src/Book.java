import java.util.*;
public class Book {
	//data members
	protected String title,publisher;
	public Scanner sc=new Scanner(System.in);
	public Scanner str_sc=new Scanner(System.in);
	double cost;
	//constructor
	Book(){
		System.out.println("Enter details of book:");
	}
	public void read(){
		
	}
	public void display()
	{
		
	}
	//read method
	public void readBook()
	{
		System.out.println("Title:");
		title=str_sc.nextLine();
		System.out.println("Publisher:");
		publisher=str_sc.nextLine();
		System.out.println("Cost:");
		cost=sc.nextDouble();
	}
	//display method
	public void displayBook()
	{
		System.out.println("*****Details******");
		System.out.println("Title:"+title);
		System.out.println("Publisher:"+publisher);
		System.out.println("Cost:"+cost);
	}
}
