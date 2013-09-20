public class Stats {
	public static void main(String[] args) {
		int [] a = {1, 6, 10, 14, 21, 23, 25, 27, 34};
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

	public static double quartile1(int [] a) {
		double middle = 0;
		double q1;
		double numbers;
		if (a.length %2 == 0) {
			double numbers = a.length / 2;
			if (numbers %2 == 0){
				middle = numbers / 2;
				q1 = a[middle] + a[middle - 1] /2;
			} else {
				middle = numbers / 2;
				q1 = [numbers + 1];
			}

		} else {
			int numbers = a.length / 2;
			if (a[numbers]) {
				
			}
			middle = a[numbers];
		}

		return middle;
	}
}