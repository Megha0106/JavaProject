
import java.util.Scanner;

public class mainClass {
	//Declaring static variables 
	static int i=0,count=0,count1=0,k=0;
	static double sum,tot,sum1,tot1;
	int book_num,magazine_num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,choice; 
		Scanner sc = new Scanner(System.in);
		String str[] = new String[100];  //String array to store names of books
		int store[] = new int[100];  //integer array to store number of copies of book
		
		
		String str1[] = new String[100];   //String array to store names of magazine
		int store1[] = new int[100];  //integer array to store number of copies of magazine
		
		
		//Menu driven code
		//Choices for user to choose the operation to be performed
		int book_num,magazine_num;//total number of books and magazine
		//initialization of book array
		System.out.println("Enter total number of books:");
		book_num=sc.nextInt();
		Book book[] = new Book[book_num];   //Array of class Book
		for(int i=0;i<book_num;i++)
		{
			System.out.println("Details of book "+(i+1));
			book[i]=new Book();
			
		}
		//initialization of magazine array
		System.out.println("Enter total number of magazines:");
		magazine_num=sc.nextInt();
		Magazine magazine[] = new Magazine[100];  //Array of class Magazine
		for(int i=0;i<magazine_num;i++)
		{
			System.out.println("Detials of magazine "+(i+1));
			magazine[i]=new Magazine();
		}
		System.out.println("---------------------------------------Details of all books-------------------------------------------------------------");
		for(int i=0;i<book_num;i++)
		{
			System.out.println("-------Book----"+(i+1));
			book[i].display();
		}
		System.out.println("------------------------------Details of all magazines-------------------------------");
		for(int i=0;i<magazine_num;i++)
		{
			System.out.println("------Magazine-----"+(i+1));
			magazine[i].display();
		}
		
		do {
			
			System.out.println("1. Order from publication \n2. Current bill \n3. publication sale \n4. your cart \n5. Exit");
			
			ch=sc.nextInt();
			
			switch(ch)
			{
			//case to order either book or magazine
			case 1: 
			{
				//Menu driven
				//choices ,to either order book or order magazine
				System.out.println("\n1. Order book. \n2. Order Magazine");
				choice=sc.nextInt();
				switch(choice)
				{
				//case to order book
				case 1:
				{
					count++;
					while(i<count)
					{
						System.out.println((i+1)+")");
						book[i].orderCopies();  //calling orderCopies method from Book class
						sum=book[i].sellCopies();  //sale of the Book store in sum
						str[i]=book[i].retTitle();  //storing title of book
						store[i]=book[i].retNewBookQty();  //storing order qty of book
						tot+=sum;
						i++;
					}
					System.out.println("Book added in the cart :)");
					break;
				}
				
				//case to order magazine
				case 2: 
				{
					count1++;
					while(k<count1)
					{
						System.out.println((k+1)+")");
						magazine[k]=new Magazine();
						magazine[k].recieveIssue(); //calling recieveIssue method from magazine class
						sum1=magazine[k].sellCopies(sum); //sale of magazine stored in sum
						str1[k]=magazine[k].retTitle(); //storing title of magazine 
						store1[i]=magazine[k].retNewMagazineQty(); //storing order qty. of magazine
						tot1+=sum1;
						k++;
					}
					System.out.println("Magazine added in the cart :)");
					break;
				}
				}
				break;
			}
			
			//case to display sale of Books and Magazine
			case 2:
			{
				System.out.println("Book sale: "+tot);
				System.out.println("Magazine sale: "+tot1);
				break;
			}
			
			//case to display sale of publication
			case 3:
			System.out.println("Publication Sale: "+(tot+tot1));
			break;
			
			//case to display the list of books and magazines in the cart
			case 4:
			{
				System.out.println("Your cart ......");
				for(int j=0 ; j<i ; j++) {
					book[j]=new Book();
					System.out.println((j+1)+")");
					System.out.println("Book: "+str[j]);
					System.out.println("Copies ordered: "+store[j]);
				}
				for(int j=0 ; j<k ; j++) {
					magazine[j]=new Magazine();
					System.out.println((j+1)+")");
					System.out.println("Magazine: "+str1[j]);
					System.out.println("Copies ordered: "+store1[j]);
				}
				break;
			}
			
			//empty case to exit the application
			case 5: 
				System.out.println("Application exited successfully :)");
				break;
			}
			
		}while(ch!=5);
	}

}
