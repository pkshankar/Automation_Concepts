package javaInterview;

public class SwapIntegers {

	public static void main(String[] args) {

		int x = 10;

		int y = 20;

		System.out.println("x: " + x);

		System.out.println("y: " + y);

		/* APPROACH 1 */

		x = x + y; // 30

		y = x - y; // 10

		x = x - y; // 20

		System.out.println("********************");

		System.out.println("AFTER SWAP");

		System.out.println("x: " + x);

		System.out.println("y: " + y);

		System.out.println("*********************************************************************");

		/* APPROACH 2 */

		int x1 = 25;

		int y1 = 45;

		System.out.println("x1: " + x1);

		System.out.println("y1: " + y1);

		x1 = x1 * y1; // 200

		y1 = x1 / y1; // 10

		x1 = x1 / y1; // 20

		System.out.println("********************");

		System.out.println("AFTER SWAP");

		System.out.println("x1: " + x1);

		System.out.println("y1: " + y1);

		/* APPROACH 3 */

		System.out.println("*********************************************************************");

		int x2 = 97;

		int y2 = 34;

		System.out.println("x2: " + x2);

		System.out.println("y2: " + y2);

		x2 = x2 ^ y2;

		y2 = x2 ^ y2;

		x2 = x2 ^ y2;

		System.out.println("********************");

		System.out.println("AFTER SWAP");

		System.out.println("x2: " + x2);

		System.out.println("y2: " + y2);

	}

}
