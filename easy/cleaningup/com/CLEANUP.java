package cleaningup.com;

import java.util.*;

public class CLEANUP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder s = new StringBuilder("");
		
		while(T-- > 0){
			
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			boolean[] jobs = new boolean[m + 1];
			for(int i = 1; i <= n; i++){
				int t = sc.nextInt();
				jobs[t] = true;
			}
			
			StringBuilder chef = new StringBuilder("");
			StringBuilder assistant = new StringBuilder("");
			
			int temp = 0 ;
			for(int i = 1; i <= m; i++){
				if(!jobs[i]){
					if(temp == 0){
						chef.append(i).append(" ");
						temp = 1;
					}else{
						assistant.append(i).append(" ");
						temp = 0;
					}
				}
			}
			chef.append("\n");
			assistant.append("\n");
			s.append(chef).append(assistant);
		}
		System.out.print(s);
		sc.close();
	}
}