package javaPrograms;

public class FindSmallestNum {

	public static void main(String[] args) {

		int numArr[] = { 2, 1 };

		System.out.println("SMALLEST NUMBER IS : " + findSmallest(numArr));

	}

	public static int findSmallest(int num[]) {

		int sNum = num[0];
		for (int i = 1; i < num.length; i++) {

			if (num[i] < sNum) {

				sNum = num[i];
			}
		}

		return sNum;
	}

}
