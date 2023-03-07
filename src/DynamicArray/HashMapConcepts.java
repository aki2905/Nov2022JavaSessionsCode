package DynamicArray;

import java.util.HashMap;

public class HashMapConcepts {

	public static void main(String[] args) {
		
		//<Key,Value>
		//name = nishant
		//marks =100
		//seller = seller@gmail.com
		//doesnot maintain the order
		
		HashMap <String, String> empMap = new HashMap<String, String>();
		
		empMap.put("Naveen", "SDET");
		empMap.put("Ravi", "SDET2");
		empMap.put("Amrita", "SDETLead");
		empMap.put("Rashmi", "SDETManager");
		empMap.put("Kareem", "VP");
		empMap.put("Kareem", "CEO");
		empMap.put("Kareem", "CEO");
		empMap.put("Sheela", null);
		empMap.put(null, "CTO");
		empMap.put(null, null);
		
		System.out.println(empMap.get("Ravi"));
		System.out.println(empMap.get("Kareem"));
		System.out.println(empMap.get("Tom"));
		System.out.println(empMap.get("Sheela"));
		System.out.println(empMap.get(null));
		
		System.out.println(empMap);
		
		
		HashMap <String, Integer> browserMap = new HashMap<String, Integer>();
		browserMap.put("chrome", 100);
		browserMap.put("firefox", 105);
		browserMap.put("safari", 109);
		browserMap.put("IE", 103);
		
		System.out.println(browserMap);
		
		System.out.println(browserMap.get("IE"));
		
		
		

	}

}
