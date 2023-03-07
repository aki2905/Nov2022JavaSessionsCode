package ExceptionHandling;

public class Employee {

	// Exception will terminate the program
	// Throwable class is a parent of Exception class
	// Throwable class is a parent of Error class
	// Under throwable, there are 2 classes = Errors and Exception

	// Exceptions is coming because of the code
	// Errors is coming because of Memory failure , Hardware failure or Syntax Error

	String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee obj = new Employee();
			obj = null;
			obj.name = "Naveen"; // NPE
			int i = 9 / 0; // AE
			System.out.println("hello");

		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("Bye");
		System.out.println("Bye");

	}

}
