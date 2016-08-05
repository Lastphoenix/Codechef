package asimpleequation.com;

import java.io.*;

public class EQUATION {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		
		while (testCases > 0) {
			
			int[] numbers = arrayNumbers(br);
			int N = numbers[0];
			int A = numbers[1];
			int B = numbers[2];
			int C = numbers[3];
			int count = 0;
			
			for (int a = 0; a <= A; a++) {
				for (int b = 0; b <= B; b++) {
					for (int c = 0; c <= C; c++) {
						if (a + b + c <= N) 
							count++;
						
					}
				}
			}
			System.out.println(count);
			testCases--;
		}
	}
	
	public static int[] arrayNumbers(BufferedReader br) throws Exception {
		
		String[] line = br.readLine().split(" ");
		int[] x = new int[4];
		
		for(int i = 0; i < 4; i++) {
			x[i] = Integer.parseInt(line[i]);
		}
		return x;
	}
}