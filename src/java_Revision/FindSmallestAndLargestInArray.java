package java_Revision;

public class FindSmallestAndLargestInArray {

	public static void main(String[] args) {

		int numArr[] = { -9, -5, 0, 8 , -269, 78};
		System.out.println("SMALLEST NUMBER IN THE GIVEN ARRAY IS " + findSmallest(numArr));
		System.out.println("LARGEST NUMBER IN THE GIVEN ARRAY IS " + findLargest(numArr));

	}

	public static int findSmallest(int[] numArr) {

		int smallest = numArr[0];
		for (int i = 1; i < numArr.length; i++) {

			if (numArr[i] < smallest) {

				smallest = numArr[i];
			}
		}
		return smallest;
	}

	public static int findLargest(int[] numArr) {

		int largest = numArr[0];
		for (int i = 1; i < numArr.length; i++) {

			if (numArr[i] > largest) {

				largest = numArr[i];
			}
		}
		return largest;
	}

}
