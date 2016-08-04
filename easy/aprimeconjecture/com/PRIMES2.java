package aprimeconjecture.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PRIMES2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			int oddNumber = Integer.parseInt(br.readLine().trim());
			if (oddNumber == 0) {
				break;
			}
			
			int flag = 0;

			int p1 = 0;
			int p2 = 0;
			int p3 = 0;

			for (p3 = 100; p3 > 1; p3--) {
				if (p3 * p3 * p3 < oddNumber && isPrime(p3)) {
					for (p2 = 2; p2 * p2 + p3 * p3 * p3 < oddNumber; p2++) {
						p1 = oddNumber - (p3 * p3 * p3) - (p2 * p2);
						if (isPrime(p2) && isPrime(p1)) {
							flag = 1;
							break;
						}
					}
					if (flag == 1)
						break;
				}

			}
			if (flag == 1)
				System.out.println(p1 + " " + p2 + " " + p3);
			else
				System.out.println("0 0 0");
		}
	}

	public static boolean isPrime(int n) {

		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0 || n == 1) {
			return false;
		}

		int sqrt = (int) Math.sqrt(n) + 1;

		for (int i = 3; i < sqrt; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}