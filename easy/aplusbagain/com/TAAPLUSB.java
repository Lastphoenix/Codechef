package aplusbagain.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TAAPLUSB {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());

		while (tests > 0) {

			int number = Integer.parseInt(br.readLine());

			switch (number) {
			case 1:
				System.out.println(0.45);
				break;
			case 2:
				System.out.println(0.945);
				break;
			case 3:
				System.out.println(1.4445);
				break;
			case 4:
				System.out.println(1.94445);
				break;
			case 5:
				System.out.println(2.444445);
				break;
			case 6:
				System.out.println(2.944444);
				break;
			default:
				System.out.println((double) number / 2 - .0555555);
			}

			tests--;
		}
	}
}