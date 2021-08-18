import java.util.*;
class PasswordExc extends Exception{
	PasswordExc(){
		System.out.println("\t::Wrong password...Do enter correct...::");
	}
}
public class Transaction extends Account{
	
	
	double amount;
	String pass,date;
	ArrayList<String>transType;
	ArrayList<Double>transAmount;
	ArrayList<String>transDate;
	Transaction(){
		transType=new ArrayList<String>();
		transAmount=new ArrayList<Double>();
		transDate=new ArrayList<String>();
	}
	
	//=================authenticate user=====================
	public boolean authenticate(){
		for(int i=1;i<=3;i++){
			try{
				System.out.print("\tAccount password:");
				pass=s.next();
				if(pass.equals(getPass()))
					break;
				throw new PasswordExc();
			}
			catch(PasswordExc e){
				if(i==3)
				{
					System.out.println("\t::Sorry.., you are not authenticated user, try after some time::");
					return false;
				}
			}
		}
		return true;
	}
	//==================withdraw method======================
	public void withdraw(){
		
		System.out.print("\tEnter amount to be withdraw:");
		amount=s.nextDouble();
		if(amount>balance)
			System.out.println("\t::Sorry....,Your account does not have enough balance::");
		else
		{
			balance=balance-amount;
			transType.add("Withdraw");
			System.out.print("\tEnter date:");
			date=s.next();
			transDate.add(date);
			transAmount.add(amount);
			System.out.println("\t***Successful transition....***");
		}			
	}
	//=====================deposit method=========================
	public void deposit(){
		System.out.print("\tEnter amount to be deposited:");
		amount=s.nextDouble();
		balance=balance+amount;
		System.out.print("\tEnter date:");
		date=s.next();
		transType.add("Deposite");
		transDate.add(date);
		transAmount.add(amount);
		System.out.println("\t***Successful trasaction........**");
	}
	//============display transaction history===========================
	public void transHistory(){
		System.out.println("\tDate\t\tType\tAmount");
		for(int i=0;i<transDate.size();i++){
			System.out.println("\t"+transDate.get(i)+"\t"+transType.get(i)+"\t"+transAmount.get(i));
		}
	}
}
