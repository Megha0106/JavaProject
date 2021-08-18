
//package dynamic;

import java.util.Scanner;

//base class
abstract class shape{
	//data members 
	 double side1,side2,area;
	Scanner sc=new Scanner(System.in);
	abstract void read() ;//input method for reading data members
  abstract void compute_area(); //compute_area method for calculate and display area 
  
  
}
//class triangle is the derived class of shape   
class triangle extends shape{
	//override the read method
	void read() {
		System.out.println("enter the base of triangle");
		side1=sc.nextDouble();//reading value of side1
		System.out.println("enter the altitude of triangle");
		side2=sc.nextDouble();//reading value of side2
	}
	//override the compute_area
	void compute_area() {
		area=0.5*side1*side2;
		System.out.println("area of triangle is ::: "+ area);
	}

}

//class rectangle is the derived class of shape
class rectangle extends shape{
	//override
	void read() {
		System.out.println("enter the length of rectangle");
		side1=sc.nextDouble();//reading value of side1
		System.out.println("enter the breadth of rectangle");
		side2=sc.nextDouble();//reading value of side2
	}
	
	//override
	void compute_area() {
		area=side1*side2;
		System.out.println("area of triangle is :::"+ area);
	}
}

public class Dynamic_Binding {

	public static void main(String[] args) {
	     shape s=null;
	     int ch;
	     int repeat;
	     Scanner sc=new Scanner(System.in);
	     //sc.close();
	     do {
	    	 System.out.println("*********AREA*********");
	    	 System.out.println("ENTER 1 FOR TRIANGLE ");
	    	 System.out.println("ENTER 2 FOR RECTANGLE ");
	    	 System.out.println("#### ENTER CHOICE ####");
	    	ch=sc.nextInt();
	    	 
	    	switch(ch)
	    	{
	    	case 1:
	    		s=new triangle();//object of triangle class
	    		s.read();//calling the read method as per choice
		    	s.compute_area();//calling compute_area method as per choice
	    		break;
	    	case 2:
	    		s=new rectangle();//object of rectangle class
	    		s.read();//calling the read method as per choice
		    	s.compute_area();//calling compute_area method as per choice
	    		break;
	    		default:
	    			System.out.println("Enter valid choice...");
	    	}

	    	 
	    	 System.out.println("ENTER 1 FOR MAIN MENU OR 0 TO EXIT :: ");
	         repeat=sc.nextInt();
	     }while(repeat!=0);
	     System.out.println("!!!!! PROGRAM ABORTED !!!!! ");
		}
	

	}


