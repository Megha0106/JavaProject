
public class Set <T>{
	T element1[];
	T element2[];

	Set(T []e1,T[]e2){
		element1=e1;
		element2=e2;
	}
	T[] unoin(){
		//if(element1.getClass().equals(Integer.class))
			T result[] = null;
		for(int i=0;i<element1.length;i++){
			result[i]=element1[i];
		}
		int rSize=result.length;
		for(int i=0;i<element2.length;i++){
			int flag=1;
			for(int j=0;j<this.element1.length;j++){
				if(element2[i]==this.element1[j]){
					flag=0;
					break;
				}
			}
			if(flag==1){
				rSize++;
				result[rSize]=element2[i];
			}
		}
		return result;
	}
}
