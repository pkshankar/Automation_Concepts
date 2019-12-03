package learnTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class YahooUtil {

	public static Object[][] getDataTwoDArray() throws Exception {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\TestData\\Yahoo_Data.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		int lastRowNum = sh.getLastRowNum(); // 3
		System.out.println("lastrownum " + lastRowNum);
		System.out.println("lastcellnum " + sh.getRow(0).getLastCellNum());
		Object[][] yahooDetails = new Object[lastRowNum][sh.getRow(0).getLastCellNum()];
		for (int rw = 0; rw < lastRowNum; rw++) {
			for (int cl = 0; cl < sh.getRow(rw).getLastCellNum(); cl++) {

				yahooDetails[rw][cl] = sh.getRow(rw + 1).getCell(cl).getStringCellValue();

			}
		}

		return yahooDetails;

	}

	public static ArrayList<String[]> getDataArrayList() throws Exception {

		ArrayList<String[]> al = new ArrayList();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\TestData\\Yahoo_Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		int lastRowNum = sh.getLastRowNum();
		for (int rw = 1; rw <= lastRowNum; rw++) {
			String fName = sh.getRow(rw).getCell(0).getStringCellValue();
			String lName = sh.getRow(rw).getCell(1).getStringCellValue();
			String eAddress = sh.getRow(rw).getCell(2).getStringCellValue();
			String pwd = sh.getRow(rw).getCell(3).getStringCellValue();
			String[] sArr = { fName, lName, eAddress, pwd };
			al.add(sArr);
		}

		return al;

	}

}
