// This logic works for current month, future and past years. Logic needs to be written for other months of the same year

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar {

	static String dateArr[] = null;

	public static void main(String[] args) {

		String date = "27-October-2059";
		dateArr = date.split("-");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("datepicker")).click();
		if (driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equalsIgnoreCase(dateArr[1])
				&& driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().equals(dateArr[2])) {

			clickDate(driver);

		} else if (driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()
				.equalsIgnoreCase(dateArr[1])
				&& Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"))
						.getText()) < Integer.parseInt(dateArr[2])) {

			clickNextMultiple(driver, Integer.parseInt(dateArr[2])
					- Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText()));
			clickDate(driver);

		} else if (driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()
				.equalsIgnoreCase(dateArr[1])
				&& Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"))
						.getText()) > Integer.parseInt(dateArr[2])) {

			clickPreviousMultiple(driver,
					Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText())
							- Integer.parseInt(dateArr[2]));
			clickDate(driver);

		} else if (Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"))
				.getText()) < Integer.parseInt(dateArr[2])) {

			clickNext(driver, dateArr[1], dateArr[2]);

		} else if (Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"))
				.getText()) > Integer.parseInt(dateArr[2])) {
			clickPrevious(driver, dateArr[1], dateArr[2]);
		}
	}

	public static void clickDate(WebDriver driver) {

		List<WebElement> list = driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
		for (WebElement w : list) {

			if (w.getText().equals(dateArr[0])) {

				w.click();
				break;
			}
		}

	}

	public static void clickPreviousMultiple(WebDriver driver, Integer count) {

		for (int counter = 0; counter < (count * 12); counter++) {

			driver.findElement(By.xpath("//span[text()='Prev']")).click();

		}
	}

	public static void clickNextMultiple(WebDriver driver, Integer count) {

		for (int counter = 0; counter < (count * 12); counter++) {

			driver.findElement(By.xpath("//span[text()='Next']")).click();

		}
	}

	public static void clickNext(WebDriver driver, String month, String year) {

		boolean flag = true;
		while (flag) {

			driver.findElement(By.xpath("//span[text()='Next']")).click();
			if (driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()
					.equalsIgnoreCase(dateArr[1])
					&& driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText()
							.equals(dateArr[2])) {

				clickDate(driver);
				flag = false;

			}

		}

	}

	public static void clickPrevious(WebDriver driver, String month, String year) {

		boolean flag = true;
		while (flag) {

			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			if (driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()
					.equalsIgnoreCase(dateArr[1])
					&& driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText()
							.equals(dateArr[2])) {

				clickDate(driver);
				flag = false;

			}

		}

	}

}
