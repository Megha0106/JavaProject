import java.text.DecimalFormat;
import java.util.List;
import java.util.*;


public class ShoppingCart {
List<Item> items;
public ShoppingCart()
{
	items=new ArrayList<Item>();
}
public void addItem(Item item)
{
	items.add(item);
}
public void sremoveItem(Item item)
{
	items.remove(item);
}
public int calculateTotal()
{
	int sum=0;
	for(Item item:items)
	{
		sum+=item.getPrice();
	}
	return sum;
}
public void pay(PaymentStrategy paymentMethod)
{
	int amount =calculateTotal();
	paymentMethod.pay(amount); 
}

}
