
public class Magazine extends Publication {

	//data members
	private int orderQty;
	private String currIssue;
	//constructor
	Magazine(String type)
	{
		super(type);
		sc.nextLine();
		System.out.println("Current Issue:");
		currIssue=sc.nextLine();
	}
	//methods
	public void adjustQty()
	{
		System.out.println("Order Quantity:");
		orderQty=sc.nextInt();
		sc.nextLine();
		System.out.println("Current Issue:");
		String newIssue=sc.nextLine();
		recvNewIssue(newIssue);
		setCopies(orderQty);
	}
	public void recvNewIssue(String newIssue)
	{
		currIssue=newIssue;
	}
	//display method
	public void display()
	{
		
	}
	public void saleCopy(int qty)
	{
		System.out.println("Total magazine Sale:$"+(qty*price));
	}
	
}
