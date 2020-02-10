package learnTestNG;

import org.testng.annotations.Test;

public class ParallelExecution1 {
	
	@Test
	public void parallelExecutionTest1() {
		
		System.out.println(Thread.currentThread().getId() + " INSIDE parallelExecutionTest1 - 1 ");
		
	}
//	
//	@Test
//	public void parallelExecutionTest2() {
//		
//		System.out.println(Thread.currentThread().getId() + " INSIDE parallelExecutionTest1 - 2 ");
//		
//	}
//	
//	@Test
//	public void parallelExecutionTest3() {
//		
//		System.out.println(Thread.currentThread().getId() + " INSIDE parallelExecutionTest1 - 3 ");
//		
//	}

}
