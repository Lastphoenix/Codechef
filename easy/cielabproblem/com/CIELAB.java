package cielabproblem.com;

import java.io.*;

public class CIELAB {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = A - B;
		if (C > 0) {
			if (C % 10 == 9) {
				System.out.println(A - B - 1);
			} else {
				System.out.println(A - B + 1);
			}
		} else {
			if (C % 10 == 9) {
				System.out.println(B - A - 1);
			} else {
				System.out.println(B - A + 1);
			}
		}
	}
}