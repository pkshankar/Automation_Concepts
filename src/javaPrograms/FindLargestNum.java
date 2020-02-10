package javaPrograms;

public class FindLargestNum {

	public static void main(String[] args) {

		int numArr[] = { 2, 1, -409, -30 };

		System.out.println("LARGEST NUMBER IS : " + findLargest(numArr));

	}

	public static int findLargest(int num[]) {

		int lNum = num[0];
		for (int i = 1; i < num.length; i++) {

			if (num[i] > lNum) {

				lNum = num[i];
			}
		}

		return lNum;
	}

}
