package WebDeriver_Arch;

public class NaveenAutomationAppTest {

	//static WebDriver driver;

	public static void main(String[] args) {

		// chrome
		// ChromeDriver driver = new ChromeDriver();

		// FirefoxDriver driver = new FirefoxDriver();

		// SafariDriver driver = new SafariDriver();

		String browser = "chrome";
		WebDriver driver = null;

		
		//Cross browser logic
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("plz pass the right browser name");
		}

		driver.get("nishantAkriti.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		if (actualTitle.equals("Naveen Automation Labs")) {
			System.out.println("title is correct");
		} else {
			System.out.println("title is incorrect");
		}

		driver.sendKeys("emailId", "naveen@gmail.com");
		driver.sendKeys("password", "naveen123");
		driver.click("loginBtn");

		driver.close();
	}

}
