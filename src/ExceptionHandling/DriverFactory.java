package ExceptionHandling;

public class DriverFactory {

	public static void main(String[] args) {

		String browser = null;

		if (browser == null) {

			try 
			{
				throw new RuntimeException("Browser not found");
			} 
			catch (RuntimeException e) 
			{
				System.out.println(e);
				//e.printStackTrace();
			}
		}
		else {
			System.out.println("browser is launched");
			
		}

	}

}