package OOP_AbstractClasses;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP-- constructor");
	}
	
	public LoginPage(int i) {
		System.out.println("LP-- constructor: "+ i);
	}

	@Override
	public void title() {
		System.out.println("LP- title");
	}

	@Override
	public void url() {
		System.out.println("LP- url");

	}
	
	public void resetPwd() {
		System.out.println("LP- reset pwd");
	}
	@Override
	public void pageLoadingTime() {
		System.out.println("Page loading time 5 secs");
	}
	
	public static void PageCycle() {
		System.out.println("LP -- Page Cycle");
	}

	@Override
	public void privacyPolicy() {
	System.out.println("LP- Privacy Policy");	 
	}

}
