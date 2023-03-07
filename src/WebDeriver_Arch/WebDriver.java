package WebDeriver_Arch;

public interface WebDriver extends SearchContext{

	@Override
	public void findElements(String element);
	
	public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public void close();
}
