package javaInterview;

public class FindMaxMin {

	public static void main(String[] args) {

		int num[] = {-100,-200,500,900,0 };

		int largest = num[0];

		int smallest = num[0];

		for (int i = 1; i < num.length; i++) {

			if (num[i] > largest) {

				largest = num[i];
			}

			else if (num[i] < smallest) {

				smallest = num[i];
			}
		}

		System.out.println("LARGEST " + largest);

		System.out.println("SMALLEST " + smallest);

	}

}
