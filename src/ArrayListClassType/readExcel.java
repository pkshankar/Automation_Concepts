package ArrayListClassType;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.qa.data.TestData;

public class readExcel {

	public static void main(String[] args) {
		
		getDataExcel("C:\\Users\\pkshank\\eclipse-workspace\\RestAssured_Practice_01\\src\\main\\java\\com\\qa\\data\\CapitalTestData.xlsx",
		"CapitalInfo");
		
	}
	
	public static String[][] getDataExcel(String sheetLocation, String sheetName) {
		
		String[][] capitalValues = null;

		try {
			FileInputStream fis = new FileInputStream(sheetLocation);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			int lastRowNum = sh.getLastRowNum(); //4
			System.out.println(lastRowNum);
			int lastCellNum = sh.getRow(0).getLastCellNum();
			System.out.println(lastCellNum);
			capitalValues = new String[lastRowNum+1][lastCellNum-1];
			for (int rw = 0; rw <= lastRowNum; rw++) {

				for (int cl = 0; cl < lastCellNum-1; cl++) {

					capitalValues[rw][cl] = sh.getRow(rw).getCell(cl).getStringCellValue();
					System.out.println(capitalValues[rw][cl]);
				}
			}
			return capitalValues;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return capitalValues;
	}

	
}
