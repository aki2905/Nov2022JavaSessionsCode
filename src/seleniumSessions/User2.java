package seleniumSessions;

public class User2 {

	
		String name;
		int age;
		String city;

		public static void main(String[] args) {

			User u1 = new User();
			u1.name = "Payal";
			u1.age = 27;
			u1.city = "Pune";

			User u2 = new User();
			u2.name = "Shalu";
			u2.age = 25;
			u2.city = "Kolkata";

			User u3 = new User();
			u3.name = "Pooja";
			u3.age = 30;
			u3.city = "Bangalore";
			
			User u4 =new User();
			u4.name="Paru";
			u4.age=5;
			u4.city="Patna";
			

			System.out.println(u1.name + " " + u1.age + " " + u1.city);
			System.out.println(u2.name + " " + u2.age + " " + u2.city);
			System.out.println(u3.name + " " + u3.age + " " + u3.city);
			System.out.println(u4.name + " " + u4.age + " " + u4.city);
			

			u1 = u2;

			System.out.println(u1.name + " " + u1.age + " " + u1.city);
			System.out.println(u2.name + " " + u2.age + " " + u2.city);
			System.out.println(u3.name + " " + u3.age + " " + u3.city);
			System.out.println(u4.name + " " + u4.age + " " + u4.city);

			u2 = u3;

			System.out.println(u1.name + " " + u1.age + " " + u1.city);
			System.out.println(u2.name + " " + u2.age + " " + u2.city);
			System.out.println(u3.name + " " + u3.age + " " + u3.city);
			System.out.println(u4.name + " " + u4.age + " " + u4.city);
			
			u3 = u4;
			System.out.println(u1.name + " " + u1.age + " " + u1.city);
			System.out.println(u2.name + " " + u2.age + " " + u2.city);
			System.out.println(u3.name + " " + u3.age + " " + u3.city);
			System.out.println(u4.name + " " + u4.age + " " + u4.city);
		}

	}

