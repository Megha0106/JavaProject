import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Student {
	String name;
	int id;
	String address;
	double marks;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	Student(){
		try{
			System.out.println("\tEnter student's details");
			System.out.print("\tName:");
			name=br.readLine();
			System.out.print("\tId:");
			id=Integer.parseInt(br.readLine());
			System.out.print("\tMarks:");
			marks=Double.parseDouble(br.readLine());
			System.out.print("\tAddress:");
			address=br.readLine();
		}
		catch(IOException e){
			System.out.println("\tError while reading");
		}
	}
	public String toString(){
		return name+"\t"+id+"\t"+marks+"\t"+address;
	}
}
