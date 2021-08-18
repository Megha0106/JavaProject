import java.lang.*;
//Use getObjectSize:

public class MainClass {

    private int x;

    private int y;

    public static void main(String [] args) {
    	MainClass m=new MainClass();

        System.out.println(Instrumentation.getObjectSize(m));

    }

}