
public class Customer extends Transaction{
	String name;
	String custId;
	String city;
	long mblNo;
	//===================read method=====================
	public void read(){
		System.out.println("\t====Customer details:===");
		System.out.print("\tName:");
		name=s.nextLine();
		System.out.print("\tCity:");
		city=s.next();
		System.out.print("\tMobile No:");
		mblNo=s.nextLong();
		super.read();
		custId="CID"+Integer.toString(getAccNo());
	}
	//============display method=========================
	public void display(){
		System.out.print("\t"+custId+"\t"+name+"\t"+city+"\t"+mblNo+"\t");
		super.display();
		
	}

}
