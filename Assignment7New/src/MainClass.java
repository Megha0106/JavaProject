import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//Array declaration
		Double dArr[];
		Integer iArr[];
		String sArr[];
		
		//object creation
		CollectionEx<Integer>iObj=null;
		CollectionEx<String>sObj=null;
		CollectionEx<Double>dObj=null;
		
		int ch,n;
		System.out.println("\t*************Generic Class**************");
		
		do{
			System.out.println("------------------------------------------------------------");
			//display menus to user
			System.out.print("\t1:Integer Array\n\t2:Double Array\n\t3:String Array\n\t4:Exit\n\tEnter choice:");
			ch=s.nextInt();
			
			switch(ch){
			case 1:
				//for integer array
				//input size of array
				System.out.println("Enter total number of elements:");
				n=s.nextInt();
				iArr=new Integer[n];
				
				//input array elements
				System.out.println("Enter elemets:");
				for(int i=0;i<n;i++)
					iArr[i]=s.nextInt();  
				//object initialization
				iObj=new CollectionEx<Integer>(iArr);
				//display collection
				iObj.display();
				
				System.out.println("Total even numbers:"+iObj.evenOdd(1));
				System.out.println("Total odd numbers:"+iObj.evenOdd(2));
				System.out.println("Total prime numbers:"+iObj.prime());
				System.out.println("Total palindrome numbers:"+iObj.palindrome());
				break;
			case 2:
				//for double array
				//input size of array
				System.out.println("Enter total number of elements:");
				n=s.nextInt();
				dArr=new Double[n];
				//input array elements
				System.out.println("Enter elemets:");
				for(int i=0;i<n;i++)
					dArr[i]=s.nextDouble();
				//object initialization
				dObj=new CollectionEx<Double>(dArr);
				//display collection
				dObj.display();
				
				System.out.println("Total even numbers:"+dObj.evenOdd(1));
				System.out.println("Total odd numbers:"+dObj.evenOdd(2));
				System.out.println("Total prime numbers:"+dObj.prime());
				System.out.println("Total palindrome numbers:"+dObj.palindrome());
				break;
			case 3:
				//for string array
				//input size of array
				System.out.println("Enter total number of elements:");
				n=s.nextInt();
				sArr=new String[n];
				//input array elements
				System.out.println("Enter elements:");
				for(int i=0;i<n;i++)
					sArr[i]=s.next();
				//object initialization
				sObj=new CollectionEx<String>(sArr);
				//display collection
				sObj.display();
				
				System.out.println("Total palindrome strings:"+sObj.palindrome());
				break;
			case 4:
				System.out.println("Thank you...");
				break;
			default:
					System.out.println("Invalid choice");
			}
		}while(ch!=4);
		
		System.out.println("----------------------------------------------------------------------");
	}

}
