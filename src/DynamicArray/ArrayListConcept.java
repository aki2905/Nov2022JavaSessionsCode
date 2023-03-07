 package DynamicArray;

import java.util.ArrayList;

import WebDeriver_Arch.SearchContext;

public class ArrayListConcept {
	

	public static void main(String[] args) {
		
	//dynamic array:
	//ArrayList - default class
	//order based collection: it maintains the order/index	
	//Load factor for the arrayList is Current size/2
	//Pc(Physical capacity) - current size
		
	//Keep in Mind ** In Array, we use .length and in arrayList we use .size
		
		
		
	ArrayList ar = new ArrayList();
	System.out.println(ar.size());
	
	ar.add(100); //0
	ar.add(200); //1
	ar.add(300); //2
	
	System.out.println(ar.size());
	
	ar.add(400); //3
	ar.add(500); //4
	
	System.out.println(ar.size());
	
	ar.add("Testing"); //5
	ar.add(23.44); //6
	ar.add(true); //7
	ar.add('g'); //8
	ar.add(1000); //9
	
	System.out.println(ar.size()); //10
	
	System.out.println(ar.get(0));
	System.out.println(ar.get(5));
	//System.out.println(ar.get(10)); //IndexOutofBoundException
	
	ar.remove(8);
	System.out.println(ar.get(8)); //1000
	
	System.out.println(ar.size()); //9
	
	System.out.println(ar);
	
	System.out.println("====================");
	
	
	ArrayList empData = new ArrayList();
	empData.add("Tom");
	empData.add("Pune");
	empData.add(1000);
	empData.add(true);
	
	System.out.println(empData.size()); //4
	System.out.println(empData.get(1));
	System.out.println(empData);
	
	//for loop
	for(int i =0; i<empData.size(); i++) {
		System.out.println(empData.get(i));
	}
	
	

	}

}
