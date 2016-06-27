package chefandcoloring.com;

import java.io.*;

public class COLOR {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());

		while (tests > 0) {
			
			int rooms = Integer.parseInt(br.readLine());
			String colors = br.readLine();
			System.out.println(coloring(colors, rooms));
			tests--;
		}
	}
	
	private static int coloring(String colors, int rooms) {
		
		int red = 0; int green = 0; int blue = 0;
		
		for(int i = 0; i < rooms; i++) {
			if (colors.charAt(i) == 'R') {
				red++;
			}
			if (colors.charAt(i) == 'G') {
				green++;
			}
			if (colors.charAt(i) == 'B') {
				blue++;
			}
		}
		int result = rooms - Math.max(red, Math.max(green, blue));
		return result;
	}
}