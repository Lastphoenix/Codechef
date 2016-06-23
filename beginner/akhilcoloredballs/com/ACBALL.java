package akhilcoloredballs.com;

import java.io.*;

//https://www.codechef.com/problems/ACBALL

public class ACBALL {

	private static final char white = 'W';
	private static final char black = 'B';
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		
		while (tests > 0) {
			
			String x = br.readLine();
			String y = br.readLine();

			char[] a = calculateHammingDistance(x,white,black);
			char[] b = calculateHammingDistance(y,white,black);
			
			char[] result = new char[x.length()];
			
			for (int i = 0; i < x.length(); i++) {
				if (a[i] == b[i]) {
					result[i] = a[i];
				}
				if ( a[i] != b[i]) {
					result[i] = a[i];
				}
			}
			System.out.print(result);
			tests--;
		}
	}

	private static char[] calculateHammingDistance(String x, char white, char black) {
		
		char[] abc = new char[x.length()];
		
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == white) {
				abc[i] = black;
			}
			if (x.charAt(i) == black) {
				abc[i] = white;
			}
		}
		return abc;
	}
}