package atm.com;

import java.io.*;

//https://www.codechef.com/problems/HS08TEST

public class HS08TEST {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		double withdraw = Double.parseDouble(s[0]);
		double accountBalance = Double.parseDouble(s[1]);
		double result = accountBalance - withdraw - 0.50;

		if ((withdraw + 0.50) < accountBalance) {
			if (withdraw % 5 != 0) {
				System.out.println(String.format("%.2f", accountBalance));
			}
			if (withdraw % 5 == 0) {
				System.out.println(String.format("%.2f", result));
			} 
		}
		if ((withdraw + 0.50) >= accountBalance) {
			System.out.println(String.format("%.2f", accountBalance));
		}
	}
}
