package learnTestNG;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ParallelExecution3 {
	
	@Test
	public void parallelExecutionTest1() {
		
		System.out.println(Thread.currentThread().getId() + " INSIDE parallelExecutionTest3 - 1 ");
		
		
	}
	
//	@Test
//	public void parallelExecutionTest2() {
//		
//		System.out.println(Thread.currentThread().getId() + " INSIDE parallelExecutionTest3 - 2 ");
//		
//	}
//	
//	@Test
//	public void parallelExecutionTest3() {
//		
//		System.out.println(Thread.currentThread().getId() + " INSIDE parallelExecutionTest3 - 3 ");
//		
//	}
//	
//	@Test
//	public void parallelExecutionTest4() {
//		
//		System.out.println(Thread.currentThread().getId() + " INSIDE parallelExecutionTest3 - 4 ");
//		
//	}

}
