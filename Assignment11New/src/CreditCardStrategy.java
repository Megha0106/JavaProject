
public class CreditCardStrategy implements PaymentStrategy{
	private String name,cardnumber,cvv,dateofexpiry;
	public CreditCardStrategy(String name, String cardnumber, String cvv, String dateofexpiry) {
		this.name=name;
		this.cardnumber=cardnumber;
		this.cvv=cvv;
		this.dateofexpiry=dateofexpiry;
	}
	public void pay(int amount)
	{
		System.out.println(amount+" paid with credit/debit card..!!");
	}

}
