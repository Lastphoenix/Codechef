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
			System.out.println(answer(X, Y, Z, A[i], B[i], C[i], D[i], points));
		}
		sc.close();
	}

	private static double answer(double[] x, double[] y, double[] z, double a, double b, double c, double d, int N) {

		double den1 = N * (N - 1);
		double ans = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j)	continue;
				double dx = x[i] - x[j];
				double dy = y[i] - y[j];
				double dz = z[i] - z[j];
				double y1 = dx * dx * dx * dx;
				double y2 = dy * dy * dy * dy;
				double y3 = dz * dz * dz * dz;
				double den2 = Math.sqrt(y1 + y2 + y3);
				double denominador = den1 * den2;
				double numerador = Math.abs((a * dx) + (b * dy) + (c * dz) + d);

				ans = ans + (numerador / denominador);
			}
		}
		return ans;
	}
}