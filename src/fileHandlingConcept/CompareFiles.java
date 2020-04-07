package fileHandlingConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompareFiles {

	public static void main(String[] args) throws IOException {

		String file1Path = "C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\fileHandlingConcept\\file1.txt";
		String file2Path = "C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\fileHandlingConcept\\file2.txt";
		File f1 = new File(file1Path);
		File f2 = new File(file2Path);
		List<Integer> list = compareTextFiles(f1, f2);
		if (list.size() > 0) {
			System.out.println("FILES DIFFER AT THE FOLLOWING LINES : " + list.toString());
		}

	}

	public static List<Integer> compareTextFiles(File file1, File file2) throws IOException {

		FileReader fr1 = new FileReader(file1);
		FileReader fr2 = new FileReader(file2);
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		boolean areEqual = true;
		int lineNum = 1;
		String readFile1 = br1.readLine();
		String readFile2 = br2.readLine();
		List<Integer> lineNumList = new ArrayList<Integer>();
		while (readFile1 != null || readFile2 != null) {

			if (readFile1 == null || readFile2 == null) {
				areEqual = false;
				System.out.println("DIFFERENT CONTENT");
				break;
			}

			if (!readFile1.equalsIgnoreCase(readFile2)) {
				areEqual = false;
				lineNumList.add(lineNum);
			}
			readFile1 = br1.readLine();
			readFile2 = br2.readLine();
			lineNum++;
		}

		if (areEqual) {
			System.out.println("SAME CONTENT");
		}

		br1.close();
		br2.close();

		return lineNumList;

	}

}