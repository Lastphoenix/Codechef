package cleaningup.com;

import java.util.*;

public class CLEANUP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			Integer begin = 1;
			Integer[] listN = new Integer[n];

			for (int j = 0; j < n; j++) {
				listN[j] = begin;
				begin++;
			}

			Integer[] listM = new Integer[m];

			for (int i = 0; i < m; i++) {
				listM[i] = sc.nextInt();
			}

			jobs(listM, listN);
			t--;
		}
		sc.close();
	}

	private static void jobs(Integer[] listM, Integer[] listN) {

		int temp = 2;
		Set<Integer> chef = new HashSet<Integer>();
		Set<Integer> assistant = new HashSet<Integer>();
		
		for (int j = 0; j < listN.length; j++) {
			if (!Arrays.asList(listM).contains(listN[j])) {
				if (temp % 2 == 0) {
					chef.add(listN[j]);
				} else {
					assistant.add(listN[j]);
				}
				temp++;
			}
		}

		System.out.println(builder(chef));
		System.out.println(builder(assistant));
	}

	private static String builder(Set<Integer> x) {

		StringBuilder builder = new StringBuilder();
		
		for (Integer value : x) {
			builder.append(value + " ");
		}
		
		String text = builder.toString();
		String result = text.replaceAll("\\s+$", "");
		return result;
	}
}