package chefandtwostrings.com;

import java.io.*;

//https://www.codechef.com/problems/CHEFSTLT

public class CHEFSTLT {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while (t > 0){

			String s1 = br.readLine();
			String s2 = br.readLine();
			int max = s1.length();
			int min = 0;
			
			for(int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != '?' && s2.charAt(i) != '?') {
					if (s1.charAt(i) == s2.charAt(i)) {
						max--;
					}
					if (s1.charAt(i) != s2.charAt(i)) {
						min++;
					}
				}
			}
			System.out.println(min + " " + max);
			t--;
		}
	}
}