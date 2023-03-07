package OOP_Interface;

public interface USMedical extends WHO, USHG {
	
	//Interface variables are always static and final by default
	int min_fee = 10;
	
	
	//Abstract method: A method which is not having a method body
	//In interface, we cannot have a method body.
	//only method declaration  - no business logic
	//only method prototype
	
	//cannot create the object of interface
	//cannot have the constructor of interface
	
	//Abstract Methods:
	//final - Not applicable
	//static - Not applicable
	//private - Not applicable
	
	
	//jdk 1.7 = 100% abstraction
	//jdk 1-.8 = default non static methods:
	
	public void cardioServices();
	
	public void neuroServices();
	
	public void physioServices();
	
	public void emergencyServices();
	
	
	//After JDK 1.8;
	//1. static method with the method body
	
	public static void taxCalculation() {
		System.out.println("US Medical-tax calculation");
	}
	
	//2. default methods: not static
	
	default void getMedicalServices() {
		System.out.println("US Medical-getMedicalServices ");
		
	}
	
	
	
	
	

}
