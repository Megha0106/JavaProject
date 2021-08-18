package myPackage;

public class ClassC {
	ClassA obj_b=new ClassB();
	public void print_C()
	{
		System.out.println("Same package non subclass");
		System.out.println("B="+obj_b.b);
		System.out.println("C="+obj_b.c);
		System.out.println("D="+obj_b.d);
	}

}
