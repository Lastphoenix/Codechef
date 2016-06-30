package chefandthewildcardmatching.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TWOSTR {

	public static void main(String[] args) throws Exception {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		
		while (tests > 0) {
		    
		    String x = br.readLine();
		    String y = br.readLine();
		    boolean b = true;
		    
		    for(int i = 0; i < x.length(); i++){
		        if (x.charAt(i) != '?' && y.charAt(i) != '?') {
		            if (x.charAt(i) != y.charAt(i)) {
		                b = false;
		                break;
    	            }
		        } 
		    }
		    if(b) {
		        System.out.println("Yes"); 
		    } else {
		        System.out.println("No");
		    }
	    tests--;
		}

	}

}
