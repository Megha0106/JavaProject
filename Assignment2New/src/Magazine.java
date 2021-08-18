
public class Magazine extends Publication {
	private int orderQty;
	private String currIssue;
	//constructor
	Magazine()
	{
		sc.nextLine();
		System.out.println("Current Issue:");
		currIssue=sc.nextLine();
	}
	//method to adjust quantity
	public void adjustQty()
	{
		sc.nextLine();
		System.out.println("Enter order quantity:");
		orderQty=sc.nextInt();
		setCopies(getCopies()+orderQty);
	}
	void recNewIssue()
	{
		sc.nextLine();
		System.out.println("Enter current Issue:");
		currIssue=sc.nextLine();
	}
	//method to sell copy
		public double sellCopy(int n)
		{
			int x=getCopies();
			if(x>=n)
			{
				setCopies(x-n);
				System.out.println("Total sell price:"+(n*getPrice()));
				return n*getPrice();
			}
			else
			{
				System.out.println("Only "+getCopies()+" are avaliable");
				return 0;
			}
		}
	public void display()
	{
		System.out.println(getTitle()+"\t"+currIssue+"\t"+getPrice()+"\t"+getCopies());
	}
}
