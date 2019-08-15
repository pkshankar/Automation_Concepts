package learnReadExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	static FileInputStream fis;
	static XSSFWorkbook wb;

	public static void getDataExcel(String sheetName) throws IOException {

		fis = new FileInputStream("C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\learnReadExcel"
				+ "\\4-Week_Detailed_Availability.xlsx");

		wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet(sheetName);

		Iterator<Row> row = sh.iterator();

		row.next();

		while (row.hasNext()) {

			Row r = row.next();

			Iterator<Cell> cell = r.cellIterator();

			while (cell.hasNext()) {

				Cell c = cell.next();

				switch (c.getCellType()) {

				case NUMERIC:

					System.out.println((int) c.getNumericCellValue());
					break;

				case STRING:

					System.out.println(c.getStringCellValue());
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

	public static void addWorkSheet() throws IOException {

		fis = new FileInputStream("C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\learnReadExcel"
				+ "\\4-Week_Detailed_Availability.xlsx");

		wb = new XSSFWorkbook(fis);

		wb.createSheet("selenium_test_data");

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\learnReadExcel"
						+ "\\4-Week_Detailed_Availability.xlsx");

		wb.write(fos);

		fos.close();

		wb.close();

	}

	public static void addColumn() throws Exception {

		fis = new FileInputStream("C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\learnReadExcel"
				+ "\\4-Week_Detailed_Availability.xlsx");

		wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheetAt(0);

		sh.getRow(0).createCell(sh.getRow(0).getLastCellNum()).setCellValue("TEST CASE STATUS");

		for (int row = 1; row <= sh.getLastRowNum(); row++) {

			sh.getRow(row).createCell(sh.getRow(row).getLastCellNum()).setCellValue("SELENIUM");

		}

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\learnReadExcel"
						+ "\\4-Week_Detailed_Availability.xlsx");

		wb.write(fos);

		fos.close();

		wb.close();

	}

}
