
import java.util.*;
//base class
public class Employee {
	//data members
	private int emp_id;
	private String name,address,mail_id;
	private long mbl_no;
	Scanner sc=new Scanner(System.in);
	//constructor
	public Employee()
	{
		System.out.println("Enter details:");
		System.out.println("Id:");
		emp_id=sc.nextInt();
		sc.nextLine();
		System.out.println("Name:");
		name=sc.nextLine();
		System.out.println("Address:");
		address=sc.nextLine();
		System.out.println("Mail Id:");
		mail_id=sc.nextLine();
		sc.nextLine();
		System.out.println("Mobile Number:");
		mbl_no=sc.nextLong();
	}
	//display method
	public void display(String des)
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Id:"+emp_id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Mail Id:"+mail_id);
		System.out.println("Mobile No.:"+mbl_no);
		System.out.println("Designation:"+des);
	}
	public boolean search(int key)
	{
		if(key==emp_id)
			return true;
		return false;
	}

}
