package String_Concepts;

public class StringConcept {

	public static void main(String[] args) {
		
		//String literals
		String str ="Selenium";
		String str1="Selenium";
		String str2="selenium";
		
		String t1="Java";
		
		System.out.println(str== str1);
		System.out.println(str.equals(str1));
		
		//String object with new keyword:
		String s1 = new String("testing"); //2 objects
		String s2 = new String("testing"); // 1 object	
		String s3 ="testing";//0 object
		String s4 ="testing";  
		System.out.println(s3==s4); //true
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s3); //false
		System.out.println(s3==s4); //true
		System.out.println(s3.equals(s4)); //true
		System.out.println(s1.equals(s3));//true
	
		String s5 = "Testing"; //1 object - Static constant pool
		//s5 = null;
		System.out.println(s5.length());
		
		String s6 ="Naveen";
		s6= "Aksha"; 
		System.out.println(s6.length());
	}

}
