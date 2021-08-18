import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Book b=new Book("Book");
		Magazine m=new Magazine("Magazine");
		System.out.println("1:Order Book\n2:Order Magazine");
		int ch=s.nextInt();
		if(ch==1)
		{
			System.out.println("Enter how many copies are to be added to stock:");
			int ordercpy=s.nextInt();
			b.orderCopies(ordercpy);
			b.saleCopy(ordercpy);
		}
		else
		{
			m.adjustQty();
			m.saleCopy(m.getCopies());
		}
		
	}

}
