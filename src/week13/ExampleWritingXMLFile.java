package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleWritingXMLFile {
	
	static Scanner scanUserInput = new Scanner(System.in);
	static File file;
	static StringBuilder fileContent = new StringBuilder();
	
	public static void main(String[] args) {
		System.out.println("Input xml file location:");
		String userInput = scanUserInput.nextLine();
		file = new File(userInput);
		boolean isFileAvailable = false;
		while(!isFileAvailable) {
			if(file.exists() && file.isFile()) {
				try {
					Scanner readFile = new Scanner(file);
					fileContent = new StringBuilder();
					while(readFile.hasNextLine()) {
						fileContent.append(readFile.nextLine());
					}
					Pattern filePattern = Pattern.compile(
							"^<a>(<b>(.+?)</b>)*</a>$");
					Matcher fileMatcher = filePattern.matcher(fileContent);
					if(fileMatcher.matches()) {
						isFileAvailable = true;
						System.out.println("Formatting is valid.");
						System.out.println(fileContent);
					} else {
						isFileAvailable = false;
						System.out.println("Formatting is invalid.");
						System.out.println(fileContent);
						System.out.println("Re-input xml file location:");
						userInput = scanUserInput.nextLine();
						file = new File(userInput);
					}
					readFile.close();
				} catch (FileNotFoundException e) {
					System.out.println("File is not available.");
					System.out.println(file.getAbsolutePath());
				}
			} else {
				System.out.println("File is not available.");
				System.out.println(file.getAbsolutePath());
			}
		}
	}
	
}


