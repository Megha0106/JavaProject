import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("***Online payment for shopping cart***");
		System.out.println();
		double amount=0;
		
		int ch;
		do{
			
			System.out.println();
			//selecting mode of payment
			System.out.println("Choose mode of payment:");
			System.out.println("1:Credit card\n2:PayPal\n3:BitCoin\n0:Exit");
			System.out.print("Enter:");
			ch=sc.nextInt();
			//enter amount only if mode is correct
			if(ch==1 || ch==2 || ch==3)
			{
				System.out.print("Enter amount to be paid:"); //Enter amount to be paid
				amount=sc.nextDouble();
			}
			Context c=null;
			switch(ch){
			case 1:
				//credit card
				System.out.println("Enter credit Card No,expiry date, CVV:");
				c=new Context(new CreditCard(sc.next(),sc.next(),sc.nextInt()));
				break;
			case 2:
				//Paypal
				System.out.println("Enter mail id and password:");
				c=new Context(new PayPal(sc.next(),sc.next()));
				break;
			case 3:
				//bit coin
				System.out.println("Enter name and bitcoin No:");
				c=new Context(new Bitcoin(sc.next(),sc.nextInt()));
				break;
			case 0:
				//exit
				System.out.println("Thank you..");
				System.exit(1);
			default:
				System.out.println("Invalid choice....");
				continue;
			}
			c.executeStrategy(amount); //execute strategy for selected payment method
			
		}while(true);
		
	}

}
