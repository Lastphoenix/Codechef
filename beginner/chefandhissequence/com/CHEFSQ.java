package chefandhissequence.com;

import java.util.Arrays;
import java.util.Scanner;

public class CHEFSQ {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		    while (t > 0) {
		    
		    int nLen = sc.nextInt();
		    Integer[] n = new Integer[nLen];
		    
		    for (int  i = 0; i < nLen; i++) {
		        n[i] = sc.nextInt();
		    }
		    

		    int fLen = sc.nextInt();
		    Integer[] f = new Integer[fLen];
		    for (int  i = 0; i < fLen; i++) {
		        f[i] = sc.nextInt();
		    } 
		    
		    if (Arrays.asList(n).containsAll(Arrays.asList(f))) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		    
		    t--;
		    
	    	}
	    sc.close();

	}

}
