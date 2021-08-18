import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int book_num,magazine_num; //total number of books and magazine
		double total_book_price=0,total_magazine_price=0;
		
		//enter total of books
		System.out.println("Enter number of books:");
		book_num=s.nextInt();
		
		//enter total number of magazines
		System.out.println("Enter total number of magazine:");
		magazine_num=s.nextInt();
		
		//array of book
		Publication b[]=new Book[book_num];
		
		//initialization of book array
		for(int i=0;i<book_num;i++)
		{
			System.out.println("-----Enter details of book "+(i+1)+"-----");
			b[i]=new Book();
		}
		//array of magazine
		Publication m[]=new Magazine[magazine_num];
		//initialization of magazine array
		for(int i=0;i<magazine_num;i++)
		{
			System.out.println("-----Enter details of magazine "+(i+1)+"-----");
			m[i]=new Magazine();
		}
		int choice;
		String key;
		boolean found;
		do
		{
			s.nextLine();
			System.out.println("---------------------------------------------------");
			System.out.println("1:Display all books\n2:Display all magazine\n3:Order a book\n4:Order a magazine\n5:Sell a book\n6:Sell a magazine\n7:Exit");
			System.out.println("Enter choice:");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("------------------------------Details of books------------------------------------");
				System.out.println("Title\tAuthor\tPrice\tCopies");
				for(int i=0;i<book_num;i++)
				{
					b[i].display();
				}
				break;
			case 2:
				System.out.println("------------------------------Details of Magazines------------------------------------");
				System.out.println("Title\tCurrentIssue\tPrice\tCopies");
				for(int i=0;i<magazine_num;i++)
				{
					m[i].display();
				}
				break;
			case 3:
				s.nextLine();
				System.out.println("Enter title of book to be ordered:");
				key=s.nextLine();
				found=false;
				int i;
				for(i=0;i<book_num;i++)
				{
					found=b[i].search(key);
					if(found)
					{
						b[i].orderCopies();
						break;
					}
						
				}
				if(i==book_num)
					System.out.println("Book is not in stock");
				break;
			case 4:
				s.nextLine();
				System.out.println("Enter title of magazine to be ordered:");
				key=s.nextLine();
				found=false;
				for(i=0;i<magazine_num;i++)
				{
					found=m[i].search(key);
					if(found)
					{
						m[i].adjustQty();
						break;
					}
				}
				if(i==magazine_num)
					System.out.println("Book is not in stock");
				break;
			case 5:
				s.nextLine();
				System.out.println("Enter title of book to be sold:");
				key=s.nextLine();
				found=false;
				for(i=0;i<book_num;i++)
				{
					found=b[i].search(key);
					if(found)
					{
						s.nextLine();
						System.out.println("Enter number of copies to be sold:");
						int n=s.nextInt();
						double temp_price=b[i].sellCopy(n);
						total_book_price+=temp_price;
						break;
					}
				}
				if(i==book_num)
					System.out.println("Book is not in stock");
				break;
			case 6:
				s.nextLine();
				System.out.println("Enter title of magazine to be sold:");
				key=s.nextLine();
				found=false;
				for(i=0;i<magazine_num;i++)
				{
					found=m[i].search(key);
					if(found)
					{
						s.nextLine();
						System.out.println("Enter number of copies:");
						int n=s.nextInt();
						double temp_price=m[i].sellCopy(n);
						total_magazine_price+=temp_price;
						break;
					}
				}
				if(i==magazine_num)
					System.out.println("Book is not in stock");
				break;
			case 7:
				System.out.println("Total book price:"+total_book_price);
				System.out.println("Total magazine price:"+total_magazine_price);
				System.out.println("Total Bill:"+(total_book_price+total_magazine_price));
				System.out.println("Thank you...");
				break;
			}
		}while(choice!=7);
	}

}
