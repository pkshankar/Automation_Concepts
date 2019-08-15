package failedCasesScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

public class Util extends TestCases {
	
	public static void captureScreenshot(ITestResult res) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\Screenshots\\"+res.getMethod().getMethodName()+".png"));
	}

}
