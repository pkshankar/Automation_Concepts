/* CHECK WHETHER A NUMBER IS PRIME 
 * 
 * @Author: P K Shankar
 * 
 */

package javaConcepts;

public class CheckPrimeNumber {

	static int flag = 0;

	public static void main(String[] args) {

		//CheckPrimeNumber.checkPrimeMethod1(571);

		Object[] obj = CheckPrimeNumber.checkPrimeMethod2(2050211);

		if (obj[0].equals(true)) {

			System.out.println(obj[1] + " IS A PRIME NUMBER");
		} else {

			System.out.println(obj[1] + " IS NOT A PRIME NUMBER");
		}

	}
	
	/* LOGIC 1 TO CHECK PRIME NUMBER */

	public static void checkPrimeMethod1(int num) {

		if (num <= 1) {

			System.out.println(num + " IS NOT A PRIME NUMBER");
		}

		else {

			for (int i = 2; i <= num; i++) {

				if (num % i == 0) {

					flag++;
				}

				if (flag == 1 && num == i) {

					System.out.println(num + " IS A PRIME NUMBER");

				}

				else if (flag > 1) {

					System.out.println(num + " IS NOT A PRIME NUMBER");

					break;

				}
			}
		}

	}
	
	/* LOGIC 2 TO CHECK PRIME NUMBER */

	public static Object[] checkPrimeMethod2(int num) {

		Object[] obj = new Object[2];

		if (num <= 1) {

			obj[0] = false;
			obj[1] = num;

			return obj;

		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				obj[0] = false;
				obj[1] = num;

				return obj;
			}
		}
		obj[0] = true;

		obj[1] = num;

		return obj;

	}

}
