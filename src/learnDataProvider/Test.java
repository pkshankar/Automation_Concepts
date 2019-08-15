package learnDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		fetchData();
	}

	public static void fetchData() throws FileNotFoundException, IOException {

		try (FileInputStream fis = new FileInputStream("C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\learnDataProvider\\TestData.xlsx")) {

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			XSSFSheet sh = wb.getSheetAt(0);

			int rCnt = sh.getLastRowNum();

			for (int r = 1; r <= rCnt; r++) {

				for (int c = 0; c < sh.getRow(r).getLastCellNum(); c++) {

					System.out.println(sh.getRow(r).getCell(c).getStringCellValue());

				}
				
				System.out.println("**************************************");
			}

			wb.close();

		}

	}

}