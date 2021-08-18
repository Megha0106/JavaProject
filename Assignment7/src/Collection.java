import java.util.*;
public class Collection<T> {
	T element;
	private int n;
	static Scanner sc=new Scanner(System.in);
	
	Collection(T t)
	{
		element=t;
	}
	//to input the values
	public void read(){
		
		
		if(element instanceof Integer){
			element=(T)Integer.valueOf(sc.next());
		}
		else if(element instanceof String){
			
			element=(T)sc.next();
		}
		else{
			System.out.println("In else...");
		}
		
		
	}
	public void display(){
		System.out.println("***"+element+"****");
		
	}
}
