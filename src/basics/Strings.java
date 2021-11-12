package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "ring";
		bookTitle = "The lord of the rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("Contains "+ wordChoice);	
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase(browser)) {
			System.out.println("Browser is chrome");	
		}
		
		System.out.println(bookTitle.substring(0, 3));
		System.out.println(bookTitle.substring(3));		
		System.out.println(bookTitle.length());
	}

}
