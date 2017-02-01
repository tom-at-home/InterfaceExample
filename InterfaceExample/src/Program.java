
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

		VendingMachine vendingMachine = new VendingMachine();
		Cola cola1 = new Cola();
		Cola cola2 = new Cola();
		OrangeJuice orangeJuice1 = new OrangeJuice();
		OrangeJuice orangeJuice2 = new OrangeJuice();
		OrangeJuice orangeJuice3 = new OrangeJuice();
		OrangeJuice orangeJuice4 = new OrangeJuice();
		vendingMachine.addBeverage(cola1);
		vendingMachine.addBeverage(cola2);
		vendingMachine.addBeverage(orangeJuice1);
		vendingMachine.addBeverage(orangeJuice2);
		vendingMachine.addBeverage(orangeJuice3);
		vendingMachine.addBeverage(orangeJuice4);
		vendingMachine.showBeverages();

		OneEuro oneEuro1 = new OneEuro();
		OneEuro oneEuro2 = new OneEuro();
		OneEuro oneEuro3 = new OneEuro();
		TenEuro tenEuro = new TenEuro();

		vendingMachine.showValue();
		vendingMachine.addValue(oneEuro1);
		vendingMachine.addValue(tenEuro);
		vendingMachine.showValue();
		vendingMachine.getBeverage(2);
		vendingMachine.showValue();
		vendingMachine.showBeverages();

		vendingMachine.getBeverage(0);
		vendingMachine.showValue();
		vendingMachine.showBeverages();

		vendingMachine.getBeverage(0);
		vendingMachine.showValue();
		vendingMachine.showBeverages();

		vendingMachine.getBeverage(0);
		vendingMachine.showValue();
		vendingMachine.showBeverages();

		vendingMachine.getBeverage(0);
		vendingMachine.showValue();
		vendingMachine.showBeverages();

		vendingMachine.getBeverage(0);
		vendingMachine.showValue();
		vendingMachine.showBeverages();
		//System.out.println(cola1.getName() + " " + cola1.getPrice());



	}

}
