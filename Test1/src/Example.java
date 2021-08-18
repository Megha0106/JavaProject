class MyGen<T>
{
	T ele;
	void set(T ele)
	{
		this.ele=ele;
	}
	T get(){
		return ele;
	}
}
	public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGen<Integer> obj=new MyGen<Integer>();
		obj.set(10);

	}

}
