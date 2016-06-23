package addtwonumbers.com;

import java.io.*;

//https://www.codechef.com/problems/FLOW001

public class FLOW001 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		
		while (tests > 0) {
			
			String[] numbers = br.readLine().split(" ");
			int a = Integer.parseInt(numbers[0]);
			int b = Integer.parseInt(numbers[1]);
			System.out.println(a + b);
			tests--;
		}
	}
}