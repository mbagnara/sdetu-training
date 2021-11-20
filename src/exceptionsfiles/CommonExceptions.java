package exceptionsfiles;

public class CommonExceptions {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		// 1. Identify the potential problem area
		// 2. Surround with try-catck block
		
		try {
			int c = a/b;			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cannot divide by zero");
			System.out.println(e.toString());
		}
		System.out.println("Program closing");
		
		String[] states = {"UT", "CA", "NV"};
		
		for (int i = 0; i <= states.length; i++) {
			try {
				System.out.println("Index: " + i);
				System.out.println(states[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("Exception: Out of bound index: " + i);
			} finally {
				System.out.println("Finishes iterating through the array");
			}
		}
		
		System.out.println("For loop completes");
		
	}

}
