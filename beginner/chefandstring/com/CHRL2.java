package chefandstring.com;

import java.util.Scanner;

//https://www.codechef.com/problems/CHRL2

public class CHRL2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int c = 0, h = 0 , e = 0, f = 0;
		
		for (int i = 0; i < s.length(); i++){
			char a = s.charAt(i);
			switch (a) {
			case 'C': c++; break;
			case 'H': if (h < c) h++; break;
			case 'E': if (e < h) e++; break;
			case 'F': if (f < e) f++; 
			}
		}
		System.out.println(f);
		sc.close();
	}
}