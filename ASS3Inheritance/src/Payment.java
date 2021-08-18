

public class Payment extends Employee {
	double bp,da,hra,pf,cf,gs,ns;
	//constructor
	public Payment()
	{
		do{
			sc.nextLine();
			System.out.println("Basic Pay(minimum 5000):");
			bp=sc.nextDouble();
		}while(bp<=5000);
		da=(97.0/100)*bp;
		hra=(10.0/100)*bp;
		pf=(12.0/100)*bp;
		cf=(0.1/100)*bp;
		gs=bp+da+hra;
		double deduction=cf+pf;
		ns=gs-deduction;
	}
	//method to display
	public void display(String des)
	{
		super.display(des);
		System.out.println("Gross Salary:"+gs);
		System.out.println("Net Salary:"+ns);
		System.out.println("-----------------------------------------------------------------");
	}
}
