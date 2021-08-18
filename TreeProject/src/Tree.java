import java.util.*;
//base class
public class Tree {
	//data members
	private String name,type;
	double size;
	Scanner sc=new Scanner(System.in);
	//constructor
	Tree(String s)
	{
		System.out.println("Details of "+s);
	}
	//read method
	void read()
	{
		System.out.println("Name of tree:");
		name=sc.next();
		System.out.println("Type:");
		type=sc.next();
		sc.next();
		System.out.println("Size in feets:");
		size=sc.nextDouble();
	}
	//display method
	void display(){
		System.out.println("Name:"+name);
		System.out.println("Type:"+type);
		System.out.println("Size:"+size+"feets");
	}
}
