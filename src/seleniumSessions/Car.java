package seleniumSessions;

//local variable means the variable which are defined within the method and local variables cannot be static.

//class variable means the variable which are defined inside a class and class variable is also known as static variable.

public class Car {

	String name;
	int price;
	String color;
	static final int wheels = 4;
	static int steering;
	
	
	public void start() {
		System.out.println("Car can start");
	}
	
	public static void speedTest() {
		System.out.println("Car - speed test");
	}

	public static void main(String[] args) {
		
		//static int i =10; = local variables cannot be static.
		
		final int i=10;
		
		final int days =7;
		 
		System.out.println(days*100);

		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 90;
		c1.color = "Red";

		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 80;
		c2.color = "White";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 50;
		c3.color = "Blue";
		
		//how to access/assign static variables
		//no need to use the object
		//1. direct calling:
		System.out.println(wheels);
		System.out.println(c1.name +" "+c1.price+" "+c1.color+" "+ wheels);
		
		//2.by using class name:
		System.out.println(Car.wheels);
		System.out.println(c1.name +" "+c1.price+" "+c1.color+" "+ Car.wheels +" " + Car.steering);
		
		//how to call static methods:
		//no need to use the object
		//1.direct calling
		speedTest();
		c1.start();

		//2.by using class name
		Car.speedTest(); 
		
		//Static stuff can be accessed by object reference name with warnings
		c1.start();
		c1.speedTest(); // This can be used as we can call static method with object reference but 
		// Car.start(); // we cannot call nonstatic method with class name
		
		System.out.println(c1.wheels);
		
		Car.steering =1;
		System.out.println(Car.steering );
		System.out.println(c1.name +" "+c1.price+" "+c1.color+" "+ Car.wheels +" " + Car.steering);
		
	
	}

}
