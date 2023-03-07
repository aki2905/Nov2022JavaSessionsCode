package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("trying to launch browser");
		checkRAM();
		checkVersion();
		checkOS();
		checkBrowserService();
		System.out.println("Chrome Browser is launched");
	}

	private void checkRAM() {
		System.out.println("check RAM");
	}

	private void checkVersion() {
		System.out.println("check Version");
	}

	private void checkOS() {
		System.out.println("check OS");
	}

	private void checkBrowserService() {
		System.out.println("checkBrowser Service");
	}

}
