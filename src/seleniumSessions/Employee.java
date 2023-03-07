package seleniumSessions;

public class Employee {

//class: category of objects, blueprint/template of objects
	// object: is the physical entity

	// class variable:
	String name;
	int age;
	String city;
	double salary;

	public static void main(String[] args) {

		// create the object of class:
		// using new keyword
		Employee e1 = new Employee(); // Employee is Class, e1 = object reference name , Object is RHS,

		e1.name = "Pari";
		e1.age = 10;
		e1.city = "Patna";
		e1.salary = 28.8;

		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary);

		//
		Employee e2 = new Employee();

		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.city);
		System.out.println(e2.salary);

		//
		/*
		 * Employee e3= new Employee(); e3 =null; //Null reference Object
		 * e3.name="Naveen"; e3.age=33;
		 */

		// object without reference - No reference object
		new Employee().name = "Vishal";
		new Employee().age = 25;


		System.gc();
		
	}

}
