
public class Car implements Price, Usable {
	private int maxSpeed;

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public int getPrice() {
		return this.maxSpeed*200;
	}

	@Override
	public void use() {
		System.out.println("you are driving with " + this.maxSpeed + "km/h."); 
		
	}
}
