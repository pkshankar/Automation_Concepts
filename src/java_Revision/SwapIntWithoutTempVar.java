package java_Revision;

public class SwapIntWithoutTempVar {

	public static void main(String[] args) {
		
		int num1 = 9087;
		int num2 = 678;
		num1 = num1+num2; //30
		num2 = num1-num2; //10
		num1 = num1 - num2;
		System.out.println(num1);
		System.out.println(num2);

	}

}
