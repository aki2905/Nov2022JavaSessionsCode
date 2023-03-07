package seleniumSessions;

public class Company {

	// class variable:
	String name;
	int empCount;
	String hq;
	boolean status;

	public static void main(String[] args) {

		Company obj = new Company();

		obj.name = "IBM";
		System.out.println(obj.name);
		System.out.println(obj.status);
		System.out.println(obj.hq);

	}

}
