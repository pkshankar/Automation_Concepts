package learnTestNG;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataExcel {

	String filePath = "C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\TestData\\CreateYahooUser.xlsx";
	String tabName = "userData";
	String url = "https://login.yahoo.com/account/create?specId=yidReg";
	String firstNameId = "usernamereg-firstName";
	String lastNameId = "usernamereg-lastName";
	String emailAddressId = "usernamereg-yid";
	String passwordId = "usernamereg-password";
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\MakeMyTrip_Framework\\Browser Drivers\\chromedriver_New.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(url);
	}

	@DataProvider
	public String[][] getData() {

		return readDataExcel(filePath, tabName);
	}

	@Test(dataProvider = "getData")
	public void createYahooUser(String firstName, String lastName, String emailAddress, String password) {

		driver.findElement(By.id(firstNameId)).sendKeys(firstName);
		driver.findElement(By.id(lastNameId)).sendKeys(lastName);
		driver.findElement(By.id(emailAddressId)).sendKeys(emailAddress);
		driver.findElement(By.id(passwordId)).sendKeys(password);

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

	public String[][] readDataExcel(String filePath, String tabName) {

		String[][] data = null;

		try {

			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(tabName);
			int lastRow = sh.getLastRowNum();
			data = new String[lastRow][sh.getRow(0).getLastCellNum()];
			for (int rw = 0; rw < lastRow; rw++) {

				for (int cl = 0; cl < sh.getRow(rw).getLastCellNum(); cl++) {

					data[rw][cl] = sh.getRow(rw + 1).getCell(cl).getStringCellValue();
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return data;

	}

}
