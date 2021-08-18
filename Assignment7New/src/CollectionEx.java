
public class CollectionEx<T> {
	T element[];
	CollectionEx(T e[]){
		element=e;
	}
//-------------------------------------------definition of display------------------------
	void display(){
		System.out.println("****Collection is****");
		for(T value:element)
			System.out.print(value+" ");
		System.out.println("\n--------------------------------------------------------------------------------");
	}
//-----------------------------------------definition of method to count even and odd numbers----------------
	int evenOdd(int c){
		int cntE=0,cntO=0;
		//-------------if element is String------------------------------------
		if(element instanceof String[]){
			System.out.println("Wrong input for even method");
			return -1;
		}
		//---------------if element is integer--------------------------------- 
		else if(element instanceof Integer[])
		{
			for(int i=0;i<element.length;i++){
				Integer x=Integer.parseInt(element[i].toString()); //Convert the element to Integer from T 
				//check for even odd
				if(x%2==0)
					cntE++;
				else
					cntO++;
			}
			
		}
		//-----------------if element is double----------------------------------------
		else if(element instanceof Double[])
		{
			for(int i=0;i<element.length;i++){
				Double x=Double.parseDouble(element[i].toString()); //Convert element to Double from T 
				//check for even or odd
				double rem=x%2;
				if((int)rem==0) //type casting for correct result
					cntE++;
				else cntO++;
			}
		}
		//depending on choice return count of even or odd
		if(c==1)
			return cntE;
		return cntO;
	}
//-----------------------------definition of Prime number---------------------------------------
	int prime(){
		int cnt=0;
		//if element is of type string
		if(element instanceof String[]){
			System.out.println("Wrong input for prime number");
			return -1;
		}
		//----------if element is of type Integer----------
		else if(element instanceof Integer[])
		{
			for(int i=0;i<element.length;i++){
				Integer x=Integer.parseInt(element[i].toString()); //convert element from T to Integer
				//check for prime number
				if(x>2) 
				{
					int j;
					for(j=3;j<x;j++){
						if(x%j==0)  //if x is divisible by any integer, break loop
							break;
					}
					if(j==x)  //if x is prime, then j=x
						cnt++;				
				}
			}
		}
		//-----if element is of type double---------------------
		else if(element instanceof Double[])
		{
			for(int i=0;i<element.length;i++){
				Double x=Double.parseDouble(element[i].toString());
				if(x>2){
					int j;
					for(j=2;j<x;j++)
					{
						double rem=x%j;
						if((int)rem==0)
							break;
					}
					if(j==x)
						cnt++;
				}
			}
		}
		return cnt;
	}
//---------------------------definition to count palindrome-----------------------------------------
	int palindrome(){
		int cnt=0;
		for(int i=0;i<element.length;i++){
			StringBuffer str=new StringBuffer(element[i].toString());
			String rev=new String(str.reverse());
			if(element[i].toString().equals(rev)){
				cnt++;
			}
		}
		return cnt;
	}
}
