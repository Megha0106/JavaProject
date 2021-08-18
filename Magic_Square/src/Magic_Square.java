import java.util.*;
public class Magic_Square {
	
	//creating matrix
	int mat[][]=new int[10][10];
	int n;
	Magic_Square(int n1)
	{
		n=n1;
		for(int i=0;i<n;i++)//initialize all values to 0
			for(int j=0;j<n;j++)
				mat[i][j]=0;
	}
	void create_magic_square()
	{
		int i=0;
		int j=n/2;
		int count=1;
		mat[i][j]=count;
		for(count=2;count<=n*n;count++)
		{
			//case 1->if i and j both are at first row and fist column resp.
			if((i-1)<0&&(j-1)<0)
			{
				i++;
			}
			//case 2->if i is at first row and j is within the matrix
			else if((i-1)<0)
			{
				//move i to last row and j to left
				i=n-1;
				j--;
			}
			//case 3->if j is at first column and i is within the matrix
			else if((j-1)<0)
			{
				//move j to last column and i to left
				j=n-1;
				i--;
			}
			//case 4->if at i and j the element is already present
			else if(mat[i-1][j-1]!=0)//move to next row only
				i++;
			else
			{
				i--;
				j--;
			}
			//place the element
			mat[i][j]=count;
		}
		
	}
	//display matrix
	void display()
	{
		//printing the matrix
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(mat[i][j]+"\t");
			System.out.println("");
		}
	}
	

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		Magic_Square ms=new Magic_Square(n);
		ms.create_magic_square();
		ms.display();
	}

}
