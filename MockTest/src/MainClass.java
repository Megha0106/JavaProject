import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Array emp[]=new Employee[Array.n]; //object creation using dynamic binding
		int n,ch;
		//enter total number of employees
		do{
		System.out.println("Enter total number of employees:(Max"+Array.n+")");
		n=s.nextInt();
		}while(n>Array.n);
		
		for(int i=0;i<n;i++){ //input details 
			emp[i]=new Employee();
			emp[i].insert();
		}
		//display menus of various operations
		do{
			System.out.println("1:Display all records\n2:Search a employee\n3:Delete last employee\n4:Add new Employee\n5:Exit");
			System.out.println("Enter choice:");
			ch=s.nextInt();
			switch(ch){
			case 1: 
				//to display records
				System.out.println("----------------------------------------------------------------------------");
				for(int i=0;i<n;i++){
					emp[i].display();
				}
				System.out.println("----------------------------------------------------------------------------");
				break;
			case 2:
				//to search employee
				int key,i;
				boolean flag;
				System.out.println("Enter id of employee to be search:");
				key=s.nextInt();
				for(i=0;i<n;i++){
					flag=emp[i].search(key);
					if(flag){
						System.out.println("------------------------");
						System.out.println("Search successful");
						System.out.println("Details of employee");
						emp[i].display();
						System.out.println("------------------------");
						break;
					}
				}
				if(i==n){
					System.out.println("Employee with id"+key+"not found");
				}
				break;
			case 3:
				//to delete employee
				n=emp[n-1].delete(n);
				break;
			case 4:
				//to add new employee
				if(n==Array.n){
					System.out.println("No more employees can be added");
				}
				else{
					emp[n].insert();
					n++;
				}
				break;
			}
		}while(ch!=5);

	}

}
