
public class Matrix {
	double matrix[][]=new double[3][4];
	public double deter(double mat[][])
	{
		double ans=0;
		ans = mat[0][0] * (mat[1][1] * mat[2][2] - mat[2][1] * mat[1][2]) 
		      - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0]) 
		      + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]); 
		return ans;
	}
}
