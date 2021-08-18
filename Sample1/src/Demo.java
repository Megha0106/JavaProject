import java.io.*;
class A
{
	int a;
	A(){
		System.out.println("In bace");
	}
	void get(){
		System.out.print(a);
	}
}
class B extends A{
	int a;
	B(){
		System.out.println("In derives");
	}
	void get(){
		System.out.println(a);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s="abc";
		byte b[]=s.getBytes();
		ByteArrayInputStream obj1=new ByteArrayInputStream(b);
		for(int i=0;i<2;++i){
			int c;
			while((c=obj1.read())!=-1){
				if(i==0){
					System.out.print(Character.toUpperCase(c));
					
				}
			}
		}*/
		B b=new B();
	}

}
