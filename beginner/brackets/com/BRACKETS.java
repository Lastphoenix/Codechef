package brackets.com;

import java.io.*;

//https://www.codechef.com/problems/BRACKETS

public class BRACKETS {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t > 0) {

			String a = br.readLine();
			int size = maxBalance(a);
			StringBuilder sb = new StringBuilder(2 * size);
			for (int i = 0; i < size; i++) {
				sb.append("(");
			}
			for (int i = 0; i < size; i++) {
				sb.append(")");
			}

			System.out.println(sb.toString());
			t--;
		}
	}

	private static int maxBalance(String a) {

		int balance = 0;
		int maxbalance = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '(') {
				balance++;
			} else {
				balance--;
			}
			maxbalance = Math.max(maxbalance, balance);
		}
		return maxbalance;
	}
}