package learnDataProvider;
/* Since this is an example (just for reference), sheet name and column no. have not been parameterized but have been hard coded */



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataExcel

{

	static ArrayList<String[]> alArr = new ArrayList<String[]>();

	public static ArrayList<String[]> dataGet() throws FileNotFoundException, IOException {

		try (FileInputStream fis = new FileInputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\learnDataProvider\\TestData.xlsx")) {

			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			XSSFSheet sh = wb.getSheetAt(0);

			int lRow = sh.getLastRowNum();

			for (int r = 1; r <= lRow; r++) {

				String fName = sh.getRow(r).getCell(0).getStringCellValue();

				String eId = sh.getRow(r).getCell(1).getStringCellValue();

				String pwd = sh.getRow(r).getCell(2).getStringCellValue();

				String rPwd = sh.getRow(r).getCell(3).getStringCellValue();

				alArr.add(new String[] { fName, eId, pwd, rPwd });

			}

			return alArr;

		}

	}

}
