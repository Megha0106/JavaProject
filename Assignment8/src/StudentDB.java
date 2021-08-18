import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.util.*;
//class for student database
public class StudentDB {
	//==========Adding new record to file===================================
	void AddNew(String record){
		try{
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("StudDB.txt",true)));
			pw.println(record);
			System.out.println("\tWritten successfully...");
			pw.close();
		}
		catch(IOException e){
			System.out.println("\tException while writing to file");
		}
	}
	//=======validation====================================================
	boolean validate(int id){
		int valid=1;
		try{
			BufferedReader br1=new BufferedReader(new FileReader("StudDB.txt"));
			String record;
			 while((record=br1.readLine())!=null){
				 String line[]=record.split("\t");
				 if(id==Integer.parseInt(line[1])){
					 valid=0;
				 }
			 }
			 br1.close();
			 if(valid==1)
				 return true;
			 return false;
		}
		catch(IOException e){
			System.out.println("\tException while validating");
		}
		
		return true;
	}
	//=======read all records===============================================
	void read(){
		try{
			
			BufferedReader br1=new BufferedReader(new FileReader("StudDB.txt"));
			String record;
			System.out.println("\tName\tId\tMarks\tAddress");
			while((record=br1.readLine())!=null){
				System.out.println("\t"+record);
			}
			br1.close();
		}
		catch(IOException e){
			System.out.println("\tError while reading from file");
		}
	}
	//==================search a record================================================
	boolean search(int id){
		int found=0;
		try{
			BufferedReader br1=new BufferedReader(new FileReader("StudDB.txt"));
			String record;
			while((record=br1.readLine())!=null){
				String line[]=record.split("\t");
				
				if(id==Integer.parseInt(line[1]))
				{
					System.out.println("\tName:"+line[0]);
					System.out.println("\tID:"+line[1]);
					System.out.println("\tMarks:"+line[2]);
					System.out.println("\tAddress:"+line[3]);
					found=1;
				}
					
			}
			br1.close();
		}
		catch(IOException e){
			System.out.println("\tError while searching");
		}
		if(found==0)
			return false;
		return true;
	}
	//================delete record==============================================
	boolean delete(int id){
		int flag=0;
		try{
			BufferedReader br1=new BufferedReader(new FileReader("StudDB.txt"));
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("StudDB1.txt")));
			String record;
			while((record=br1.readLine())!=null){
				String line[]=record.split("\t");
				if(id!=Integer.parseInt(line[1]))
				{
					pw.println(record);
				}
				else{
					System.out.println("\t"
							+ "Record found...");
					flag=1;
				}
					
			}
			pw.close();
			br1.close();
			if(flag==0){
				return false;
			}
			else{
				File delfile=new File("StudDB.txt");
				File oldfile=new File("StudDB1.txt");
				File newfile=new File("StudDB.txt");
				
				if(delfile.delete()){
					if(oldfile.renameTo(newfile))
					{
						System.out.println("\tDeleted successfully...");
					}
					else{
						System.out.println("\tError in deleting");
					}
				}
				else
					System.out.println("\tError in deleting");
				
			}
		}
		catch(IOException e){
			System.out.println("\tException while deleting");
		}
		return true;
	}
	//=======update record========================================
	boolean update(int id){
		int flag=0;
		try{
			BufferedReader br1=new BufferedReader(new FileReader("StudDB.txt"));
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("StudDB1.txt")));
			String record;
			Scanner sc=new Scanner(System.in);
			while((record=br1.readLine())!=null){
				String line[]=record.split("\t");
				if(id!=Integer.parseInt(line[1]))
				{
					pw.println(record);
				}
				else{
					System.out.println("\tRecord found...");
					System.out.println("\tEnter updated details:");
					System.out.print("\tName:");
					line[0]=sc.next();
					System.out.print("\tMarks:");
					line[2]=sc.next();
					System.out.print("\tAddress:");
					line[3]=sc.next();
					pw.println(line[0]+"\t"+line[1]+"\t"+line[2]+"\t"+line[3]);
					flag=1;
				}
					
			}
			pw.close();
			br1.close();
			if(flag==0){
				return false;
			}
			else{
				File delfile=new File("StudDB.txt");
				File oldfile=new File("StudDB1.txt");
				File newfile=new File("StudDB.txt");
				
				if(delfile.delete()){
					if(oldfile.renameTo(newfile))
					{
						System.out.println("\tUpdated successfully...");
					}
					else{
						System.out.println("\tError in updating");
					}
				}
				else
					System.out.println("\tError in updating");
				
			}
		}
		catch(IOException e){
			System.out.println("\tException while updating");
		}
		return true;
	}
	//===============clear all records=============================
	void clear(){
		try{
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("StudDB.txt")));
			pw.close();
		}
		catch(IOException e){
			System.out.println("\tException while clear file opeartion");
		}
		
		
	}
	public static void main(String[] args)throws IOException {
		System.out.println("\t*******Welcome to Student database*********");
		int ch=0,id;
		StudentDB db=new StudentDB();
		Student s=null;
		BufferedReader br_k=new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("===============MENUS=============================");
			System.out.println("\t1:Add new record\n\t2:Read all records\n\t3:Search a record\n\t4:Update a record\n\t5:Delete a record\n\t6:Clear all records");
			System.out.print("\tEnter choice:");
			ch=Integer.parseInt(br_k.readLine());
			System.out.println("============================================");
			switch(ch){
			case 1:
				s=new Student();
				if(db.validate(s.id))
					db.AddNew(s.toString());
				else
					System.out.println("\tId "+s.id+" is already present");
				break;
			case 2:
				System.out.println("\tAll Records are::");
				db.read();
				break;
			case 3:
				System.out.print("\tEnter id of student:");
				id=Integer.parseInt(br_k.readLine());
				if(!db.search(id))
					System.out.println("\tRecord not found");
				break;
			case 4:
				System.out.print("\tEnter id of student:");
				id=Integer.parseInt(br_k.readLine());
				if(!db.update(id))
					System.out.println("\tRecord not found");
				break;
			case 5:
				System.out.print("\tEnter id of student:");
				id=Integer.parseInt(br_k.readLine());
				if(!db.delete(id))
					System.out.println("\tRecord not found");
				break;
			case 6:
				db.clear();
				System.out.println("\tAll records are cleared");
				break;
			case 0:
				System.out.println("\tThank you");
				break;
			}
			
		}while(ch!=0);
	}

}
