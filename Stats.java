public class Stats {
	public static void main(String[] args) {
		int [] a = {2,4,4,4,5,5,7,9};
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
			middle = a[numbers + 1];
		}

		return middle;
	}

	public static double quartile1(int[] a) {

		double length = a.length;
		double quarter = length/4;
		int placement = (int)quarter;
		double number = 0.0;
		double sum = a[placement] + a[placement -1];
		if (length% 4 !=0) {
			number = a[placement];
		} else {
			number = sum/2;
		}

		return number;

	}

	public static double quartile3(int[] a) {
		double length = a.length;
		double quater = length/4;
		double multiply = quater * 3;
		int placement = (int)multiply;
		double number = 0.0;
		double sum = a[placement] + a[placement -1];
		if (length % 4 !=0) {
			number = a[placement];
		} else {
			number = sum/2;
		}

		return number;

	}

	public static int mode(int [] a) {
	    int temporary, counter, number;
	    counter=0;
	    number=0;
	    for (int i=0; i<a.length; i++) {
	    	temporary =0;
	    	for (int k=0; k<a.length; k++) {
	    		if(a[i]==a[k]) {
	    			temporary++;
	    			if (counter<temporary) {
	    				counter=temporary;
	    				number=a[i];
	    			}
	    		}
	    	}
	    }

	    return number;
	} 

	public static double standardDeviation(int [] a) {

		double dev = 0;
		double avg = mean(a);

		for (int i = 0; i < a.length; i++) {
			dev += (a[i] - avg)*(a[i] - avg);
		}

		dev = dev/ (a.length-1);
		dev = Math.sqrt(dev);

		return dev;

	}
}