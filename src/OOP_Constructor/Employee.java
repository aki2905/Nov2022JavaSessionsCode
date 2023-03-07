package OOP_Constructor;

public class Employee {

	// constructor is not a function but it looks like function
	// constructor is having the same name as class name
	// constructor cannot return anything - no return type for constructor
	// constructor is helping to control the object creation or restricting the creation of unnecessary objects 
	// constructor will be called when you create the object
	// constructor overloading is possible in java

	// Default Constructor or 0-parameterized constructor
	public Employee() {
		System.out.println("Default constructor");
	}
	public Employee(int a) {
		System.out.println("1 param constructor  " + a);
	}
	
	public Employee(int a, int b) {
		System.out.println("2 params constructor  " + (a+b));
	}
	

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(10,20);

	}

}
