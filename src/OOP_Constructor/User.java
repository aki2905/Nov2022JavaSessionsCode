package OOP_Constructor;

public class User {
	
	//class variables
	String name;
	int age;
	String email;
	String password;
	String phone;
	 
	static String price;
	
	public boolean forgotPwd() {
		//business logic
		return true;
	}
	
	//hidden constructor - default constructor ... will be added by JVM
	
	public User (String name, int age) {
		this.name = name;
		this.age =age;
		this.price = price;
	}
	
	public User (String name, int age,String email) {
		this.name = name;
		this.age =age;
		this.email =email;
	}
	
	
	public User(String name, int age, String email, String password) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	
	public User(String name, int age, String email, String password, String phone) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public static void main(String[] args) {
		

		User u1 = new User("Tom", 25);
		System.out.println(u1.name );
		System.out.println(u1.age);
		
		User u2 = new User("Lisa", 30, "lisa1@gmail.com");
		System.out.println(u2.name);
		System.out.println(u2.email);
		System.out.println(u2.password);
		
		User u3 = new User("Manisha", 25, "nick.2@gmail.com", "man@123", "9654310987");
		System.out.println(u3.name + " " + u3.phone);
		
	}

}
