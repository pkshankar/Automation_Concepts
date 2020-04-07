package fileHandlingConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CompareTextFiles {

	public static void main(String[] args) {

		String file1Path = "C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\fileHandlingConcept\\file1.txt";
		String file2Path = "C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\fileHandlingConcept\\file2.txt";
		File f1 = new File(file1Path);
		File f2 = new File(file2Path);
		compareFiles(f1, f2);

	}

	public static void compareFiles(File file1, File file2) {

		FileReader fr1, fr2;
		BufferedReader br1, br2;
		boolean areEqual = true;
		int lineNum = 1;
		List<Integer> lineNumList = new ArrayList<Integer>();
		try {
			fr1 = new FileReader(file1);
			fr2 = new FileReader(file2);
			br1 = new BufferedReader(fr1);
			br2 = new BufferedReader(fr2);
			String readFile1 = br1.readLine();
			String readFile2 = br2.readLine();
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
		} catch (Exception e) {

			e.printStackTrace();
		}

		if (areEqual)

			System.out.println("SAME CONTENT");

		else
			System.out.println("FILES DIFFER AT FOLLOWING LINES : " + lineNumList);

	}

}
