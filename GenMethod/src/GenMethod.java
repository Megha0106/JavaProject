public class GenMethod{
	public static <T> void printArr(T[] ele){
		for(T val:ele)
		{
			System.out.println(val);
		}
	}
	public static void main(String[] args)
	{
		Integer iArr[] = {10,20,30,40};
		String sArr[] = {"abd","xyz"};
		System.out.println("Integer array:");
		printArr(iArr);
		System.out.println("String array:");
		printArr(sArr);
	}
}