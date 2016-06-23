package permutations.com;

import java.io.*;
import java.util.Arrays;

//https://www.codechef.com/problems/PERMUT2

public class PERMUT2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			int n = Integer.parseInt(br.readLine());

			if (n == 0) {
				break;
			}

			String[] a = br.readLine().split(" ");
			int[] permutation = new int[n];

			for (int i = 0; i < a.length; i++) {
				permutation[i] = Integer.parseInt(a[i]);
			}

			int[] reverse = reversePermutation(permutation);

			if (Arrays.equals(reverse, permutation)) {
				System.out.println("ambiguous");
			} else {
				System.out.println("not ambiguous");
			}
		}
	}

	private static int[] reversePermutation(int[] permutation) {

		int[] reverse = new int[permutation.length];
		
		for (int i = 0; i < permutation.length; i++) {
			reverse[permutation[i] - 1] = i + 1;
		}
		return reverse;
	}
}