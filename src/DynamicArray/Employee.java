package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		
		List<String> namesList = new ArrayList<String>();
		
		namesList.add("Tom");
		namesList.add("Peter");
		namesList.add("Rashmi");
		namesList.add("Ravi");
		namesList.add("Naveen");
		
		System.out.println(namesList);
		System.out.println(namesList.size());
		
		for(String e : namesList) {
			System.out.println(e);
				if(e.equals("Rashmi")) {
					System.out.println("she is a manager");
					break;
				}
		}
		
		
		//
		List<String> browserList = Arrays.asList("chrome", "firefox", "IE", "Safari", "Edge");
		System.out.println(browserList.size());
		System.out.println(browserList);
			
		List<Integer> numList = Arrays.asList(100, 200, 300, 400, 500);
		
		//static array to dynamic array:

		String country[] = {"India", "USA", "UK", "Brazlil", "Germany"};//static arary
		List<String> countryList = Arrays.asList(country); //dynamic array
		
		//dynamic array == we use this type of dynamic array when we have the number of elements fixed. fixed means we have already pre-defined
		//values in that case we can use over here but at the run time we cannot try to change or add in between
		
		
		System.out.println(countryList);

		countryList.add("France");
		System.out.println(countryList);
		
		
		}

	}