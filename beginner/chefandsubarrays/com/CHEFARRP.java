package chefandsubarrays.com;

import java.util.Arrays;
import java.util.Scanner;

//https://www.codechef.com/problems/CHEFARRP

public class CHEFARRP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t > 0){
			
			int result = 0;
			int size = sc.nextInt();
			int[] array = new int[size];
			
				for (int j = 0; j < size; j++) {
					array[j] = sc.nextInt();
				}
				
				for (int k = 0; k < size; k++) {
					for (int j = k + 1; j <= size; j++) {
						int[] tempArray = Arrays.copyOfRange(array, k, j);
 							if (sum(tempArray) == multiplication(tempArray)){
								result++;
	    					}
		        		}
					}
			System.out.println(result);
			t--;
		}
		sc.close();
	}
	
	private static int sum(int[] a) {
		
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			result = result + a[i];
		}
		return result;
	}
	
	private static int multiplication(int[] a) {
		
		int result = 1;
		
		for(int i = 0; i < a.length; i++) {
			result = result * a[i];
		}
		return result;
	}
}