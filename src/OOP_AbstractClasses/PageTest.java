package OOP_AbstractClasses;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.pageLoadingTime();
		lp.resetPwd();
		//lp.PageCycle();
		
		Page.PageCycle();
		LoginPage.PageCycle();
		
		lp.privacyPolicy();
		
		System.out.println("=======================");
		
		//top casting
		//child class object can be referred by abstract parent class reference variable
		
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.displayLogo();
		pg.pageLoadingTime();
		pg.privacyPolicy();
		
	 
		//down casting : Not applicable
		

		
		
		
		
		

	}

}
