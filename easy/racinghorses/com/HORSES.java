package racinghorses.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HORSES {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while (T-- > 0){
			
			int horses = sc.nextInt();
			Integer[] skills = new Integer[horses];
			
			for (int i = 0; i < horses; i++){
				skills[i] = sc.nextInt();
			}
			
			Arrays.sort(skills, new Comparator<Integer>()
		    {
		        @Override
		        public int compare(Integer x, Integer y)
		        {
		            return x - y;
		        }
		    });
			
			System.out.println(min(skills));
		}
		sc.close();
	}

	private static int min(Integer[] skills) {

		int x = 1000000000;
		int diff = 0;
		 
		for (int i = skills.length - 1; i >= 0 ; i--){
			for (int j = i - 1; j >= 0 ; j--) {
				diff = skills[i] - skills[j];
				if(diff < x) {
					x = diff;
				}
			}
		}
		return x;
	}
}