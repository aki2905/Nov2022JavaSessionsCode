package seleniumSessions;
import java.util.Arrays;

public class Assignment1 {

		public String [] getEmployeeDevices(String empName) {
			
			System.out.println("getting devices information for employee: " + empName);
			String devices[]= null;
			
			if (empName.equals ("Ravi" )) {
			devices = new String[] {"macbook", "ipad"};
			//return devices;
			}
			else if (empName.equals ("Om")) {
				devices = new String[] {"macbook", "ipad", "sim"};
			//return devices;
			}
			else if (empName.equals("Rashmi")) {
				devices = new String[] {"macbook", "ipad", "sim", "mouse"};
			//return devices;
			}
			else {
				System.out. println ("emp name is not found....");
				
			}
			return devices;
	    }

		public static void main (String[] args) {
			Assignment1 obj = new Assignment1 ();
			String d[] = obj.getEmployeeDevices ("Ravi");
			System.out.println(Arrays.toString(d));

	}
	
	}


