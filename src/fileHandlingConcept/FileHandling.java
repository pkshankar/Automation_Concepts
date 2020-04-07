package fileHandlingConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	static String fileName = "fileHandling1.txt";

	public static void main(String[] args) {

		// createFile();
		

	}

	public static Object createFile(String fileName) {


		boolean flag = false;
		File file = new File("testFile.txt");
		try {
			flag =  file.createNewFile();

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return flag;

	}


}
