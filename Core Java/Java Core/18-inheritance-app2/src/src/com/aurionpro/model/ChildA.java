package src.com.aurionpro.model;

public class ChildA extends Parent {

	public ChildA() {
		super();
		//super("Child calling parent");
		System.out.println("This is Child Constructor");
	}
	
	static {
		System.out.println("This is Child Static");
	}
}
