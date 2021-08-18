import java.util.*;
//TextBook class
class TextBook extends Book{
	//data members
	int isbn;
	String author;
	int edition;
	public void read()
	{
		readBook();
		System.out.println("ISBN No.:");
		isbn=sc.nextInt();
		sc.reset();
		System.out.println("Author:");
		author=str_sc.nextLine();
		System.out.println("Edition:");
		edition=sc.nextInt();
	}
	public void display()
	{
		displayBook();
		System.out.println("Author:"+author);
		System.out.println("Edition:"+edition);
	}
}
//Magazine class
class Magazine extends Book
{
	String type;

	public void read()
	{
		readBook();
		System.out.println("Enter type of magazine:");
		type=str_sc.nextLine();
	}
	public void display()
	{
		displayBook();
		System.out.println("Type:"+type);
	}
}
//Journal class
class Journal extends Book
{
	int dao_no,issn_no,frequency;
	String domain,date_str;
	Date d;

	public void read()
	{
		readBook();
		System.out.println("DAO No.:");
		dao_no=sc.nextInt();
		System.out.println("ISSN No.:");
		issn_no=sc.nextInt();
		System.out.println("Domain:");
		domain=str_sc.nextLine();
		System.out.println("Frequency:");
		frequency=sc.nextInt();
	}
	public void display()
	{
		displayBook();
		System.out.println("DAO No.:"+dao_no);
		System.out.println("ISSN No.:"+issn_no);
		System.out.println("Domain:"+domain);
		System.out.println("Freqquency:"+frequency);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("1:Text Book\n2:Magzine\n3:Journal");
		System.out.println("Enter choice:");
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
			Book t=new TextBook();
			t.read();t.display();
			break;
		case 2:
			Magazine m=new Magazine();
			m.read();
			m.display();
			break;
		case 3:
			Journal j=new Journal();
			j.read();
			j.display();
			break;
		}

	}

}
