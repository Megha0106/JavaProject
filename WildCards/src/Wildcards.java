
public class Wildcards<T extends Number> {

	T arr[];
	Wildcards(T a[]){arr=a;}
	double avg_cal(){
		double sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i].doubleValue();
		return sum/arr.length;
	}
	Wildcards<?> maxAvg(Wildcards<?> obj){
		if(avg_cal()>obj.avg_cal())
			return this;
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer se10[]={90,85,87,96,75,63};
		Double se11[]={89.6,4.55,78.3,56.7,89.0,23.4};
		
		Wildcards<Integer> obj10=new Wildcards<Integer>(se10);
		Wildcards<Double> obj11=new Wildcards<Double>(se11);
		
		System.out.println("Avg se10:"+obj10.avg_cal());
		System.out.println("Avg se11:"+obj11.avg_cal());
		
		if(obj10.maxAvg(obj11).equals(obj10))
			System.out.println("Max Average:SE10");
		else
			System.out.println("Max Average:SE11");
	}

}
