package example;

public class Truck extends TransportHandler {

	private static final double MAX_WEIGHT = 2000.0;
	
	@Override
	public void handleRequest(double weight) {
		if(weight<=MAX_WEIGHT){
			System.out.print("Transported with Truck.");
		} else if(super.successor!=null){
			super.successor.handleRequest(weight);
		}
	}
}
