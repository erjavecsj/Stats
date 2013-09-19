public class Stats {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 5, 9};
		System.out.println(max(a));
		System.out.println(min(a));
		System.out.println(mean(a));
		System.out.println(median(a));

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

	public static double mean(int [] a) {
		double sum =0;
		double mean;
		for (int i =0; i<a.length; i++) {
			sum += a[i];

		}

		mean = sum / a.length;

		return mean;
	}

	public static double median(int [] a) {
		
		double middle = 0;
		if (a.length %2 == 0) {
			int numbers = a.length / 2;
			middle = (a[numbers -1] + a[numbers]) / 2; 
		} else {
			int numbers = a.length / 2;
			middle = a[numbers];
		}

		return middle;
	}
}