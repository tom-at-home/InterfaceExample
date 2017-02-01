
public class CheckOut {
	private int sum = 0;
	
	public void add(Price price) {
		this.sum += price.getPrice();
	}
	public int getSum() {
		return this.sum;
	}
}
