package basics;

public class Assignment1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (1 == 0) {
			System.out.println("Sum: " + sumOfNumbersOneToN(4));	
			/*
			 * 1 = 1
			 * 2 = 2 + 1 = 3
			 * 3 = 3 + 3 = 6
			 * 4 = 4 + 6 = 10
			 */			
		}


		// Functions that compule the factorial values
		if (1 == 0) {
			int number = 10;
			long startTime = System.nanoTime();		
			System.out.println("Factorial: " + factorial(number));
			long endTime   = System.nanoTime();		
			System.out.println("Regular Function took " + (endTime - startTime) + " to complete");		

			startTime = System.nanoTime();
			System.out.println("Factorial RECURSIVE: " + factorialRecursive(number));
			endTime   = System.nanoTime();
			System.out.println("Recursive Function took " + (endTime - startTime) + " to complete");
			/*
			 * 1 = 1
			 * 2 = 2 * 1! = 2 * 1 = 2
			 * 3 = 3 * 2! = 3 * ( 2 * 1) = 
			 */			
		}
		
		int[] n = {5, -2, 0, 234,  -438, 63};
		System.out.println("The MIN value is: " + minValue(n));
		System.out.println("The MAX value is: " + maxValue(n));
		System.out.println("The AVG value is: " + avgValue(n));
		System.out.println(n.length);
	}

	public static int minValue(int[] n) {
		if (n.length == 0) return 0;
		int min = n[0];
		for (int i = 1; i < n.length; i++) {
			if (n[i] < min) {
				min = n[i];
			}			
		}
		return min;
	}

	public static int maxValue(int[] n) {
		if (n.length == 0) return 0;
		int max = n[0];
		for (int i = 1; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
			}			
		}
		return max;
	}

	public static int avgValue(int[] n) {
		if (n.length == 0) return 0;
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		return (sum / n.length);
	}


	public static int factorial(int n) {
		//System.out.println("Factorial from 1 to " + n);
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		return fac;
	}

	public static int factorialRecursive(int n) {
		//System.out.println("Factorial RECURSIVE from 1 to " + n);
		if (n <= 2) return n;
		return n * factorialRecursive(n-1); 
	}

	public static int sumOfNumbersOneToN(int n) {
		System.out.println("This function returns the sum of numbers 1 to " + n);
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.println("Number: "+ i + " Sum: " + sum);			
		}		
		return sum;
	}

}
