interface Calculation<T>{
	int add(T t1,T t2);
	int sub(T t1,T t2);
	int multi(T t1,T t2);
	int div(T t1,T t2);
}
public class MainClass<U extends Number> implements Calculation<U>  {

	public int add(U num1,U num2){
		return num1.intValue()+num2.intValue();
	}
	public int sub(U num1,U num2){
		return num1.intValue()-num2.intValue();
	}
	public int multi(U num1,U num2){
		return num1.intValue()*num2.intValue();
	}
	public int div(U num1,U num2){
		return num1.intValue()/num2.intValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation<Integer>intObj=new MainClass<Integer>();
		System.out.println("Addition:"+intObj.add(10, 20));
		
		Calculation<Double>dObj=new MainClass<Double>();
		System.out.println("Addition:"+dObj.add(10.5, 20.8));
		
	}

}
