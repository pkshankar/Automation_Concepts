package learnCacheLookup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryClass extends TestBase {

	@FindBy(name = "firstname")
	public WebElement fNameWithoutCacheLookup;

	@FindBy(name = "firstname")
	@CacheLookup
	public WebElement fNameWithCacheLookup;

	public PageFactoryClass() {

		PageFactory.initElements(driver, this);
	}

	public long withoutCacheLookup() {

		fNameWithoutCacheLookup.sendKeys("SHANKAR");

		long withoutcacheLookupStartTime = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++) {

			fNameWithoutCacheLookup.getText();
		}

		long withoutcacheLookupEndTime = System.currentTimeMillis();

		return ((withoutcacheLookupEndTime - withoutcacheLookupStartTime) / 1000);
	}

	public long withCacheLookup() {

		fNameWithCacheLookup.sendKeys("SHANKAR");

		long withcacheLookupStartTime = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++) {

			fNameWithCacheLookup.getText();
		}

		long withcacheLookupEndTime = System.currentTimeMillis();

		return ((withcacheLookupEndTime - withcacheLookupStartTime) / 1000);
	}

}
