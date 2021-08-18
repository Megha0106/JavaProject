
import java.util.*;
class Matrix
{
	//data members
	private float mat[][]=new float[10][10];
	private int m,n;
	public Scanner sc=new Scanner(System.in);
	//constructor
	Matrix()
	{
		m=3;
		n=3;
	}
	//to input values
	Matrix(int m1,int n1)
	{
		m=m1;
		n=n1;
		System.out.println("Enter elements of matrix:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Matrix["+i+"]"+"["+j+"]:");
				mat[i][j]=sc.nextFloat();
			}
		}
	}
	//methods
	//to display matrix
	public void display()
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	//addition of matrices
	public void add(Matrix m1,Matrix m2)
	{
		if((m1.m==m1.m)&&(m1.n==m2.n))
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					mat[i][j]=m1.mat[i][j]+m2.mat[i][j];
				}
			}
			System.out.println("Addition is:");
			display();
		}
		else
		{
			System.out.println("Matrices can not be added");
		}
	}
	//subtraction of matrices
	public Matrix subtract(Matrix m1)
	{
		Matrix res=new Matrix();
		if((m==m1.m)&&(n==m1.n))
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					res.mat[i][j]=mat[i][j]-m1.mat[i][j];
				}
			}
		}
		else
		{
			System.out.println("Matrices can not be subtracted");
		}
		
		return res;
	}
	//multiplication
	public void multiply(Matrix m1,Matrix m2)
	{
		
		if(m1.m==m2.m&&m1.n==m2.n)
		{
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
				{
					mat[i][j]=0;
					for(int k=0;k<n;k++)
						mat[i][j]+=m1.mat[i][k]*m2.mat[k][j];
				}
		}
		else
			System.out.print("Matrices can not be multiplied");
	}
	//transpose
	public void transpose()
	{
		Matrix Trans=new Matrix();
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				Trans.mat[i][j]=mat[j][i];
		Trans.display();
	}
}
public class Matrix_Ope {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows and columns of matrices:");
		System.out.println("Matrix1:");
		System.out.println("Rows:");
		int r=s.nextInt();
		System.out.println("Colums:");
		int c=s.nextInt();
		Matrix m1=new Matrix(r,c);
		//for matrix 2
		System.out.println("Matrix2:");
		System.out.println("Rows:");
		r=s.nextInt();
		System.out.println("Colums:");
		c=s.nextInt();
		Matrix m2=new Matrix(r,c);
		System.out.println("Matrix 1:");
		m1.display();
		System.out.println("Matrix 2:");
		m2.display();
		
		//display menus to user
		int ch;
		Matrix result=new Matrix();
		do
		{
			System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Transpose");
			System.out.println("Enter choice:");
			ch=s.nextInt();
			switch(ch)
			{
			case 1:
				result.add(m1, m2);
				break;
			case 2:
				result=m1.subtract(m2);
				result.display();
				break;
			case 3:
				result.multiply(m1, m2);
				result.display();
				break;
			case 4:
				System.out.println("1:Matrix 1\t2:Matrix 2");
				System.out.println("Enter choice:");
				int t=s.nextInt();
				if(t==1)
					m1.transpose();
				else
					m2.transpose();
				break;
			}
		}while(ch!=5);

	}

}
