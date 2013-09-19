public class Stats {
	public static void main(String[] args) {
		int [] a = {-3,2,-7,4,0};
		System.out.println(max(a));
		System.out.println(min(a));

	}

	public static int max(int [] a) {
		int max = a[0];

		for (int i = 0; i<a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		return max;
	}

	public static int min(int [] a) {
		int min = a[0];

		for (int i = 0; i<a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		return min;
	}
}