package learnTestNG;

import org.testng.annotations.Test;

public class GroupsConcept {
	
	@Test(groups = "smokeTest")
	public void groupsTest1() {
		
		System.out.println("INSIDE GROUPS CONCEPT - GROUPS TEST 1");
	}
	
	@Test(groups = {"smokeTest","functionalTest"})
	public void groupsTest2() {
		
		System.out.println("INSIDE GROUPS CONCEPT - GROUPS TEST 2");
	}
	
	@Test(groups = "sanityTest")
	public void groupsTest3() {
		
		System.out.println("INSIDE GROUPS CONCEPT - GROUPS TEST 3");
	}
	
	

}
