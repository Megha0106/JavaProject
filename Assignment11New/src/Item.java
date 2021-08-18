
public class Item {
private String upcCode;
private int price;
public Item(String upccode,int price)
{
	this.upcCode=upccode;
	this.price=price;
}
public String getUpcCode()
{
	return upcCode;
}
public int getPrice()
{
	return price;
}
}
