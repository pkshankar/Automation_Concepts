package javaPrograms;

public class Armstrong {

	public static void main(String[] args) {

//		int num = 371;
//		if (checkArmstrong(num) == num)
//			System.out.println(num + " IS AN ARMSTRONG NUMBER");
//		else
//			System.out.println(num + " IS NOT AN ARMSTRONG NUMBER");
		
		findFactorial(10);

	}

	public static int checkArmstrong(int num) {

		int sum = 0;
		String numStr = String.valueOf(num);
		int strLength = numStr.length();
		char[] numChrArr = numStr.toCharArray();
		Integer[] intArr = new Integer[numChrArr.length];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(String.valueOf(numChrArr[i]));

		}

		for (int i = 0; i < strLength; i++) {

			sum = (int) (sum + Math.pow(intArr[i], strLength));

		}

		return sum;
	}
	
	public static void findFactorial(int num) {
		
		int fact = 1 ;
		for(int i=1; i<=num; i++) {
			
			fact = fact*i; //1, 2, 
			
		}
		
		System.out.println(fact);
	}
}
