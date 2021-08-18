//parent class for all cars
public abstract class Car {
	carType model=null;
	
	Car(carType model){
		this.model=model;
	}
	//getter and setters
	public carType getCarType(){
		return model;
	}
	public void setCarType(carType model)
	{
		this.model=model;
	}
	//Common method to be implemented in sub classes
	abstract void construct();
}
