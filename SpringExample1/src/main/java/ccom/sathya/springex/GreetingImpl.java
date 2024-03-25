package ccom.sathya.springex;

public class GreetingImpl implements Greeting {

	@Override
	public void greet() {
        System.out.println("Spring first example");		
	}
	
	public GreetingImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("object created");
	}

}
