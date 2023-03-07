package OOP_AbstractClasses;

public abstract class Page implements Web{
	
	//0% abstraction: no abstract methods
	//x% of abstraction: Partial Abstraction
	//100% abstraction: all abstract methods
	
	//cannot create the object of abstract class
	//but we can create the constructor of the abstract class 
	//and it will be called when we create the object of child class
	
	public Page() {
		System.out.println("Page -- Constructor");
	}
	
	public Page(int i) {
		System.out.println("Page -- Constructor: "+ i);
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public final void displayLogo() {
		System.out.println("Page - Logo");
	}
	
	public void pageLoadingTime() {
		System.out.println("Page loading time 10 secs");
	}
	
	public static void PageCycle() {
		System.out.println("Page Cycle");
	}
	
	@Override
	public void privacyPolicy() {
	System.out.println("Page= Privacy Policy");	 
	}
	
}
