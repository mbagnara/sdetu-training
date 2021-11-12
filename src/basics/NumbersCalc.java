package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		printName();

		// Define variables
		int numA = 19;
		int numB = 2;
		int product = 0;

		// Mathematical operations
		product = multipleNumbers(numA, numB);
		addNumbers(numA, numB);

		System.out.println("The numbers to operate on are " + numA + " and " + numB);
		System.out.println("The product is " + product);
	}

	static void printName() {
		System.out.println("I am Mario");
	}

	static void addNumbers(int numA, int numB) {
		// This functions adds two numbers
		int sum = numA + numB;
		System.out.println("The sum is " + sum);
	}

	static int multipleNumbers(int numA, int numB) {
		int product = numA * numB;
		return product;
	}

}
