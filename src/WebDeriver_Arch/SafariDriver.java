package WebDeriver_Arch;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("Safari is launched");
	}

	@Override
	public void findElements(String element) {
		System.out.println("find element: " + element);
	}

	@Override
	public void get(String url) {
		System.out.println("Enter URL: " + url);
	}

	@Override
	public String getTitle() {
		System.out.println("getting the page title");
		return "Naveen Automation Labs";
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on the element: " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Entering the value :" + value + "into " + element);
	}

	@Override
	public void close() {
		System.out.println("Close the browser");

	}

}
