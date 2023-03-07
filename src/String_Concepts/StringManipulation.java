package String_Concepts;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		// String: It is a collection of multiple characters

		String str = "Hi this is my java code and I am so happy";

		System.out.println(str);

		System.out.println(str.length());

		int len = str.length();
		int li = 0;
		int hi = len - 1;
		System.out.println(hi);

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(15));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(40));
		// System.out.println(str.charAt(41));//StringIndexOutOfBoundsException

		System.out.println(str.charAt(2));

		System.out.println(str.indexOf("h"));
		System.out.println(str.indexOf("java"));

		String m1 = "welcome admin";

		if (m1.indexOf("admin") == 8) {
			System.out.println("admin user is present");
		} else {
			System.out.println("FAIL");
		}
		System.out.println(str.indexOf("i")); // 1st occurrence of i
		System.out.println(str.indexOf('i', 2)); // 2nd occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i') + 1)); // 2nd occurrence of i

		System.out.println(str.indexOf("Python"));

		String m2 = "product is macbook";
		if (m2.indexOf("macbook") != -1) {
			System.out.println("Correct check");
		} else {
			System.out.println("Incorrect check");
		}
		//
		String test = "this is java program";
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());

		// trim
		String p = "     hello  world   ";
		System.out.println(p.trim());
		System.out.println(p);

		// replace
		String q = "hello world";
		System.out.println(q.replace(" ", ""));
		System.out.println(q.replace(" ", "M"));

		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));

		String msg = "I love Java";
		System.out.println(msg.replace("love", "like"));

		String q1 = "     hello  world   ";
		System.out.println(q1.replaceAll(" ", ""));

		// equals
		String e1 = "hello selenium";
		String e2 = "hello Selenium";
		System.out.println(e1.equals(e2));
		System.out.println(e1.equalsIgnoreCase(e2));

		// contains
		String tg = "welcome to naveen training";
		System.out.println(tg.contains("Naveen"));
		if (tg.contains("Naveen")) {
			System.out.println("enroll for it");
		} else {
			System.out.println("no need to enroll for it");
		}

		// split
		String lang = "JAVA_PYTHON_RUBY_DOTNET";

		String l[] = lang.split("_");
		System.out.println(l.length);
		System.out.println(Arrays.toString(l));

		String pop = "xXtestingxXseleniumXxXautomationXXxXTrainingX";
		String n[] = pop.split("xX");
		System.out.println(n[0]);
		System.out.println("Akki");
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		// System.out.println(n[5]);

		String st = "i am naveen hi this is my java code and i am so happy i am learning";
		int c = 0;
		while(c<st.length()) {
			//System.out.println(st.charAt(c) + " : " + c);
			if(st.charAt(c) == 'i') {
				System.out.println(st.indexOf('i', c));
			}
			c++;
		}
	}
}