package threedqueries.com;

import java.util.Scanner;

public class MGCH3D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int points = sc.nextInt();
		int queries = sc.nextInt();
		double[] X = new double[points];
		double[] Y = new double[points];
		double[] Z = new double[points];
		double[] A = new double[queries];
		double[] B = new double[queries];
		double[] C = new double[queries];
		double[] D = new double[queries];

		for (int i = 0; i < points; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			Z[i] = sc.nextInt();
		}

		for (int i = 0; i < queries; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
			D[i] = sc.nextInt();
			subtasktwo(X, Y, Z, A[i], B[i], C[i], D[i], points);
		}
		sc.close();
	}
	
	private static double subtasktwo(double[] x, double[] y, double[] z, double A, double B, double C, double D, int N) {

		double den1 = N * (N - 1);
		int V = 77;
		double ans = 0;
		double X = max(x) + 1;
		double Y = max(y) + 1;
		double Z = max(z) + 1;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				
				double dx = x[i] - x[j];
				double dy = y[i] - y[j];
				double dz = z[i] - z[j];

				for (int k = -(V - 1); k < (V - 1); k++) {
					for (int l = -(V - 1); l < (V - 1); l++) {
						for (int m = -(V - 1); m < (V - 1); m++) {
							if (dx == 0 && dy == 0 && dz == 0)
								continue;

							double num = cnt(X,Y,Z,dx, dy, dz) * Math.abs(A * dx + B * dy + C * dz + D);
							double den = Math.sqrt(dx * dx * dx * dx + dy * dy * dy * dy + dz * dz * dz * dz);
							ans += num / (den1 * den);
						}
					}
				}
			}
		}
		return ans;
	}
	
	private static double cnt(double dx, double dy, double dz, double X, double Y, double Z) {
		
		double M = X + 2 * X * Y + 4 * X * Y * Z;
		double L = 2097152;
		double T = L - 1 - M;
		double[] C = fft(X,Y);
		double temp = 0;
		
		for (int k = 0; k < 2 * L - 1; k++) {
			
		    if (C[k] == 0)    continue;
		    dx = (k - T) % (2 * X) - X;
		    dy = (k - T) % (4 * X * Y) / (2 * X) - Y;
		    dz = (k - T) / (4 * X * Y) - Z;
		    if (dx == 0 && dy == 0 && dz == 0) continue;
		    temp = C[k]; 
		}
		return temp;
	}

	private static double[] fft(double x, double y) {
		
		//We perform a FFT to calculate the DFT of the polynomial A(x)A(x).
		//We perform another FFT to calculate the DFT of the polynomial B(x)B(x).
		//Finally, we need to perform an inverse FFT to calculate the product C(x)C(x).
		
		return null;
	}

	private static double max(double[] a) {

		double largest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		return largest;
	}
}