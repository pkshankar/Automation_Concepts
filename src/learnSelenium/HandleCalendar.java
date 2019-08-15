package learnSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar {

	static WebDriver driver;

	static Properties prop;

	public static void main(String[] args) throws IOException {

		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\src\\learnSelenium\\calendarMonths.properties");

		prop.load(fis);

		String userDate = "21-May-4099";

		String[] userDateArray = userDate.split("-");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\Browser_Drivers\\ChromeDriver.exe");

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		driver.findElement(By.xpath("//input[@id='datepicker' and @type='text']")).click();

		String systemYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		String systemMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

		if (userDateArray[2].equalsIgnoreCase(systemYear) && userDateArray[1].equalsIgnoreCase(systemMonth)) {

			selectDate(userDateArray[0]);

		}

		else {

			int diffYear = Integer.parseInt(userDateArray[2]) - Integer.parseInt(systemYear);

			click(userDateArray[1], systemMonth, userDateArray[0], diffYear);

		}

	}

	public static void selectDate(String dateArr) {

		List<WebElement> wListDates = driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));

		for (int count = 0; count < wListDates.size(); count++) {

			if (wListDates.get(count).getText().equals(dateArr)) {

				wListDates.get(count).click();

				break;
			}

		}

	}

	public static void click(String userMon, String systemMon, String dateArr, int yearDiff) {

		if (yearDiff > 0) {

			if (Integer.parseInt(prop.getProperty(userMon)) >= Integer.parseInt(prop.getProperty(systemMon))) {

				int clicks = (yearDiff * 12)
						+ (Integer.parseInt(prop.getProperty(userMon)) - Integer.parseInt(prop.getProperty(systemMon)));

				System.out.println(clicks);

				for (int i = 0; i < clicks; i++) {

					driver.findElement(By.xpath("//span[text()='Next']")).click();

				}

				selectDate(dateArr);

			}

			else {

				int clicks = (yearDiff * 12) - ((Integer.parseInt(prop.getProperty(systemMon))
						- Integer.parseInt(prop.getProperty(userMon))));

				System.out.println(clicks);

				for (int i = 0; i < clicks; i++) {

					driver.findElement(By.xpath("//span[text()='Next']")).click();

				}

				selectDate(dateArr);

			}

		} else {

			if (Integer.parseInt(prop.getProperty(userMon)) >= Integer.parseInt(prop.getProperty(systemMon))) {

				int clicks = (Math.abs(yearDiff) * 12)
						- (Integer.parseInt(prop.getProperty(userMon)) - Integer.parseInt(prop.getProperty(systemMon)));

				System.out.println(clicks);

				for (int i = 0; i < clicks; i++) {

					driver.findElement(By.xpath("//span[text()='Prev']")).click();

				}

				selectDate(dateArr);

			}

			else {

				int clicks = (Math.abs(yearDiff) * 12) + ((Integer.parseInt(prop.getProperty(systemMon))
						- (Integer.parseInt(prop.getProperty(userMon)))));

				System.out.println(clicks);

				for (int i = 0; i < clicks; i++) {

					driver.findElement(By.xpath("//span[text()='Prev']")).click();

				}

				selectDate(dateArr);

			}

		}
	}
}
