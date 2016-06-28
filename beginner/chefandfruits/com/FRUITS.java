package chefandfruits.com;

import java.util.Scanner;

//https://www.codechef.com/problems/FRUITS

public class FRUITS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t > 0) {
		
		int apples = sc.nextInt();
		int oranges = sc.nextInt();
		int coins = sc.nextInt();
			
			for (int i = 0; i < coins; i++) {
				if (apples < oranges) {
					apples++;
				}
				if (apples > oranges) {
					oranges++;
				} 
				if (apples == oranges) {
					break;
				}
			}
		System.out.println(Math.abs(oranges - apples));
		t--;
		}
		sc.close();
	}
}