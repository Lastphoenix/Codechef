package aprimeconjecture.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PRIMES2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			int oddNumber = Integer.parseInt(br.readLine());

			if (oddNumber == 0) {
				break;
			}

			int[] res = solve(oddNumber);
			System.out.println(res[0] + " " + res[1] + " " + res[2]);
		}
	}
	
	public static int[] solve(int n) {
		
        for(int p3 = 100; p3 > 1; p3--) {
        	
            if(p3 * p3 * p3 > n && !isPrime(p3)) continue;
            for(int p2 = 2; p2 * p2 + p3 * p3 * p3 < n; p2++) {
            	
                int p1 = n - p2 * p2 - p3 * p3 * p3;
                if(isPrime(p2) && isPrime(p1)) {
                    return new int[]{p1, p2, p3};
                }
            }
        }
        return new int[]{0, 0, 0};
    }

	public static boolean isPrime(int n) {

		for (int number = 2; number < Math.sqrt(n); number++) {
            if (n % number == 0) {
                return false;
            }
        }
        return true;
    }
}