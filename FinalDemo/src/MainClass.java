abstract class Parent{
	int a;
	Parent(){
		a=10;
	}
	void run(){
		System.out.println("Run");
	}
	abstract void display();
}
class Child extends Parent{
	void display(){
		System.out.println("Display");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c= new Child();
		System.out.println(c.a);
		c.run();
		c.display();
	}

}
