package seleniumSessions;

public class Testing {
	
	//WAF
	//pass the student name(String)
	//return the student marks
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student : " + studentName);
		int marks = -1;
		
		if(studentName.equals("Ravi")) {
			//return 100;
			marks =100;
		}
		else if(studentName.equals("Rashmi")) {
			//return 90;
			marks =90;
		}
		else if(studentName.equals("Vishal")) {
			//return 60;
			marks =60;
		}
		else {
			System.out.println(studentName + ": This student is not found ");
			//return -1;
		}
		return marks;
	}
	
	//WAF
	//launch the browser : FF/ch/SF/IE
	//Create a function
	//name : launchBrowser (browserName -- String)
	//logic
	//return: true/false (boolean)
	
	
	public boolean launchBrowser(String browserName)
	{
	System.out.println("launching the browser : "+browserName );	
	boolean flag = false;
	
	switch (browserName.toLowerCase().trim()) {
	case "chrome":
		System.out.println("chrome is launched...");
		flag = true;
		break;
		
	case "firefox":
		System.out.println("firefox is launched...");
		flag =true;
		break;
		
	case "safari":
		System.out.println("safari is launched...");
		flag =true;
		break;
		
	case "ie":
		System.out.println("ie is launched...");
		flag =true;
		break;

	default:
		System.out.println("browser is not found...");
		break;
	}
	return flag;
	}
	

	public static void main(String[] args) {
		
		Testing obj = new Testing();
		int marks = obj.getStudentMarks("Ravi");
        System.out.println(marks);
    
    if(obj.launchBrowser("CHROME ")) {
    	System.out.println("launch the URL");
    }
    else {
    	System.out.println("No need to enter the URL");
    }
	}

	
}
