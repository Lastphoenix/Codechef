package alternatingsubarrayprefix.com;

import java.io.*;

//https://www.codechef.com/problems/ALTARAY

public class ALTARAY {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t > 0) {

			int n = Integer.parseInt(br.readLine());
			String[] arr = br.readLine().split(" ");
			long[] nArr = new long[n];

			for (int i = 0; i < n; i++) {
				nArr[i] = Long.parseLong(arr[i]);
			}

			int[] result = lengthAlternatingArray(nArr, n);

			StringBuilder res = new StringBuilder();
			for (int i = 0; i < n; i++) {
				res.append(result[i]);
				if (i != n - 1) {
					res.append(" ");
				}
			}
			System.out.println(res);
			t--;
		}
	}

	private static int[] lengthAlternatingArray(long[] a, int n) {

		int[] b = new int[a.length];
		b[n - 1] = 1;

		for (int i = n - 2; i >= 0; i--) {

			if ((a[i] < 0 && a[i + 1] > 0) || (a[i] > 0 && a[i + 1] < 0)) {
				b[i] = b[i + 1] + 1;
			} else {
				b[i] = 1;
			}

		}
		return b;
	}
}