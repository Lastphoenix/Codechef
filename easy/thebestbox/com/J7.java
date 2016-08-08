package thebestbox.com;

import java.io.*;

public class J7 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while (t > 0) {
			
			String[] st = br.readLine().split(" ");
			int P = Integer.parseInt(st[0]);
			int S = Integer.parseInt(st[1]);
			float det = (P - (float) Math.sqrt((float)(P * P - 24 * S)))/12;
			float ans = det * ( S/2 - P * det/4 + det * det);
			System.out.printf("%.2f\n", ans);
			t--;
		}
	}
}