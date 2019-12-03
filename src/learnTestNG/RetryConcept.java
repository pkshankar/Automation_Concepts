package learnTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RetryConcept {
	
	
	@Test
	public void test1() {
		
		Assert.assertTrue(false);
	}

	
	@Test
	public void test2() {
		
		Assert.assertTrue(true);
	}
}
