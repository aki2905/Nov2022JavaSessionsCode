package String_Concepts;

public class StringReverse {

	// WAF:
	// reverseString()
	// input parameter : String str
	// return: reverse of str

	public static void reverseString() {
		String name = "Selenium"; // output must be : muineleS

		int len = name.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
			
		}
		System.out.println(rev);

	}

	public static void main(String[] args) {
		
		reverseString();

	}

}
