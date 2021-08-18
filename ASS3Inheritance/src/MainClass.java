import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num_prog=0,num_tl=0,num_APM=0,num_PM=0,choice;
		
		Programmer prog[]=new Programmer[20]; //array for programmers
		TeamLeader tl[]=new TeamLeader[20]; //array for team leaders
		AssProjectManager apm[]=new AssProjectManager[20]; //array for assistant project manager
		ProjectManager pm[]=new ProjectManager[20];//array for project manager
		
		do
		{
			//display main menus to user
			System.out.println("------------------------------------------------------------------");
			System.out.println("1:Add new record\n2:Display any employess\n3:Exit");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			System.out.println("-------------------------------------------------------------------");
			switch(choice)
			{
			case 1://to add new employee
				int ch;
				System.out.println("1:Programmer\n2:Team Leader\n3:Assistant ptoject manager\n4:Project Manager");
				System.out.println("Enter choice:");
				ch=sc.nextInt();
				switch(ch)//to select which employee to be added
				{
				case 1: //for programmer
					prog[num_prog]=new Programmer();
					//validating number of programmers
					if(num_prog<20)
					{
						num_prog++;
						System.out.println("Programmer added...");
					}
					else{
						System.out.println("Maximum number of programmers is 20..can't add new one");
					}
					break;
				case 2://for team leader
					tl[num_tl]=new TeamLeader();
					//validating number of team leader
					if(num_tl<20)
					{
						num_tl++;
						System.out.println("Team leader added...");
					}
					else{
						System.out.println("Maximum number of team leader is 20..can't add new one");
					}
					break;
				case 3://for assistant project manager
					apm[num_APM]=new AssProjectManager();
					if(num_APM<20)//validating number of assistant project manager
					{
						num_APM++;
						System.out.println("assistant project manager added...");
					}
					else{
						System.out.println("Maximum number of assistant project manager is 20..can't add new one");
					}
					break;
				case 4:
					pm[num_PM]=new ProjectManager();
					//validating number of project manager
					if(num_PM<20)
					{
						num_PM++;
						System.out.println("project manager added...");
					}
					else{
						System.out.println("Maximum number of project manager is 20..can't add new one");
					}
					break;
				}
				break;
			case 2://to display record
				System.out.println("1:Programmer\n2:Team Leader\n3:Assistant ptoject manager\n4:Project Manager");
				System.out.println("Enter choice:");
				ch=sc.nextInt();
				boolean found=false;
				switch(ch)
				{
				case 1://display programmer
					System.out.println("Enter id of employee:");
					int key=sc.nextInt();
					int i;
					for(i=0;i<num_prog;i++)
					{
						found=prog[i].search(key); //search for entered id
						if(found)
						{
							prog[i].display("Programmer");//display details of that employee
							break;
						}
					}
					if(i==num_prog)
						System.out.println("Programmer with id "+key+" is not available");
					break;
				case 2://display team leader
					System.out.println("Enter id of employee:");
					key=sc.nextInt();
					for(i=0;i<num_tl;i++)
					{
						found=tl[i].search(key); //search for entered id
						if(found)
						{
							tl[i].display("Team Leader");//display details of that employee
							break;
						}
					}
					if(i==num_tl)
						System.out.println("Team Leader with id "+key+" is not available");
					break;
				case 3://to display assistant project manager
					System.out.println("Enter id of employee:");
					key=sc.nextInt();
					for(i=0;i<num_APM;i++)
					{
						found=apm[i].search(key); //search for entered id
						if(found)
						{
							apm[i].display("Assistant project manager");//display details of that employee
							break;
						}
					}
					if(i==num_APM)
						System.out.println("Assistant project manager with id "+key+" is not available");
					break;
				case 4:
					System.out.println("Enter id of employee:");
					key=sc.nextInt();
					for(i=0;i<num_PM;i++)
					{
						found=pm[i].search(key); //search for entered id
						if(found)
						{
							pm[i].display("Assistant project manager");//display details of that employee
							break;
						}
					}
					if(i==num_PM)
						System.out.println("Project manager with id "+key+" is not available");
					break;
				}
				break;
			case 3:
				System.out.println("Thank You.....");
				break;
			default:
				System.out.println("Enter valid choice...");
				break;
			}
		}while(choice!=3);
	}

}
