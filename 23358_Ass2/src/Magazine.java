

import java.util.Scanner;

//class Magazine inherited from Publication class
class Magazine extends Publication{
	protected int orderMagaQty,newMagaQty=0;
	protected String currentIssue;
	
	//Default constructor
	Magazine(){
		super(); //inherited default constructor from base class
		sc.nextLine();
		System.out.println("Current Issue:");
		currentIssue=sc.nextLine();
	}
	
	//method to return title of magazine (overridden)
	public String retTitle() {
		return title;
	}
	
	//Method to order Magazines from publication
	public void recieveIssue() {
		System.out.println("Enter the number of copies of magazine to be ordered: ");
		sc.nextLine();
		orderMagaQty=sc.nextInt();
		newMagaQty+=orderMagaQty;
	}
	
	//Method to return number of copies of a magazine ordered
	public int retNewMagazineQty() {
		return newMagaQty;
	}
	
	//Method to return total sale of magazines (polymorphism , overriding)
	public double sellCopies(double total) {
		total+=newMagaQty*price;
		return (total);
		
		//return (newMagaQty*price);
	}
	public void display()
	{
		super.display();
		System.out.println("Current Issue:"+currentIssue);
	}
	
}
