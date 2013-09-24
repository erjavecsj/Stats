public class Stats {
	public static void main(String[] args) {
		int [] a = {1, 6, 10, 14, 21, 23, 25, 27, 34};
		System.out.println(max(a));
		System.out.println(min(a));
		System.out.println(mean(a));
		System.out.println(median(a));
		System.out.println(quartile1(a));
		System.out.println(quartile3(a));
		System.out.println(mode(a));
		System.out.println(standardDeviation(a));

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

	public static int quartile1(int[] a) {

		double q1 = 0.0;

		q1 = a[((a.length+1)/4)-1];

		return q1;

	}

	public static int quartile3(int[] a) {

		double q3 = 0.0;
		q3 = a[((a.length+1)/4*3)-1];


		return q3;

	}

	public static int mode(int a[]) {
	    int value = 0;
	    int maxCount = 0;

	    for (int i = 0; i < a.length; i++) {
	        int count = 0;
	        for (int j = 0; j < a.length; j++) {
	            if (a[j] == a[i]) {
	            	count++;
	        	}
	        }	
	        if (count > maxCount) {
	            maxCount = count;
	            value = a[i];
	        }
	    }

	    return value;
	} 

	public static double standardDeviation(int a[]) {

		double total = 0;
		double difference = 0;
		double average = mean(a);
		double result = 0;

		for (int i = 0; i < a.length; i++) {
			difference = a[i] - average;
			total = total + difference * difference;
		}

		result = Math.sqrt(total/a.length);

		return result;

	}
}