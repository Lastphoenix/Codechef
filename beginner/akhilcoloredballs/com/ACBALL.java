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

			calculateHammingDistance(x,white,black);
			calculateHammingDistance(y,white,black);
			
			tests--;
		}
	}

	private static void calculateHammingDistance(String x, char white, char black) {
		
		for (int i = 0; i < x.length();i++) {
			if (x.charAt(i) == white) {
				System.out.print(black);
			}
			if (x.charAt(i) == black) {
				System.out.print(white);
			}
		}
	}
}