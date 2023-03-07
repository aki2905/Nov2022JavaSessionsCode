package String_Concepts;

public class StringBuilderAndBufferConcept {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Selenium");
		sb.append("Testing");
		System.out.println(sb);
		
		String s1 = "Cypress";
		s1.concat("UI testing");
		String s2 = s1.concat("UI testing");
		System.out.println(s2);
		System.out.println(s1);

	}

}
