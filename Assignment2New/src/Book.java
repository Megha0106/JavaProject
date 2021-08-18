
public class Book extends Publication{

	private String author;
	//constructor
	Book()
	{
		sc.nextLine();
		System.out.println("Author:");
		author=sc.nextLine();
	}
	//method to order copies
	public void orderCopies()
	{
		int n;
		sc.nextLine();
		System.out.println("Enter number of copies to be ordered:");
		n=sc.nextInt();
		setCopies(getCopies()+n);
		
	}
	//method to sell copy
	public double sellCopy(int n)
	{
		int x=getCopies();
		if(x>=n)
		{
			setCopies(x-n);
			System.out.println("Book sell price:"+(n*getPrice()));
			return n*getPrice();
		}
		else
		{
			System.out.println("Only "+getCopies()+" are avaliable");
			return 0;
		}
	}
	//method to display book
	public void display()
	{
		System.out.println(getTitle()+"\t"+author+"\t"+getPrice()+"\t"+getCopies());
	}
	
}
