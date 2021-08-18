import java.util.*;
public class Book {
	private int isbn_no;
	private String title,publisher;
	private String[]author=new String[10];
	private double cost;
	int num_author;
	Scanner sc=new Scanner(System.in);
	Scanner str_sc=new Scanner(System.in);
	//method to input
	public void input()
	{
		System.out.println("Enter details of book :");
		System.out.println("ISBN No:");
		isbn_no=sc.nextInt();
		System.out.println("Title:");
		title=str_sc.nextLine();
		System.out.println("Enter number of authors of book:");
		num_author=sc.nextInt();
		for(int i=0;i<num_author;i++)
		{
			System.out.println("Author"+(i+1)+":");
			author[i]=str_sc.nextLine();
			
		}
			
		System.out.println("Publisher:");
		publisher=str_sc.next();
		System.out.println("Cost:");
		cost=sc.nextDouble();
	}
	//method to display
	public void display()
	{
		System.out.println("*******Details*********");
		System.out.println("ISBN No:"+isbn_no);
		System.out.println("Title:"+title);
		System.out.println("Authors:");
		for(int i=0;i<num_author;i++)
			System.out.println((i+1)+":"+author[i]);
		System.out.println("Publisher:"+publisher);
		System.out.println("Cost:Rs."+cost);
	}
	//method to search book
	public boolean searchBook(String key)
	{
		if(title.equalsIgnoreCase(key))
			return true;
		return false;
	}
}
