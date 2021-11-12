package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// create a variable to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting...");
		
		// Define the variable
		career = "Software Developer";
		System.out.println("My career is " + career);
		
		// Declare and define
		int hourPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		// Compute annual salary
		double salary = hourPerWeek * weeksPerYear * rate;
		System.out.println("My annual salary is " + salary);
		
	}
}
