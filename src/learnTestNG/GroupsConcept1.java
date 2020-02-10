package learnTestNG;

import org.testng.annotations.Test;

public class GroupsConcept1 {
	
	@Test(groups = {"smokeTest","sanityTest"})
	public void myGroupTest1() {
		
		System.out.println("INSIDE GROUPS CONCEPT1 - MY GROUPS TEST 1");
	}

	@Test(groups = {"functionalTest","sanityTest"})
	public void myGroupTest2() {
		
		System.out.println("INSIDE GROUPS CONCEPT1 - MY GROUPS TEST 2");
	}
}
