
public class ShoppingCartTest {
public static void main(String args[])
{
	ShoppingCart cart=new ShoppingCart();
	Item item1=new Item("1234",60);
	Item item2=new Item("5678",40);
	cart.addItem(item1);
	cart.addItem(item2);
	cart.pay(new PaypalStrategy("suyashmore789@gmail.com","pwd"));
	cart.pay(new CreditCardStrategy("Suyash More","123456789","789","06/22"));
}
}
