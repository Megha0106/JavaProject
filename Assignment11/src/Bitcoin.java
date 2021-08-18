//Bitcoin strategy
public class Bitcoin implements Strategy {
	String name;
	int BNo;
	Bitcoin(String name,int BNo){
		this.name=name;
		this.BNo=BNo;
	}

	public void pay(double amount) {
		// TODO Auto-generated method stub
			System.out.println("Payment of Rs."+amount+" is successfully done by BitCoin");
	}
	

}
