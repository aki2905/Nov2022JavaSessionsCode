package seleniumSessions;

import java.util.Arrays;

public class MainMethodOverloading {
	
	//JVM -- main - public void static main with String argument method signature
	
	public static void main(String[] args) {
		System.out.println("Hello Nish");
		
		
		//System.out.println(args[0]);  //------ ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(args));
		MainMethodOverloading.main(20);
		MainMethodOverloading.main(10, 20);
		
	}
	
	public static void main(String a) {
		System.out.println("Hello Nish");
	}
	

	public static void main(int i) {
		System.out.println(i);
		System.out.println("main 1 param");
		}

	public static void main(int i,int j) {
		System.out.println(i);
		System.out.println("main 2 params");
		}
}
