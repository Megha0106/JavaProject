package myPack;

public class Box <T, U>{

	public T ele1;
	public U ele2;
	public void set(T ele1 ,U ele2){
		this.ele1=ele1;
		this.ele2=ele2;
		
	}
	public T get(){
		return ele1;
	}
}

