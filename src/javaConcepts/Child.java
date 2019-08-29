package javaConcepts;

import org.testng.annotations.Test;

public class Child extends Parent {
	
	public Child() {
		
		System.out.println("HEY ! THIS IS CHILD CONSTRUCTOR");
	}

	@Test
	public static void childTest1() {

		System.out.println("HI ! THIS IS CHILD TEST METHOD - 1");
	}
	
	@Test
	public static void childTest2() {

		System.out.println("HI ! THIS IS CHILD TEST METHOD - 2");
	}
	
	@Test
	public static void childTest3() {

		System.out.println("HI ! THIS IS CHILD TEST METHOD - 3");
	}

	public static void main(String[] args) {

		childTest1();
		childTest2();
		childTest3();

	}

}
