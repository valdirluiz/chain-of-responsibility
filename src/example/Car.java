package example;

public class Car extends TransportHandler{

	private static final double MAX_WEIGHT = 200.0;

	@Override
	public void handleRequest(double weight) {
		if(weight<=MAX_WEIGHT){
			System.out.print("Transported with Car.");
		} else if(super.successor!=null){
			super.successor.handleRequest(weight);
		}
	}
}
