package cleanigup.com;

import java.io.*;
import java.util.*;

public class CLEANUP {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t > 0) {

			String[] lists = br.readLine().split(" ");
			int n = Integer.parseInt(lists[0]);
			int m = Integer.parseInt(lists[1]);
			Integer begin = 1;
			Integer[] listN = new Integer[n];

			for (int j = 0; j < n; j++) {
				listN[j] = begin;
				begin++;
			}

			String[] s = br.readLine().split(" ");
			Integer[] listM = new Integer[m];

			for (int i = 0; i < m; i++) {
				listM[i] = Integer.parseInt(s[i]);
			}

			jobs(listM, listN);
			t--;
		}
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