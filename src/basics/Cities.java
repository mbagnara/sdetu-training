package basics;

public class Cities {
	public static void main(String[] args) {

		// Declare and define and array. Implicit length declaration
		String[] cities = {"Lehi", "Orem", "American Fork"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);

		// Declare array with explicit length array
		String[] states = new String[3];
		states[0] = "Utah";
		states[1] = "Nevada";
		states[2] = "California";

		// Declare array; later will instantiate it
		/*
		 *  Declare array; later will instantiate it
		 *  The length defined with new String[3] is the actual length
		 *  However, when accessing the array elements you start from
		 *  index (position) zero (0) 
		 */
		String[] countries;
		int lengthOfCountries = 3;
		countries = new String[lengthOfCountries];
		countries[0] = "Chile";
		countries[1] = "US";
		countries[2] = "UK";
		//System.out.println(countries[0]);

		int loopToUse = 2;

		// Loop through the array and print out the countries. Do {} while ();

		if (loopToUse == 0) {
			// While () {} loop
			System.out.println("Using Do {} While () Loop...");
			
			// Declare variables
			int i = 0;
			
			// Loops throug the array
			do {
				System.out.println(i + "] " + countries[i]);
				i++;
			} while (i < lengthOfCountries);

		}

		if (loopToUse == 1) {
			// While {} Loop
			System.out.println("Using While () {} Loop...");
			
			// Declare variables
			String LookingForState =  countries[2];
			boolean stateFound = false;
			int i = 0;
			
			// Loop through the array
			while (!stateFound) {

				System.out.println(i + "] " + countries[i]);

				if (LookingForState == countries[i]) {
					stateFound = true;
					System.out.println("I was looking for [" + LookingForState + "] and found it!. Exiting.");
				}

				i++;

				if (i == lengthOfCountries) {
					System.out.println("The state " + LookingForState + " does not exist in the array. Exiting!");
					stateFound = true;
				}
			}			
		}
		
		if (loopToUse == 2) {
			// For {} Loop
			System.out.println("Using For {} Loop...");
			
			for (int i = 0; i < lengthOfCountries; i++) {
				System.out.println("State [" + i + "] " + countries[i]);			
			}
		}

	}
}
