//Paypal strategy
public class PayPal implements Strategy{
	String email,password;
	PayPal(String email,String password){
		this.email=email;
		this.password=password;
		
	}

	public void pay(double amount) {
		// TODO Auto-generated method stub
			System.out.println("Payment of Rs."+amount+" is successfully done by paypal");
	}

}
