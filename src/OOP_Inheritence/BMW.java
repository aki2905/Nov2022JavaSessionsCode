package OOP_Inheritence;

public class BMW extends Car {

	// Method Overriding : Polymorphism -Runtime /dynamic
	// when we have a method in parent class and the same method in child class:
	// with the same method name
	// with the same number of parameters
	// with the same sequence of parameters
	// with the same return type
	// static method cannot be overridden

	@Override
	public void start() {
		System.out.println("BMW starts");
	}

	public void autoParking() {
		System.out.println("BMW autoParking");
	}

	// Method Hiding
	public static void billing() {
		System.out.println("BMW billing");
	}

	@Override
	public void payment(String cc, int cvv) {
		System.out.println("BMW payment using cc : " + cc + "CVV: " + cvv);
	}

	@Override
	public void payment(String upi) {
		System.out.println("BMW payment using upi: " + upi);
	}

	@Override
	public void engine() {
		System.out.println("BMW--engine");
	}

}
