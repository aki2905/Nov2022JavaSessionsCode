package ExceptionHandling;

public class ThrowsKeyword {
	
	//Throws keyword is used to pass the exception from one method to another method
	//and throws keyword should always be written after the method name
	
	//Try catch be written inside the finally also
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		
		try {
		   m3();
		} catch(ArithmeticException e) {
		  System.out.println("AE is coming");
		  e.printStackTrace();
		}finally {
			System.out.println("finally bye");
			try {
				int p =9/0;
			}catch(ArithmeticException e) {
				System.out.println("Bye 2022");
				e.printStackTrace();
			}
		}
		
	}
	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		int a =10;
		int b =0;
		int c = a/b;
		
	}

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("Bye");
		

	}

}
