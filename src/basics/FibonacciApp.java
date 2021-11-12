package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fib(7));	
	}
	
	public static int fib(int n) {
		// Edge condition, where n = 0 or 1; returns the same number passed	
		if (n == 0 || n == 1) return n;
		return (fib(n-1) + fib(n-2));
	}

}
