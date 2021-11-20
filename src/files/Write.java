package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// Define the file (path) that we want to write
		String filename = "C:\\JavaWorkspace\\EclipseWorkspaces\\JavaTraining\\src\\files\\TextFiles\\fileToWrite.txt";
		String message = "My message to write in this file";  
		
		// Create the file in Java
		File file = new File(filename); 
		
		// Open the file
		try {
			FileWriter fw = new FileWriter(file);
			
			// Write to the file
			fw.write(message);

			// Close the resources
			fw.close();
			
		} catch (IOException e) {
			System.out.println("ERROR: could not write the file " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the filewriter");
		}
		

	}

}
