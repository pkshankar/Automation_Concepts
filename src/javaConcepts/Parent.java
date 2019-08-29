package javaConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parent {
	
	public Parent() {
		
		System.out.println("HELLO ! THIS IS PARENT CONSTRUCTOR");
	}
	
	@BeforeMethod
	public void parentBeforeMethod() {
		
		System.out.println("HI ! THIS IS PARENT BEFORE METHOD");
	}
	
	@AfterMethod
	public void parentAfterMethod() {
		
		System.out.println("HI ! THIS IS PARENT AFTER METHOD");
	}

}
