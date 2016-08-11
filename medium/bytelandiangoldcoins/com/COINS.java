package bytelandiangoldcoins.com;

import java.util.Scanner;

public class COINS {

	static long dp[] = new long[10000000];
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long n = 10000000;
		
		for(int i = 1; i < n; i++) {
			long r = dp[(i/2)] + dp[(i/3)] + dp[(i/4)];
			dp[(int) i] = Math.max(i,r);
		}

		while (sc.hasNext()) {

			n = sc.nextLong();
			System.out.println(sum(n));
		}
	}
	
	public static long sum(long n) {
		
		if(n == 0) {
			return 0;
		} 
		if (n < 1000000 && dp[(int) n] != 0) {
			return (dp[(int) n]);
		} else {
			return Math.max(n,sum(n/2)+sum(n/3)+sum(n/4));
		}
	}
}