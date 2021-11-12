package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is Walking");	
	}
	
	void eat(){
		System.out.println(name + " is Eating");		
	}
	
	void sleep() {
		System.out.println(name + " is Sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Person -
		
		// Attributes
//		String name = "Mario";
//		String email = "mario@testemail.com";
//		String phone = "+13852993164";
//	
		
		// Action, activity, behavior		
		Person p = new Person();
		
		// Define properties 
		p.name = "Mario";
		p.email = "mario@testemail.com";
		
		// Abstraction
		p.walk();
		p.sleep();
		p.eat();
				
	}
	
	// 

}


