import java.util.*;
public class Lineaer extends Matrix {
	Scanner s=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter equations:");
		for(int i=0;i<3;i++)
		{
			System.out.println("Equation"+(i+1));
			for(int j=0;j<4;j++)
			{
				System.out.println("X,y and z:");
				matrix[i][j]=s.nextDouble();
			}
		}
	}
	void calculate(){
		double d[][] = { 
		        { matrix[0][0], matrix[0][1], matrix[0][2] }, 
		        { matrix[1][0], matrix[1][1], matrix[1][2] }, 
		        { matrix[2][0], matrix[2][1], matrix[2][2] }, 
		    }; 
		      
		    // Matrix d1 using coeff as given in cramer's rule 
		    double d1[][] = { 
		        { matrix[0][3], matrix[0][1], matrix[0][2] }, 
		        { matrix[1][3], matrix[1][1], matrix[1][2] }, 
		        { matrix[2][3], matrix[2][1], matrix[2][2] }, 
		    }; 
		      
		    // Matrix d2 using coeff as given in cramer's rule 
		    double d2[][] = { 
		        { matrix[0][0], matrix[0][3], matrix[0][2] }, 
		        { matrix[1][0], matrix[1][3], matrix[1][2] }, 
		        { matrix[2][0], matrix[2][3], matrix[2][2] }, 
		    }; 
		      
		    // Matrix d3 using coeff as given in cramer's rule 
		    double d3[][] = { 
		        { matrix[0][0], matrix[0][1], matrix[0][3] }, 
		        { matrix[1][0], matrix[1][1], matrix[1][3] }, 
		        { matrix[2][0], matrix[2][1], matrix[2][3] }, 
		    }; 
		    
		    double D=deter(d);
		    double D1=deter(d1);
		    double D2=deter(d2);
		    double D3=deter(d3);
		    if (D != 0)  
		    { 
		        // Coeff have a unique solution. Apply Cramer's Rule 
		        double x = D1 / D; 
		        double y = D2 / D; 
		        double z = D3 / D; // calculating z using cramer's rule 
		        System.out.println("Value of x is : %.6f\n"+x); 
		        System.out.println("Value of y is : %.6f\n"+ y); 
		        System.out.println("Value of z is : %.6f\n"+z); 
		    } 
		      
		    // Case 2 
		    else 
		    { 
		        if (D1 == 0 && D2 == 0 && D3 == 0) 
		            System.out.println("Infinite solutions\n"); 
		        else if (D1 != 0 || D2 != 0 || D3 != 0) 
		            System.out.println("No solutions\n"); 
		    } 
		  
		
		
	}

}
