package seleniumSessions;

public class MethodsInJava {

	// function:
	// functions are independent
	// cannot create a function inside the function
	// 2+2=4
	// 3+2=5

	// 1. no input and no return
	// void: no return : function cannot return anything
	public void test() {
		System.out.println("test method");
		int a = 10;
		int h = 15;
		System.out.println(a + h);
	}

	// 2. no input and some return
	// return type : int
	public int getBillAmount() {

		System.out.println("get billing amount");
		int foodBills = 100;
		int drinkBills = 50;
		int totalAmount = foodBills + drinkBills;
		return totalAmount;
	}

	public String getEmployeeName() {
		System.out.println("get emp name");

		String name = "Naveen";
		return name;
	}

	public String getName() {
		System.out.println("get name");
		return "Selenium";
	}
	
	public int getNumber() {
		return 100;
	}
	
	public boolean isElementExist() {
		System.out.println("check element is present");
		boolean flag = true;
		return flag;
	}
	
	public int getMarks() {
		int a =100;
		int bonus =5;
		int negative =10;
		int finalMarks = a+bonus-negative;
		return finalMarks;
		
	}
	
	
	//3. some input and some return:
	//WAF:
	//two variables - a and b
	//return sum pf these two numbers
	
	public int getSum(int a, int b) {
		System.out.println("Sum of two numbers....");
		int sum = a +b;
		return sum;	
	}
	
	//WAF:
	//input parameters : int,double
	//return multiplication of these two numbers
	
	public double getMultiplication(int x, double y) {
		System.out.println("get multiplication");
        double mul = x * y;
        return mul;
	}
	
	public String getEmpSalaryInfo(String empName, int bonusAmount) {
		System.out.println("emp salary");
		return empName +":" + bonusAmount;
		
	}
 
	public static void main(String[] args) {

		// call the function
		MethodsInJava obj = new MethodsInJava();

		obj.test();
		int m1 = obj.getBillAmount();

		System.out.println(m1);
		System.out.println(obj.getBillAmount());
		
		String emp = obj.getEmployeeName();
		System.out.println(emp);

		if(obj.isElementExist()) {
			System.out.println("Click on element");
		}
		
		int s1= obj.getSum(10, 20);// call by value = calling a function by passing some value
		System.out.println(s1);  
		
		int s2= obj.getSum(40, 50);
		System.out.println(s2);
		
		double mul1= obj.getMultiplication(10, 2.2);
		System.out.println(mul1);
		
		String empInfo = obj.getEmpSalaryInfo("Ankit", 500);
		System.out.println(empInfo);
		
		String empInfo1 = obj.getEmpSalaryInfo("Gifty", 200);
		System.out.println(empInfo1);
	}

}
