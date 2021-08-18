
import java.util.*;
import java.text.*;

//Payment strategy interface which ha pay method
interface PaymentStrategy {
	public void pay(int amount);
}

//PAYPAL method for payment which implements interface PaymentStrategy
class PaypalStrategy implements PaymentStrategy{
	private String MailId,password; 
	
	//Parammeterized constructor
	public PaypalStrategy(String email, String pwd) { 
		this.MailId=email;
		this.password=pwd;
	}
	//overriden pay method
	public void pay(int amount) {
		System.out.println("Payment of "+ amount+" rupees successfully done using PAYPAL" );
	}
}

//CREDIT CARD method for payment which implements interface PaymentStrategy
class CreditCardStrategy implements PaymentStrategy{
	private String name,cardNumber,CVV,dateOfExpiry; 
	
	//Parammeterized constructor
	public CreditCardStrategy(String nm,String CCN,String cvv,String expiryDate) {
		this.name=nm;
		this.CVV=cvv;
		this.dateOfExpiry=expiryDate;
		this.cardNumber=CCN;
	}
	//overriden pay method
	public void pay(int amount) {
		System.out.println("Payment of "+ amount+" rupees successfully done using CREDIT CARD" );
	}
}
class BitcoinStrategy implements PaymentStrategy{
	private String name;
	private int BitcoinNumber;
	
	//Parammeterized constructor
	public BitcoinStrategy(String nm,int BCno) {
		this.name=nm;
		this.BitcoinNumber=BCno;
	}
	//overriden pay method
	public void pay(int amount) {
		System.out.println("Payment of "+ amount+" rupees successfully done using BITCOIN" );
	}	
}
class UPIStrategy implements PaymentStrategy{
	private String UPI_ID;
	private int PIN;
	
	//Parammeterized constructor
	public UPIStrategy(String uid,int pw) {
		this.UPI_ID=uid;
		this.PIN=pw;
	}
	//overriden pay method
	public void pay(int amount) {
		System.out.println("Payment of "+ amount+" rupees successfully done using UPI" );
	}	
}


class ItemCost{
	private int price;
	
	//constructor to set cost
	public ItemCost(int cost){
		this.price=cost;
	}
	
	//GETTER method to get price
	public int getPrice()
	{
	return 	price; 
	}
	
}

//class to shop and calculate total
class ShoppingBill{
	
	//List of items
	List<ItemCost> items;
	
	//Array list of items
	public ShoppingBill(){
		this.items=	new	ArrayList<ItemCost>(); 
	}
	
	//Add product to cart
	public void addItem(ItemCost item){
		this.items.add(item); 
	}
	
	//Remove product to cart
	public void removeItem(ItemCost item){
		this.items.remove(item);
	}
	
	//Calculate total amount
	public int calculateTotal()	{
		int	sum=0;
	
		for	(ItemCost item : items){ 
			sum += item.getPrice(); 
		}
		return sum; 
	}
	
	//Use payment strategy to pay the bill
	public void pay(PaymentStrategy paymentMethod){
		int	amount = calculateTotal(); 
		paymentMethod.pay(amount); 
	}
	
}

public class Assinment11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingBill BillPay =new ShoppingBill(); 			//ShoppingBill class object
		//ites along with cost
		ItemCost item1 =new ItemCost(1259);					
		ItemCost item2 =new	ItemCost(576);
		ItemCost item3 =new	ItemCost(245);
		//add to cart and calclate total
		BillPay.addItem(item1);
		BillPay.addItem(item2);
		BillPay.addItem(item3);
		
		Scanner sc=new Scanner(System.in);
		int x=0;		//useful in loop
		do {
		System.out.println("----------------------------------");
		System.out.println("USE ANY ONE OF THE METHOD TO PAY");
		System.out.println("----------------------------------");
		System.out.println("1) PAYAL \n2) CREDIT CARD \n3) BITCOIN \n4) UPI PAYMENT");
		System.out.println("----------------------------------");
		
		int opn;
		System.out.print("Your choice:");
		opn=sc.nextInt();
		
		switch(opn){
			case 1:
				//pay by paypal
				BillPay .pay(new PaypalStrategy("google.gmail.com","googlemeet"));
				break;
			case 2:
				//pay by credit card
				BillPay .pay(new CreditCardStrategy("virat kohli","114578965874","222","06/24"));
				break;
			case 3:
				//pay by Bitcoin
				BillPay .pay(new BitcoinStrategy("Baburao apte",12345));
				break;
			case 4:
				//pay by UPI
				BillPay.pay(new UPIStrategy("ABCD@sbi.bank",4578));
				x=1;
				break;
		}
		}while(x==0);
		
	}

}
