
import java.util.Scanner;

//class Book inherited from Publication
class Book extends Publication{
	//data members of Book class (protected)
	protected String Author,currentIssue;
	protected double total=0;
	protected int orderBookQty,newBookQty=0;
	
	//Default constructor
	Book(){
		sc.nextLine();
		System.out.println("Author:");
		Author=sc.nextLine();  //Author string initialized
	}
	
	//Method to return title of Book
	public String retTitle() {
		return title;
	}
	
	//Method to order books from the publication
	public void orderCopies() {
		System.out.println("Enter author: ");
		sc.nextLine();
		Author=sc.nextLine();
		System.out.println("Enter number of copies you want to order: ");
		orderBookQty=sc.nextInt();
		newBookQty+=orderBookQty;
	}
	
	//method to return number of books ordered
	public int retNewBookQty() {
		return newBookQty;
	}
	
	//Method to return total sale of books (polymorphism)
	public double sellCopies() {
		total+=newBookQty*price;
		return (total);
	}
	public void display()
	{
		super.display();
		System.out.println("Author:"+Author);
	}
	
}