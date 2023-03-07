package AccessModifier1;

public class Car {
	
	public String name;
	private int price;
	protected String color;
	String seller;
	public int i =10;
	

	public static void main(String[] args) {
		
		final int j =10; //local variable
		
		
		
		Car c = new Car();
		c.price=100;
		
		//*Note: All the data members (public, private, protected, default)
		//can be accessed in the same class
		
		

	}

}
