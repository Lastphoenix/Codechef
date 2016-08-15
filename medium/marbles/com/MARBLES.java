package marbles.com;

import java.io.*;
import java.math.BigInteger;

public class MARBLES {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			
			String [] s = br.readLine().split(" ");
			int numberOfMarbles = Integer.parseInt(s[0]) - 1;
			int numberOfColors = Integer.parseInt(s[1]) - 1;
			
			System.out.println(combination(numberOfMarbles,numberOfColors));
		}
	}
	
	private static BigInteger combination(final int N, final int K) {
		
	    BigInteger ans = BigInteger.ONE;
	    
	    final int J = Math.max(K, N - K);
		for (int i = J + 1; i <= N; i++)
			ans = ans.multiply(new BigInteger(""+i));
		
		for (int i = 2; i <= N - J; i++) 
			ans = ans.divide(new BigInteger(""+i));
		
		return ans;
	}
}