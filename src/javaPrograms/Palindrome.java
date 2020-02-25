package javaPrograms;

public class Palindrome {

	public static void main(String[] args) {

		int num = 12321;
		if (checkPalindrome(num) == num)
			System.out.println(num + " IS A PALINDROME");
		else
			System.out.println(num + " IS NOT A PALINDROME");
	}

	public static int checkPalindrome(int num) {

		int revNum = 0;
		int rem = 0;
		while (num > 0) {

			rem = num % 10; // 1, 2, 1
			num = num / 10; // 12, 1, 0
			revNum = (revNum * 10) + rem; // 1, 12, 121

		}

		return revNum;
	}

}
