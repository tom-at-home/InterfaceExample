
public class Fruit implements Price {
	private int weight;

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int getPrice() {		
		return (int)(Math.random() * 10);
	}
}
