package DataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x= "100";
		System.out.println(x+20);//10020
		
		//Conversion:
		//String to int:
	    int i =	Integer.parseInt(x);
	    System.out.println(i);
	    System.out.println(i+20);
	    
	    String y = "100A";
	    System.out.println(y+20);
	    //int j = Integer.parseInt(y); //NumberFormatException
	    //System.out.println(j);
	    //System.out.println(j+20);
	    
	    
	    String k ="100USD";
	    String curr[]= k.split("USD");
	    System.out.println(curr[0]);
	    int l = Integer.parseInt(curr[0]);
	    System.out.println(l+20);
	    
	    
	    //String to double:
	    String z = "12.33";
	    System.out.println(z+20); //12.3320
	    double d = Double.parseDouble(z); //12.33
	    System.out.println(d);
	    System.out.println(d+20);
	    
	    
	    //String to boolean:
	    String headless = "true";
	    boolean b =Boolean.parseBoolean(headless);
	    System.out.println(b);
	    System.out.println(headless);
	    
	    
	   if(Boolean.parseBoolean(headless)) {
		   System.out.println("run in headless");
	   }
	    
       //integer to String:
	   int m =100;
	   String m1 =  String.valueOf(m); //"100"
	   System.out.println(m1+20);
	   
	   boolean flag =true;
	   String f1= String.valueOf(flag); //"true"
	   System.out.println(f1);
	   
	   //
	   System.out.println(Integer.MIN_VALUE);
	   System.out.println(Integer.MAX_VALUE);
	   
	   System.out.println(Byte.MIN_VALUE);
	   System.out.println(Byte.MAX_VALUE);
	   
	   System.out.println(Short.MIN_VALUE);
	   System.out.println(Short.MAX_VALUE);
	   
	   
	  
	  

	}

}
