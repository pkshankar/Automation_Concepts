package learnTestNG;

import org.testng.annotations.Test;

public class ParallelExecution2 {

	@Test
	public void parallelExecutionTest1() {
		
		System.out.println(Thread.currentThread().getId() + " INSIDE parallelExecutionTest2 - 1 ");
		
	}
	
//	@Test
//	public void parallelExecutionTest2() {
//		
//		System.out.println(Thread.currentThread().getId() + " INSIDE parallelExecutionTest2 - 2 ");
//		
//	}
}
