import java.util.*;
public class Library {
	static Scanner sc=new Scanner(System.in);
	//data members
	public Book b=new Book();
	int availableBooks;
	//definition of read method
	public void readBook()
	{
		b.input();
		System.out.print("Enter number of available books:");
		availableBooks=sc.nextInt();
	}
	//definition of display book
	public void displayBook()
	{
		b.display();
		System.out.println("Available Books="+availableBooks+"\n");
	}
	//definition of search book
	public boolean searchLibrary(String key)
	{
		if(availableBooks!=0)
		{
			boolean val=b.searchBook(key);
			return val;
		}
		return false;	
			
	}
	//definition of issue book
	public boolean issueBook()
	{
		if(availableBooks==0)
		{
			return false;
		}
		else
		{
			availableBooks--;;
			return true;
		}
	}
	//definition of return book
	public void returnBook()
	{
		availableBooks++;
	}
	//main method
	public static void main(String[] args) {
		//enter number of books
		System.out.println("Enter number of books:");
		int n=sc.nextInt();
		Library lib[]=new Library[n];
		for(int i=0;i<n;i++)
		{
			lib[i]=new Library();
			lib[i].readBook();;
		}
		int choice;;
		String key;
		boolean found;
		//do while loop
		do
		{
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1:Search book\n2:Issue Book \n3:Return Book\n4:Display All books\n5:Exit");
			choice=sc.nextInt();
			System.out.println("-----------------------------------------------------------------------------");
			Scanner str_sc=new Scanner(System.in);
			switch(choice)
			{
			case 1://search book
				System.out.println("Enter title of book to be search:");//enter search key
				key=str_sc.next();
				int count=0;
				//search book
				for(int i=0;i<n;i++)
				{
					found=lib[i].searchLibrary(key);
					if(found)
					{
						lib[i].displayBook();
						count++; //if book with key title found, increase count
					}
					
				}
				if(count==0)//if count is 0, book is not available
				System.out.println("Book not available");
				break;
			case 2://issue book
				System.out.println("Enter title of book to be issue:");
				key=str_sc.next();
				count=0;
				boolean issue_flag=false;
				for(int i=0;i<n;i++)
				{
					found=lib[i].searchLibrary(key);
					if(found)
					{
						issue_flag=lib[i].issueBook();
						count++; //if book with key title found, increase count
						System.out.println("Book issued");
						if(issue_flag)
							break;
					}
					
				}
				if(count==0||!issue_flag)//if count is 0, book is not available
					System.out.println("Book not available");
				break;
			case 3://return book
				System.out.println("Enter title of book to be return:");
				key=str_sc.next();
				count=0;
				for(int i=0;i<n;i++)
				{
					found=lib[i].b.searchBook(key);
					if(found)
					{
						lib[i].returnBook();
						count++; //if book with key title found, increase count
						System.out.println("Book returned");
						break;
					}
					
				}
				if(count==0)//if count is 0, book is not available
					System.out.println("Book not available");
				break;
			case 4://display all books
				for(int i=0;i<n;i++)
					lib[i].displayBook();
				
				break;
			case 5:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Enter valid choice");	
			}
		}while(choice!=5);
		sc.close();
	}

}
