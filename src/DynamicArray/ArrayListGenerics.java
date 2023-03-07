package DynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();

		numList.add(100);
		// numList.add("Naveen"); --Not allowed (its should be Integer type only)

		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);

		System.out.println(numList.size());

		// for each loop:
		for (Integer e : numList) {
			System.out.println(e);
		}

		ArrayList<String> empNameList = new ArrayList<String>();
		empNameList.add("Peter");
		empNameList.add("Tom");
		empNameList.add("Maria");

		// for each loop:
		for (String e : empNameList) {
			System.out.println(e);
		}

		System.out.println(empNameList);

		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Maa");
		empDataList.add("Papa");
		empDataList.add(32);
		empDataList.add(12.33);
		empDataList.add(true);
		empDataList.add("n");
		empDataList.add(3);

		empDataList.remove(12.33);
		empDataList.remove(3);

		// for each loop:
		for (Object e : empDataList) {
			System.out.println(e);

		 if(e.equals(32)) {
			 System.out.println("fresher"); }
			 
		}

		 System.out.println(empDataList);

	}

}
