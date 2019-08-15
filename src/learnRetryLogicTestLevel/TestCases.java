package learnRetryLogicTestLevel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void test1() {

		Assert.assertTrue(false);
	}

	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void test2() {

		Assert.assertTrue(false);
	}

}
