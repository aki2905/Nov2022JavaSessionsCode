package String_Concepts;

public class IntegerReverse {

	public static void main(String[] args) {
		String s = "123";
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+ s.charAt(i);
		}
		System.out.println(rev);

		
		int number = 989776;
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;//123 % 10 = 3
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		System.out.println(reverse);
		
		
	}
}
