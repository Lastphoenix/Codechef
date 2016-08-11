package primegenerator.com;

import java.util.Scanner;

public class PRIME1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0){
			
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			for(int i = m; i <= n; i++){
				if (primeGenerator(i)) {
					System.out.println(i);
				}
			}
			System.out.println();
		}
		sc.close();		
	}

	private static boolean primeGenerator(int n) {
		
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