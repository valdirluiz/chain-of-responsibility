package example;

public class Ship extends TransportHandler{
	
	private static final double MAX_WEIGHT = 20000.0;

	@Override
	public void handleRequest(double weight) {
		if(weight<=MAX_WEIGHT){
			System.out.print("Transported with Ship.");
		} else{
			super.successor.handleRequest(weight);
		}
	}

}
