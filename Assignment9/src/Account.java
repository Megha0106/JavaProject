import java.util.*;
//Base class
public class Account {
	Scanner s=new Scanner(System.in);
	//---------------------data members---------------------------------
	private int accNo;
	private String password;
	protected double balance;
	//================================Methods=====================================================
	//======read method=========================
	public void read()throws InputMismatchException{
		System.out.println("\t===Account details:===");
		System.out.print("\tAccount number:");
		accNo=s.nextInt();
		System.out.print("\tPassword:");
		password=s.next();
		do{
			System.out.print("\tInitial balanace(Minimum 1000):");
			balance=s.nextDouble();
		}while(balance<1000);
	}
	//=================display method==========================
	public void display(){
		System.out.println(accNo+"\t"+balance);
	}
	//=============getter and setter for account number================
	public int getAccNo(){
		return accNo;
	}
	public void setAccNo(int num){
		accNo=num;
	}
	//========getter for password=======================================
	public String getPass(){
		return password;
	}
	public double getBalance(){
		return balance;
	}
	//==================method to search account=================
	public boolean search(int num){
		if(num==accNo)
			return true;
		return false;
	}
	
	
}
