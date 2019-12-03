import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {

	public static void main(String[] args) {
		
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, 7);
	Date date = cal.getTime();
	//System.out.println(date);
	//System.out.println(cal.get(Calendar.DATE));
	//Date date = new Date();
	//System.out.println(date.toString());
	String dateFormat = "E MMM"+ " "+ cal.get(Calendar.DATE)+" "+ cal.get(Calendar.YEAR);
	//System.out.println(dateFormat);
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
	System.out.println(simpleDateFormat.format(date));
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshank\\eclipse-workspace\\MakeMyTrip_Framework\\Browser Drivers\\chromedriver_New.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	driver.findElement(By.xpath("//li[@data-cy='menu_Flights']")).click();
	driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
	driver.findElement(By.xpath("//label[@for='fromCity']")).click();
	driver.findElement(By.xpath("//div[@id='react-autowhatever-1' and @role='listbox']/descendant::div[text()='BOM']")).click();
	driver.findElement(By.xpath("//div[@id='react-autowhatever-1' and @role='listbox']/descendant::div[text()='KTM']")).click();
	driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']")).click();
	driver.findElement(By.xpath("//div[@role='gridcell' and @aria-label="+"'"+simpleDateFormat.format(date)+"'"+"]")).click();
		
	}

}
