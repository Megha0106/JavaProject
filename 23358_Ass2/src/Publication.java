
import java.util.Scanner;

//Publication class
class Publication{
	//Commonalitites of the program
	protected String title;
	protected double price;
	protected int copies;
	Scanner sc = new Scanner(System.in);
	
	//Default constructor
	Publication(){
		System.out.println("Enter title: ");
		title=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter price: ");
		price=sc.nextDouble();
		System.out.println("Coies:");
		copies=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Title:"+title);
		System.out.println("Price:"+price);
		System.out.println("Copies:"+copies);
	}
	
	
	//Empty sellCopies method to show polymorphism further
	public void sellCopies(int qty) {}
	
}
