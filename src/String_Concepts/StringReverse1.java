package String_Concepts;

public class StringReverse1 {

	// WAF:
	// reverseString()
	// input parameter : String str
	// return: reverse of str

	public static String reverseString(String name) {
		// String name = "Selenium"; // output must be : muineleS

		//null check
	   if(name==null) {
		   System.out.println("null is not allowed..please pass the right value");
		   return null;
	   }
		
	   //length check if len = 1
		int len = name.length();
		
		if(len==1) {
			return name;
		}
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}
		return rev;

	}

	public static void main(String[] args) {

		String r1 = reverseString("Selenium");
		System.out.println(r1);
		
		r1 = reverseString("Selenium Automation");
		System.out.println(r1);
		
		r1 = reverseString("1010991");
		System.out.println(r1);
		
		r1 = reverseString("N");
		System.out.println(r1);
		
		r1 = reverseString(null);
		System.out.println(r1);
		
		r1= reverseString("TT");
		System.out.println(r1);
		
		//int reverse //123-> 321
		
		StringBuffer sf = new StringBuffer("Selenium");
		System.out.println(sf.reverse());
		

	}

}
