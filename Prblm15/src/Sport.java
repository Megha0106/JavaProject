
public class Sport extends Bike {
	double price;
	public void specification(){
		System.out.println("Enter specifications:");
		sc.nextLine();
		System.out.println("Color:");
		color=sc.next();
		System.out.println("CC:");
		cc=sc.nextInt();
		System.out.println("Weight:");
		weight=sc.nextInt();
		System.out.println("Average:");
		avg=sc.nextDouble();
		System.out.println("Price:");
		price=sc.nextDouble();
	}
	public void display()
	{
		System.out.println(color+"\t"+cc+"\t"+weight+"\t"+avg+"\t"+price);
	}

}
