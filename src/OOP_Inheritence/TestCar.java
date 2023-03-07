package OOP_Inheritence;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start(); // Overridden Method
		b.stop(); // Inherited Method
		b.refuel(); // Inherited Method
		b.autoParking(); // Individual Method
		
		BMW.billing();
		Car.billing();
		
		BMW.display();
		b.running();
		
		b.payment("naveen@icici.com");
		b.engine();

		System.out.println("------------");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.payment("naveen@hdfc.com");
		c.engine();
		
		System.out.println("--------");
		
		Audi au = new Audi();
		au.theftSafety();
		au.start();
		au.engine();

		// Not possible:- c.autoParking();

		System.out.println("------------");

		// child class object can be referred by parent class reference variable
		// Top/Up Casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		// Not allowed :- c.autoParking();
		
		System.out.println("--------");
		
		// child class object can be referred by grand parent class reference variable
				// Top/Up Casting
		
		Vehicle v1= new BMW();
		v1.petrolEngine();
		v1.engine();
		
		
		//Not allowed = v1.start() and v1.stop()
		

		// down casting:
		// parent class object can be referred by child class reference variable
		BMW b1 = (BMW) new Car(); // ClassCast Exception at runtime
		
		BMW b2= (BMW) new Vehicle(); // ClassCast Exception at runtime
		

	}

}
