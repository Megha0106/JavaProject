class Box{
	Object obj;
	Box(Object o){
		obj=o;
	}
	public Box getObj(){
		return this;
	}
	public boolean compare(Box o){
		return this.obj.equals(o.obj);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(10);
		Box b1=new Box(i);
		Box b2=b1.getObj();
		System.out.println(b1.compare(b2));
		

	}

}
