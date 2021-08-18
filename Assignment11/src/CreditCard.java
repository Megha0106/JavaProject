//Credit card strategy
public class CreditCard implements Strategy {
	String cardNo,expDate;
	int cvv;
	CreditCard(String cardNo,String expDate,int cvv)
	{
		this.cardNo=cardNo;
		this.expDate=expDate;
		this.cvv=cvv;
	}

	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment of Rs."+amount+" is successfully done by credit card");		
	}
	
}
