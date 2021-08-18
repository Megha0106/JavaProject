class Box<T>{
	private T[]t;
	Box(T[]t){
		this.t=t;
	}
	public double sum(){
		double temp=0;
		for(int i=0;i<t.length;i++)
			temp=temp+t[i].hashCode();
		return temp;
	}
}
public class ArrayEx {

	public static void main(String[] args) {
		Integer ele[]={10,20,30,40,50};
		Box<Integer>b=new Box<Integer>(ele);
		double summ=b.sum();
		System.out.println(summ);

	}

}
