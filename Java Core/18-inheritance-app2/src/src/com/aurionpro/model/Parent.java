package src.com.aurionpro.model;

public class Parent {

	public Parent() {
		System.out.println("This is Parent Constructor");
	}
	
	public Parent(String msg) {
		System.out.println("This is Parent Constructor. "+msg);
	}
	
	static {
		System.out.println("This is Parent Static");
	}

}