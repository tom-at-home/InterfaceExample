
public class House implements Price {
	private int numberOfRooms;

	public int getNumberOfRooms() {
		return this.numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	@Override
	public int getPrice() {		
		return 100000 + this.numberOfRooms * 18000;
	}
}
