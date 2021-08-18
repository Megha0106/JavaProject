import java.util.*;
public class Employee implements Array{

	//data members of Employee
	String name;
	int id;
	double salary;
	Scanner sc=new Scanner(System.in);
	
	//implementing method
	//------------------------insert method-----------------------------
	public void insert(){
		System.out.println("Enter details of employee");
		System.out.println("Name:");
		name=sc.nextLine();
		System.out.println("ID:");
		id=sc.nextInt();
		System.out.println("Salary:");
		salary=sc.nextDouble();
		
	}
	//----------------------search method-------------------------
	public boolean search(int id){
		if(this.id==id)
			return true;
		return false;
	}
	//--------------------------delete method-------------------
	public int delete(int n){
		//displays the details of deleted employee and reduces size of array by 1
		System.out.println("Details of employee deleted:");
		sc.nextLine();
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println();
		return n-1;
		
	}
	//-------------------display method--------------------
	public void display(){
		System.out.println(name+"\t"+id+"\t"+salary);
	}
	
}
