package OOP_Inheritence;

public class Car  extends Vehicle{

	// final:
	// 1. constant value
	// 2. to prevent method overidding and Method Hiding
	// 3. to prevent inheritance

	public void start() {
		System.out.println("Car start");
	}

	public void stop() {
		System.out.println("Car stops");
	}

	public void refuel() {
		System.out.println("Car refuel");
	}

	public static void billing() {
		System.out.println("Car billing");
	}

	// Cannot be overridden
	public static final void display() {
		System.out.println("Car display");
	}

	// Cannot be overridden
	public final void running() {
		System.out.println("Car runs");
	}

	public void payment(String cc, int cvv) {
		System.out.println("Car payment using cc : " + cc + "CVV: " + cvv);
	}

	public void payment(String upi) {
		System.out.println("Car payment using upi: " + upi);
	}
	
	@Override
	 public void engine() {
			System.out.println("Car--engine");
		}

}
