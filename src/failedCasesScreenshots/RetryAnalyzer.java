package failedCasesScreenshots;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer extends TestListener implements IRetryAnalyzer {

	TestListener listenObj = new TestListener();

	int counter = 0;
	int retryLimit = 3;

	public boolean retry(ITestResult res) {

		if (counter < retryLimit) {

			counter++;

			return true;
		}

		listenObj.onTestFailure(res);

		return false;

	}

}
