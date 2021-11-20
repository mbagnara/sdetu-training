package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// Define the file (path) that we want to read

		String fileName = "C:\\JavaWorkspace\\EclipseWorkspaces\\JavaTraining\\src\\files\\TextFiles\\fileToRead.txt";
		String text = null;
		
		// Create the file in Java		
		File file = new File(fileName);
		
		// Open the file
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// Read the file
			text = br.readLine();
			
			// Close the BufferedReader
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: file not found " + fileName);
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("ERROR: could not read the file " + fileName);
			e.printStackTrace();
			
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println("File content: " + text);

	}

}
