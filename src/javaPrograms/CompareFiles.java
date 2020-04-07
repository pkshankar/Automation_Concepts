package javaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CompareFiles {

	public static void main(String[] args) throws IOException {
		
		String file1Path = "C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\javaPrograms\\File1.txt";
		String file2Path = "C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\javaPrograms\\File2.txt";
		
		FileInputStream fis1 = new FileInputStream(file1Path);
		FileInputStream fis2 = new FileInputStream(file2Path);
		int i=0, j=0;
		while(i!=-1 && j!=-1) {
			
			i = fis1.read();
			j = fis2.read();
			if(i!=j) {
				System.out.println("DIFFERENT FILES");
				break;
			}
		}
	}

}
