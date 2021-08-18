import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.*;
public class StudentDBClass {

	public static void main(String[] args) {
		Student s=null;
		int n;
		Scanner sc=new Scanner(System.in);
		
		try{
			//======================writing to file====================================================
			FileOutputStream fos=new FileOutputStream("DB.txt",true);
			ObjectOutputStream os=new ObjectOutputStream(fos);
			//n=sc.nextInt();
			for(int i=0;i<2;i++){
				s=new Student();
				os.writeObject(s);
				os.flush();
				System.out.println("Successfully written");
			}
			
			
			//================================reading from file==========================================
			FileInputStream fis=new FileInputStream("DB.txt");
			ObjectInputStream is=new ObjectInputStream(fis);
			
			while(is.available()!=-1)
			{
				s=(Student)is.readObject();
				System.out.println(s.s_id);
			}
			fos.close();
			os.close();
			is.close();
		}
		catch(IOException e){
			System.out.println("Exception:"+e.getMessage());
		}
		catch(ClassNotFoundException e){
			
		}
	
	}

}
