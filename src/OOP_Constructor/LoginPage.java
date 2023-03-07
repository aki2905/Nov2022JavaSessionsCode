package OOP_Constructor;

public class LoginPage {
	
	String userName;
	String password;
	
	public LoginPage(String username, String password) {
		this.userName = username;
		this.password = password;
	}
	
	
	public boolean doLogin() {
		System.out.println("Enter the username: " + userName);
		System.out.println("Enter the password: " + password);
		System.out.println("Click on login button");
		System.out.println("User is logged in");
		return true;
	}
	
	public void resetPwd() {
		System.out.println("reset pwd: "+ password);
		
		
	}

}
