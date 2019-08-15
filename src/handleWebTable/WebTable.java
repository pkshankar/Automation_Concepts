/* WRITE WEBTABLE DATA TO EXCEL  */

package handleWebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	static FileOutputStream fos;

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts"
				+ "\\src\\handleWebTable\\WriteToExcel.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("Sheet1");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\" + "Automation_Concepts\\Browser_Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

		List<WebElement> rCnt = driver.findElements(By.xpath("//div/table[@id='customers']/descendant::tr"));

		sh.createRow(0);
		
		

		for (int fRowCol = 0; fRowCol < driver.findElements(By.xpath("//div/table[@id='customers']/descendant::tr/th"))
				.size(); fRowCol++) {

			sh.getRow(0).createCell(fRowCol)
					.setCellValue(driver.findElements(By.xpath("(//div/table[@id='customers']/descendant::tr)[1]/th"))
							.get(fRowCol).getText());

			fos = new FileOutputStream("C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts"
					+ "\\src\\handleWebTable\\WriteToExcel.xlsx");

			wb.write(fos);
		}

		String bXpath = "(//div/table[@id='customers']/descendant::tr)[";

		String aXpath = "]/td";

		for (int row = 1; row < rCnt.size(); row++) {

			sh.createRow(row);

			for (int col = 0; col < driver.findElements(By.xpath("//div/table[@id='customers']/descendant::tr/th"))
					.size(); col++) {

				sh.getRow(row).createCell(col)
						.setCellValue(driver.findElements(By.xpath(bXpath + (row + 1) + aXpath)).get(col).getText());

				fos = new FileOutputStream("C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts"
						+ "\\src\\handleWebTable\\WriteToExcel.xlsx");

				wb.write(fos);
			}
		}

		fos.close();

		wb.close();

		driver.quit();

	}

}
