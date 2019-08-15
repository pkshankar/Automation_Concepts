package learnReadExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static void getData(String sheetName) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\learnReadExcel"
						+ "\\4-Week_Detailed_Availability.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet(sheetName);

		int lastRowNum = sh.getLastRowNum();
		
	

		int lastCellNum = sh.getRow(0).getLastCellNum();

		for (int row = 1; row <= lastRowNum; row++) {

			for (int col = 0; col < lastCellNum; col++) {

				switch (sh.getRow(row).getCell(col).getCellType()) {

				case NUMERIC:

					System.out.println((int) sh.getRow(row).getCell(col).getNumericCellValue());
					break;

				case STRING:
					System.out.println(sh.getRow(row).getCell(col).getStringCellValue());

					break;

				case BLANK:
					
					System.out.println(Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
				default:

					break;

				}

			}

		}
		wb.close();
	}

}
