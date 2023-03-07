package seleniumSessions;

import java.util.Arrays;

public class Customer {
	
	//WAF"
	//getEmployeeDevices (empName -- String))
	//return device list
	
	public String[] getEmployeeDevices (String empName) {
		System.out.println("getting devices information for employee: "+ empName);
		
		if(empName.equals("Ravi")) {
			String devices[] = {"mackbook pro", "ipad", "iphn13"};
			return devices;
		}
		else if (empName.equals("Om")) {
			String devices[] = {"windows 10" , "samsung 10"}; 
			return devices;
			
		}
		else if (empName.equals("Rashmi")) {
			String devices[] = {"windows 10", "samsung s11", "airtel", "iphone 13"};
			return devices;
			}
		else {
			System.out.println("Employee name is not found");
			return null;
		}
		
		
		
	}
	

	public static void main(String[] args) {
		 
		Customer cus = new Customer();
		String arr[]= cus.getEmployeeDevices("Tom");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
 
	}

}
