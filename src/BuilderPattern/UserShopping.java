package BuilderPattern;

public class UserShopping {

	public static void main(String[] args) {
		
		EcommApplication ecm = new EcommApplication();
	
		
		//These can be called Method chaining
		
		ecm.login("naveen@gmail.com", "naveen@123")
		    .doSearch("Iphone")
             .addToCart("Iphone")
              .doPayment("1212 1234 1231 1233", 899)
               .generateOrder()
                .logout();
		
		System.out.println("----------------");
		//
		ecm.login("naveen@gmail.com", "naveen@123")
	    .doSearch("tshirt", 5000, "Nike")
         .addToCart("tshirt")
          .logout();
		
		System.out.println("----------------");
		
		ecm.login("naveen@gmail.com", "naveen@123")
		    .logout();
           
           
		
              
              
	}          
	

}
