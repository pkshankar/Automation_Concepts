package javaPrograms;

public class SwapIntegers {

	public static void main(String[] args) {
		
		swapIntWithoutTemp(98,6);
	}
	
	public static void swapIntWithoutTemp(int num1, int num2) {
		
		System.out.println("BEFORE SWAP NUM1 : " + num1);
		System.out.println("BEFORE SWAP NUM2 : " + num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("AFTER SWAP NUM1 : " + num1);
		System.out.println("AFTER SWAP NUM2 : " + num2);
	}

}
