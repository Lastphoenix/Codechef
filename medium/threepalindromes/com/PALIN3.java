package threepalindromes.com;

import java.io.*;

public class PALIN3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		System.out.println(countPalin(S));
	}

	private static int countPalin(String S) {

		int answer = 0;
		int len = S.length() + 1;

		for (int i = 1; i < len; i++) {
			for (int j = i; j < len; j++) {
				String temp = S.substring(i, j);
				if (checkPalin(temp) && divisibleThree(temp) && !trailingzeros(temp)) {
					answer++;
				}
			}
		}
		return answer;
	}

	private static boolean trailingzeros(String temp) {

		if (temp.length() == 1) {
			return false;
		}
		
		int a = Character.getNumericValue(temp.charAt(0));
		int b = Character.getNumericValue(temp.charAt(1));
		
		if (a == 0 && b == 0) {
			return true;
		}
		return false;
	}

	private static boolean divisibleThree(String temp) {

		int x = 0;

		for (int i = 0; i < temp.length(); i++) {
			x = x + Character.getNumericValue(temp.charAt(i));
			if (x % 3 == 0) {
				return true;
			}
		}
		return false;
	}

	private static boolean checkPalin(String S) {

		String reverse = new StringBuilder(S).reverse().toString();
		if (S.equals(reverse)) {
			return true;
		}
		return false;
	}
}