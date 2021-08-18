
public class Book extends Publication{

	//data members
	private String author;
	//constructor
	Book(String type)
	{
		super(type);
		System.out.println("Author:");
		sc.nextLine();
		author=sc.nextLine();
	}
	//methods 
	public void orderCopies(int cpy)
	{
		cpy+=getCopies();
		setCopies(cpy);
	}
	public void saleCopy(int qty)
	{
		System.out.println("Total book Sale:$"+(qty*price));
	}
	//display method
	public void display()
	{
		System.out.println("-----Details of Book:-----");
		displayPublication();
		System.out.println("Author:"+author);
		
	}
}
