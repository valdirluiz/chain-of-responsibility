package example;

public abstract class TransportHandler {

	protected TransportHandler successor;
	
	public void setSuccessor(TransportHandler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(double weight);
	
}
