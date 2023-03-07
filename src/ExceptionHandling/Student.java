package ExceptionHandling;

public class Student {
	
	//Preference for return will always be given to finally block

	public static int getMarks(String name) {
		System.out.println("getting marks for students: " + name);

		if (name.endsWith("Rashmi")) {
			try {
				int i = 9 / 0;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				return 85; 
			}
			finally {
				System.out.println("print marksheet");
				return 70;
			}
			
		}
		else if (name.endsWith("Tom")) {
			return 95;
		}
		else if (name.endsWith("Picku")) {
			return 70;
		} 
		else {
			System.out.println("Student not found");
			return -1;
		}
	}

	public static void main(String[] args) {

		int m1 = getMarks("Rashmi");
		System.out.println(m1);
		System.out.println("Bye");

	}

}
