package closingthetweets.com;

import java.util.Scanner;

public class TWTCLOSE {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] tweets = reset(N);
		
		for(int i = 0; i < K; i++) {
			String s = sc.next();
			
			if (s.equals("CLOSEALL")) {
				tweets = reset(N);
				System.out.println(sum(tweets, N));
			}
			
			if (s.startsWith("CLICK")){
				int j = sc.nextInt();
				if (tweets[j - 1] == 1) { 
					tweets[j - 1] = 0;
				} else {
					tweets[j - 1] = 1;
				}
				System.out.println(sum(tweets, N));
			}
		}
		sc.close();
	}
	
	private static int sum(int[] tweets, int a) {
		
		int x = 0;
		
		for(int i = 0; i < a; i++) {
			x += tweets[i];
		}
		
		return x;
	}

	private static int[] reset(int N) {
		
		int[] x = new int[N];
		
		for(int i = 0; i < N; i++){
			x[i] = 0;
		}
		
		return x;
	}
}