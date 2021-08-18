
public class MainClass {

	public static void main(String[] args) {
		Integer s1[]={1,2,3,4,5};
		Integer s2[]={3,5,7,6,8};
		
		Set<Integer>obj=new Set<Integer>(s1,s2);
		Integer U[]=obj.unoin();
		for(int i=0;i<U.length;i++)
			System.out.print(U[i]+" ");

	}

}
