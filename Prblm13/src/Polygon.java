import java.util.*;
public class Polygon extends Point{
	int n;
	double x1,y1,x2,y2,per=0;
	Scanner s=new Scanner(System.in);
	double dist[]=new double[10];
	double x[]=new double[10];
	double y[]=new double[10];
	Polygon(){
		System.out.println("Enter total number of vertex of polygon");
		n=s.nextInt();
	}
	void input(){
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Coordinates of vertex "+(i+1));
			System.out.println("x1:");
			x[i]=s.nextDouble();
			System.out.println("y1:");
			y[i]=s.nextDouble();
		}
	}
	void perimeter()
	{
		for(int i=0;i<n;i++)
		{
			x1=x[i];
			y1=y[i];
			x2=x[(i+1)%n];
			y2=y[(i+1)%n];
			dist[i]=calculate(x1,y1,x2,y2);
			per+=dist[i];
		}
		System.out.println("Perimeter of polygon:"+per);
	}

}
