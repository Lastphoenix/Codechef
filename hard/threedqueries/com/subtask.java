package threedqueries.com;

public class subtask {

	static double one(double[] x, double[] y, double[] z, double a, double b, double c, double d, int N) {

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
