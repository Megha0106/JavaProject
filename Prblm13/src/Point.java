
public class Point {
	
	double distance;
	double calculate(double x1,double y1,double x2,double y2){
		double temp=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		distance=Math.sqrt(temp);
		return distance;
		
	}

}
