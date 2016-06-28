package chefanddolls.com;

import java.util.*;

//https://www.codechef.com/problems/MISSP

public class MISSP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		
		while (tests > 0) {
			
			int size = sc.nextInt();
	        Set<Integer> map = new HashSet<Integer>();
			
			for (int i = 0; i < size; i++) {
				int doll = sc.nextInt();
				if (map.contains(doll)){
					map.remove(doll);
				} else {
					map.add(doll);
				}
			}
			for (Integer integer : map) {
				System.out.print(integer + " ");
			}
			tests--;
		}
		sc.close();
	}
}