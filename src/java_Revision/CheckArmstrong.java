package java_Revision;

import java.util.ArrayList;

public class CheckArmstrong {

	static int rem, quo, sum = 0;

	public static void main(String[] args) {

		int num = 1634;
		if (isArmstrong(num)) {

			System.out.println(num + " IS AN ARMSTRONG NUMBER");
		} else {

			System.out.println(num + " IS  NOT AN ARMSTRONG NUMBER");
		}

	}

	public static boolean isArmstrong(int num) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		quo = num;

		while (quo > 0) {

			rem = quo % 10; // 3, 5, 1
			quo = quo / 10; // 15, 1, 0
			al.add(rem);

		}

		int pow = al.size();
		for (int i = 0; i < pow; i++) {

			sum = (int) (sum + Math.pow(al.get(i), pow));
		}

		if (sum == num) {

			return true;
		} else {

			return false;
		}
	}

}
