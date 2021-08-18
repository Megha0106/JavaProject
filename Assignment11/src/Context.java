
public class Context {
	private Strategy strategy;
	
	Context(Strategy s){
		strategy=s; //set strategy to selected mode
	}
	public void executeStrategy(double amount){
		strategy.pay(amount); //calling pay for selected strategy	
	}
}
