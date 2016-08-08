package asimpleequation.com;

import java.io.*;

public class EQUATION {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		while (testCases > 0) {

			String[] numbers = br.readLine().split(" ");
			int N = Integer.parseInt(numbers[0]);
			int A = Integer.parseInt(numbers[1]);
			int B = Integer.parseInt(numbers[2]);
			int C = Integer.parseInt(numbers[3]);
			long count = 0;

			for (int a = 0; a <= A; a++) {
				for (int b = 0; B > (N - a) ? b <= (N - a) : b <= B; b++) {
					int temp = N - a - b;
					if(C > temp)
						count += (temp + 1);
					else
						count += (C + 1);
				}
			}
			System.out.println(count);
			testCases--;
		}
	}
}