package javaConcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDatatabletoExcel {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\MakeMyTrip_Framework\\Browser Drivers\\chromedriver_New.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> rowCnt = driver.findElements(By.xpath("//div/table[@id='customers']/tbody/tr"));
		List<WebElement> colCnt = driver.findElements(By.xpath("//div/table[@id='customers']/tbody/tr/th"));
		List<WebElement> tableElements = driver.findElements(
				By.xpath("//div/table[@id='customers']/tbody/tr/th | //div/table[@id='customers']/tbody/tr/td"));

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\javaConcepts\\WriteDatatabletoExcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		int count = 0;

		for (int rw = 0; rw < rowCnt.size(); rw++) {

			sh.createRow(rw);

			for (int cl = 0; cl < colCnt.size(); cl++) {

				XSSFCell cell = sh.getRow(rw).createCell(cl);
				cell.setCellValue(tableElements.get(count).getText());
				count++;
				fis.close();
				FileOutputStream fos = new FileOutputStream(
						"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\javaConcepts\\WriteDatatabletoExcel.xlsx");
				wb.write(fos);
				fos.close();

			}

		}
		wb.close();

		driver.quit();
	}

}
