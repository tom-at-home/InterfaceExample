
public class Pencil implements Price, Usable {
	private int thickness;

	public int getThickness() {
		return this.thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	@Override
	public int getPrice() {		
		return 5;
	}

	@Override
	public void use() {
		System.out.println("You are making unbelievable art.");		
	}
	
}
