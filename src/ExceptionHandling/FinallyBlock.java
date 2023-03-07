package ExceptionHandling;

public class FinallyBlock {

	// Finally block is always used with Try-Catch block
	//The code written inside the finally block will always be executed
	//One try block can be written with finally 
	//Try block can be written without catch but we should write finally block
	//Finally block cannot be written alone. So, without try we cannot use finally
	//One try can have multiple catches
	//Catch alone cannot be written. It should be written with the try
	//So, Try is mandatory. It should be written all the time

	public static void main(String[] args) {

		System.out.println("Hi");

		try {
			int i = 9/0;
		} 
		catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
		}

		System.out.println("Bye");
		
		
		//Pseudo Code::::
		
		//connect with database - Oracle
		//un,pwd, server ip: port
		//hit the SQL
		//try{
		//get the result from DB
		//}
		//catch(){}
		//finally{
		//disconnect with Database
		//}
		//System.out.println("continue shopping");
		//logout
	}
}