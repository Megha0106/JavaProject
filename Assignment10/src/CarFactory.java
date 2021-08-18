//class to instantiate car instance by its type
public class CarFactory {
	public static Car bulidCar(carType model){
		Car car=null;
		switch(model)
		{
		case SMALL:
			car=new SmallCar();
			break;
		case LUXURY:
			car=new LuxuryCar();
			break;
		case SEDAN:
			car=new SedanCar();
			break;
		case SUV:
			car=new SUVCar();
			break;
		}
		return car;
	}

}
