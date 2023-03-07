package seleniumSessions;

public class Application {

	// Method Overloading :OOP
	// within the same class: we have different methods:
	// 1. with the same name
	// 2. with different number of parameters with different type
	// 3. with different sequence of parameters
	// 4. return type doesnt matter

	// Polymorphism : Poly(many)+ Morphism (Forms)
	// compile time polymorphism or static polymorphism

	public void test() { // 0 parameter
		System.out.println("test with - 0 parameter");
	}

	public void test(int i) { // 1 parameter
		System.out.println("test with -1 parameter: " + i);
	}

	public void test(String i) { // 1 parameter

	}

	public void test(int i, int j) { // 2 parameters

	}

	public void test(int i, String j) { // 2 parameters

	}

	public void test(String i, int j) { // 2 parameters

	}

	// examples:
	// example 1- login:
	public void login() {

	}

	public void login(String un, String pw) {

	}

	public void login(String un, String pw, String role) {

	}

	public void login(String un, String pw, String role, int otp) {

	}

	// example 2- search:
	public void seach() {

	}

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {

	}

	// example 3- payment:
	public void doPayment(String cc, String cvv) {

	}

	public void doPayment(String upi) {

	}
	public void doPayment(String un,String pw, int otp) {

	}

	
	//Different example - float and double
	public void go(float f) {
		System.out.println("float value :" + f);
	}
	public void go(double f) {
		System.out.println("double value :" + f);
	}
    
	public static void main(String[] args) {

		Application app = new Application();
		app.test();
		app.test(20);
		app.test("Naveen");

		app.login();
		
		app.go(22.55);
		app.go(22.8);
		app.go(22.7f);
	}

}
