package findlargest.com;

public class findingLargest {

	@SuppressWarnings("unused")
	private static double findLargest(double[] a) {

		double largest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		return largest;
	}
}