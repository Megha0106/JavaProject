import myPack.Box;
class Normal{
	int x,y;
	void setNormal(){
		x=200;
		y=300;
	}
}
public class MainClass {

	public static void main(String[] args) {
		Box<Integer,String> intBox=new Box<Integer,String>();
		intBox.set(12,"hello");
		System.out.println(intBox.get());
		
		Box<String,Integer>strBox=new Box<String,Integer>();
		strBox.set("Welcome",20);
		System.out.println(strBox.ele1);
		System.out.println(strBox.ele2);
	
		Box<Normal,String> nBox=new Box<Normal,String>();
		Normal result=new Normal();
		result.setNormal();
		nBox.set(result,"ABCD");
		
		//result=nBox.get();
		System.out.println(nBox.ele2);
		System.out.println(nBox.ele1.y);
	}

}
