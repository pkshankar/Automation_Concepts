import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/info/sessionexpired?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//div[@class='TquXA']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb']/span"));
		for(WebElement w : list) {
			
			System.out.println(w.getText());
		}

	}

}
