package chefandoperators.com;

import java.util.Scanner;

//https://www.codechef.com/problems/CHOPRT

public class CHOPRT {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (A > B) {
				System.out.println(">");
			} if (A < B) {
				System.out.println("<");
			} if (A == B) {
				System.out.println("=");
			}
		}
		sc.close();
	}
}