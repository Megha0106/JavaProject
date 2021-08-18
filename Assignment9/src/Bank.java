import java.util.*;
public class Bank {
	//------method to validate account number--------------------------------------
	public static boolean validate(Customer c[],int n){
		for(int i=n-1;i>=0;i--){
			if(c[i].getAccNo()==c[n].getAccNo())
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n=0,num;
		String pass;
		Scanner sc=new Scanner(System.in);
		Customer cust[]=new Customer[3];
		System.out.println("***************************Welcome to Online Banking*******************************");
		int ch;
		do{
			System.out.println("=======================================================================================================");
			System.out.println("\t1:Create new account\n\t2:Deposite amount\n\t3:Withdraw amount\n\t4:Check balance\n\t5:Display a particular record\n\t6:Display transaction history\n\t7:Display all accounts information\n\t0:Exit");
			System.out.print("\tEnter choice:");
			ch=sc.nextInt();
			System.out.println("========================================================================================================");
			//========================switch user choice=================================================
			switch(ch){
			case 1:
				//---------------------------Account creation--------------------------------
				//Only admin can create account
				System.out.print("\tEnter admin password:");
				pass=sc.next();
				if(pass.equals("admin123"))
				{
					System.out.println("\t=========Enter details for account creation========");
					try{
						cust[n]=new Customer();
						cust[n].read();
					}
					catch(InputMismatchException e){
						System.out.println("\t::Wrong input...Create again::");
						continue;
					}
					catch(ArrayIndexOutOfBoundsException e){
						System.out.print("\t::Sorry,no more records can be added::");
						
					}
					while(!validate(cust,n)){
						System.out.println("\t::Account number already exist..do enter unique::");
						System.out.print("\tAccount numner:");
						num=sc.nextInt();
						cust[n].setAccNo(num);
						cust[n].custId="CID"+Integer.toString(cust[n].getAccNo());
					}	
					n++;
					System.out.println("\t::Account created successfully::");
				}
				else{
					System.out.println("\t::Wrong password..,only admin can create account::");
				}
				break;
			case 2:
				//-----------------deposit amount------------------
				System.out.print("\tEnter account number:");
				num=sc.nextInt();
				int i;
				//search for account
				for(i=0;i<n;i++){
					if(cust[i].search(num))
						break;
				}
				//if account not found
				if(i==n){
					System.out.println("\t::Account not found::");
				}
				//if account found perform deposit operation
				else{
					if(cust[i].authenticate())
						cust[i].deposit();	
				}
				
				break;
			case 3:
				//-----------------withdraw amount------------------
				System.out.print("\tEnter account number:");
				num=sc.nextInt();
				//search account
				for(i=0;i<n;i++){
					if(cust[i].search(num))
						break;
				}
				//if account not found
				if(i==n){
					System.out.println("\t::Account not found::");
				}
				//if account found perform withdraw operation
				else{
					if(cust[i].authenticate())
						cust[i].withdraw();	
				}
				
				break;
			case 4:
				System.out.print("\tEnter account number:");
				num=sc.nextInt();
				//search for account
				for(i=0;i<n;i++){
					if(cust[i].search(num))
						break;
				}
				//if account not found
				if(i==n){
					System.out.println("::Account not found::");
				}
				//if account found perform deposit operation
				else{
					if(cust[i].authenticate())
					{
						System.out.println("\t====================================================================================");
						System.out.println("\tAccount No:"+num);
						System.out.println("\tBalance:"+cust[i].getBalance());
					}			
				}
				break;
			case 5:
				System.out.print("\tEnter account number:");
				num=sc.nextInt();
				//search for account
				for(i=0;i<n;i++){
					if(cust[i].search(num))
						break;
				}
				//if account not found
				if(i==n)
					System.out.println("\t::Account not found");
				//if account found
				else{
					if(cust[i].authenticate())
					{
						System.out.println("\tCust Id\tName\tCity\tMobileNo\tAccountNo\tBalance");
						cust[i].display();
					}
				}
				break;
			case 6:
				System.out.print("\tEnter account number:");
				num=sc.nextInt();
				for(i=0;i<n;i++)
				{
					if(cust[i].search(num))
						break;
				}
				if(i==n)
					System.out.println("\t::Account not found::");
				else{
					if(cust[i].authenticate())
						cust[i].transHistory();
				}
				break;
			case 7:
				//-----------------display information---------------------------------
				System.out.print("\tEnter admin password:");
				pass=sc.next();
				if(pass.equals("admin123")){
					if(n==0)
					{
						System.out.println("\t::No records available::");
						continue;
					}	
					System.out.println("\tCust Id\tName\tCity\tMobileNo\tAccountNo\tBalance");
					for(i=0;i<n;i++)
						cust[i].display();	
				}
				else{
					System.out.println("\t::Wrong password..,only admin can access all records::");
				}
				break;
			case 0:
				System.out.println("\t***Thank you***");
				break;
			default:
				System.out.println("\t::Invalid choice...::");	
				
			}
		}while(ch!=0);

	}

}
