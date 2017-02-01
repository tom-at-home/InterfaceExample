
public class Program {

	public static void main(String[] args) {
		Apple grannySmith = new Apple();
		grannySmith.setColor("green");
		Apple pinkLady = new Apple();
		pinkLady.setColor("red");
		House pinkHouse = new House();
		pinkHouse.setNumberOfRooms(12);
		Pencil superpencil = new Pencil();
		superpencil.setThickness(1);
		Car brummbrumm = new Car();
		brummbrumm.setMaxSpeed(150);
		Car slowslow = new Car();
		slowslow.setMaxSpeed(10);
		
		CheckOut checkOut = new CheckOut();
		checkOut.add(grannySmith);
		checkOut.add(pinkLady);
		checkOut.add(pinkHouse);
		checkOut.add(superpencil);
		checkOut.add(brummbrumm);
		checkOut.add(slowslow);
		System.out.println("Sum is " + checkOut.getSum());
		
		Human hans = new Human();
		hans.setName("Hans");
		
		hans.useSomething(brummbrumm);
		hans.useSomething(superpencil);
		hans.useSomething(slowslow);
		

	}

}
