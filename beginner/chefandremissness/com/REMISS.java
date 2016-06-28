package chefandremissness.com;

import java.util.Scanner;

//https://www.codechef.com/problems/REMISS

public class REMISS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t > 0){
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = a + b;
			int min = Math.max(a, b);
			System.out.println(min + " " + max);
			t--;
		}
		sc.close();
	}
}