package OOP_Encapsulation;

public class TestEmployee {

	// Encapsulation: Private data members gets encapsulated within public methods
	// and public methods are called getter and setters that we have created

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 25;

		e1.setSalary(29.33);
		e1.getSalary();
		System.out.println(e1.getSalary() + "  " + e1.name + "  " + e1.age);

		// POST call
		Company c1 = new Company("TCS", 100, 2000);

//		c1.setEmpCount(100);
//		c1.setName("IBM");
//		c1.setSharePrice(20000);

		// GET call
		System.out.println(c1.getEmpCount());
		System.out.println(c1.getName());
		System.out.println(c1.getSharePrice());

		// PUT call
		c1.setSharePrice(5000);

		// GET call
		System.out.println(c1.getEmpCount());
		System.out.println(c1.getName());
		System.out.println(c1.getSharePrice());
		
		//Register Page:: 
		RegisterPage reg = new RegisterPage("Tom", 25, "Patna", "01-01-1990");
		
		System.out.println(reg.getName());
		System.out.println(reg.getDob());
		System.out.println(reg.getAddress());
		
		reg.setAddress("Kanpur");
		
		System.out.println(reg.getName());
		System.out.println(reg.getDob());
		System.out.println(reg.getAddress());
		
		
		RegisterPage reg1 = new RegisterPage("Ravi", 22);
		reg1.setAddress("London");
		reg1.setDob("01-05-1990");
		System.out.println(reg1.getName());
		System.out.println(reg1.getDob());
		System.out.println(reg1.getAddress());
		System.out.println(reg1.getAge());
		
		//Browser Class
		
		Browser br = new Browser();
		br.launchBrowser();
		

	}

}
