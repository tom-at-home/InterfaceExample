
public class Human {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void useSomething(Usable usable) {
		System.out.println(this.name + " uses something.");
		usable.use();
	}
}
