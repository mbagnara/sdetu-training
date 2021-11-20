package exceptionsfiles;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 0;

		doMath(a, b);	

	}
	
	private static void doMath(int a, int b) {
		//System.out.println(a/b);
		answer(a,b);
	}
	
	public static double answer(int x, int y) {
		return x/y;
	}
	
	

}
