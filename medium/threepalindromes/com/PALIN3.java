package threepalindromes.com;

import java.math.BigInteger;
import java.util.Scanner;

class PALIN3 {

	private int[] p;
	private String s;
	private char[] t;

	public PALIN3(String s) {

		this.s = s;
		preprocess();
		p = new int[t.length];

		int center = 0, right = 0;
		for (int i = 1; i < t.length - 1; i++) {
			int mirror = 2 * center - i;

			if (right > i)
				p[i] = Math.min(right - i, p[mirror]);

			while (t[i + (1 + p[i])] == t[i - (1 + p[i])])
				p[i]++;

			if (i + p[i] > right) {
				center = i;
				right = i + p[i];
			}
		}
	}

	private void preprocess() {

		t = new char[s.length() * 2 + 3];
		t[0] = '$';
		t[s.length() * 2 + 2] = '@';

		for (int i = 0; i < s.length(); i++) {
			t[2 * i + 1] = '#';
			t[2 * i + 2] = s.charAt(i);
		}

		t[s.length() * 2 + 1] = '#';
	}

	public String longestPalindromicSubstring(int i) {

		int length = p[i + 2];
		int center = i + 2;

		return s.substring((center - 1 - length) / 2, (center - 1 + length) / 2);
	}

	public static boolean trailingZeros(String string) {

		int x = string.length();

		if (x == 1) {
			return true;
		}
		if (x > 1) {
			if (string.charAt(0) == 0) {
				return false;
			}
			if (string.charAt(0) == 0 && string.charAt(1) == 0) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String s = input.replaceAll("\\s+","");
		PALIN3 manacher = new PALIN3(s);
		int count = 0;

		for (int i = 0; i < 2 * s.length(); i++) {
			long x = manacher.longestPalindromicSubstring(i).length();
			if (x > 0) {
				BigInteger result = new BigInteger(manacher.longestPalindromicSubstring(i));
				BigInteger division = new BigInteger("3");
				BigInteger remainder = result.remainder(division);
				if (remainder == BigInteger.ZERO && trailingZeros(manacher.longestPalindromicSubstring(i))) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
