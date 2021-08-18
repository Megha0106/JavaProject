package newPack;
import myPackage.*;
public class ClassE {
	ClassA obj_E=new ClassA();
	public void Print_E()
	{
		System.out.println("Another package non subclass");
		System.out.println("B="+obj_E.b);
	}

	public static void main(String[] args) {
		ClassA obj1=new ClassA();
		ClassB obj2=new ClassB();
		ClassC obj3=new ClassC();
		ClassD obj4=new ClassD();
		ClassE obj5=new ClassE();
		obj1.print_A();
		obj2.print_B();
		obj3.print_C();
		obj4.print_D();
		obj5.Print_E();

	}

}
