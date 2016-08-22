package chefandchain.com;

import java.io.*;

/*
 * Problem codechef Easy number 61
 */
public class CHEFCH {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			
			int x = 0;
			int y = 0;
			int w = 0;
		    int z = 0;
			String s = br.readLine();
			int a = s.length();

			for(int i = 0; i < a; i++){
				if(s.charAt(i) !='+' && i % 2 == 0)
					x++;
			}
			for(int i = 0; i < a; i++){
				if(s.charAt(i) !='-' && i % 2 == 1)
					y++;
			}
			int min1 = x + y;
			
			for(int i = 0; i < a; i++){
				if(s.charAt(i) !='-' && i % 2 == 0)
					w++;
			}
			for(int i = 0; i < a; i++){
				if(s.charAt(i) !='+' && i % 2 == 1)
					z++;
			}
			int min2 = w + z;
			System.out.println(Math.min(min1, min2));
		}
	}
}