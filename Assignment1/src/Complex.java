/*
 * Title: Arithmetic operations on complex numbers
 * Author: Megha Sonavane (23355)
 * Date: 8/8/2020
 * */

import java.util.*;
public class Complex {
	//data members
	private float real,imaginary;
	
	
	//defining default constructor
	Complex()
	{
		real=0;
		imaginary=0;
	}
	//defining parameterized constructor
	Complex(float r,float img)
	{
		real=r;
		imaginary=img;
			}
	//Function to addition 
	public Complex addition(Complex c)
	{
		Complex result=new Complex();
		result.real=real+c.real;
		result.imaginary=imaginary+c.imaginary;
		return result;
	}
	//function for subtraction
	public Complex subtraction(Complex c)
	{
		Complex result=new Complex();
		result.real=real-c.real;
		result.imaginary=imaginary-c.imaginary;
		return result;
	}
	//function for multiplication
	public Complex multiply(Complex c)
	{
		Complex result=new Complex();
		result.real=(real*c.real)-(imaginary*c.imaginary);
		result.imaginary=(real*c.imaginary)+(imaginary*c.real);
		return result;
	}
	//function for division
	public Complex division(Complex c)
	{
		Complex result=new Complex();
		result.real=((real*c.real)+(imaginary*c.imaginary))/((c.real*c.real)+(c.imaginary*c.imaginary));
		result.imaginary=((imaginary*c.real)-(real*c.imaginary))/((c.real*c.real)+(c.imaginary*c.imaginary));
		return result;
	}
	//function to display values
	public void display()
	{
		System.out.println(real+"+"+imaginary+"i");
	}
	//main function
	public static void main(String[] args) {
		//Creating object
		Complex c[]=new Complex[2];
		float r,img;
		int choice;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			//input the values
			System.out.println("Enter real part of "+(i+1)+":");
			r=sc.nextFloat();
			System.out.println("Enter imaginary part of "+(i+1)+":");
			img=sc.nextFloat();
			c[i]=new Complex(r,img);
		}
		Complex result=new Complex();  //object for display result
		do
		{
			//display menus to user
			System.out.println("----------------------------------------------------------------");
			System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Exit");
			System.out.println("Enter choice:"); //entering choice
			choice=sc.nextInt();
			System.out.println("----------------------------------------------------------------");
			switch(choice) //switch choice of user
			{
			case 1:
				result=c[0].addition(c[1]);
				System.out.print("Addition=");
				result.display();
				break;
			case 2:
				result=c[0].subtraction(c[1]);
				System.out.print("Subtraction=");
				result.display();
				break;
			case 3:
				result=c[0].multiply(c[1]);
				System.out.print("Multiplication=");
				result.display();
				break;
			case 4:
				result=c[0].division(c[1]);
				System.out.print("Division=");
				result.display();
				break;
			case 5:
				System.out.println("End of program");
				break;
			default:
					System.out.println("Enter valid choice");
			}
		}while(choice!=5);
		sc.close();
	}
}
