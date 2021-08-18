import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class FileEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		//File f1=new File("New1.txt");
		//String s="hello welcome all";
		FileReader fr=null;
		//FileWriter fw=null;
		try{
			//if(f1.createNewFile())
				//System.out.println("File created");
			
			//fw=new FileWriter(f1);
			//fw.write(s);
			fr=new FileReader("New1.txt");
			
			
				
		}catch(IOException e)
		{
			System.out.println("Error occured");
		}
		int ch;
		while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
		
		//fw.close();
		fr.close();
		
	}

}
