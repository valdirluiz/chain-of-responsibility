package example;

public class Client {

	
	public static void main(String[] args) {
		TransportHandler car = new Car();
		TransportHandler truck = new Truck();
		TransportHandler ship = new Ship();
		
		car.setSuccessor(truck);
		truck.setSuccessor(ship);

		car.handleRequest(300.0);
	}
	
}
