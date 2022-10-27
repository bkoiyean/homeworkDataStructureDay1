//	Complexity: O(log n) time

import java.text.DecimalFormat;

public class SquareRoot {
	public static void main(String[] args) {
		int input = 90;

		DecimalFormat commaFormat = new DecimalFormat("###.0000");

		System.out.println("Result is: " + commaFormat.format(result(input, 0, input)));
	}

	public static double result(int input, double min, double max) {
		double mid = min + (max - min) / 2;
		double diff = mid * mid - input;
		if (Math.abs(diff) <= 0.01 * 0.01) {
			return mid;
		} else if (diff < 0) {
			return result(input, mid, max);
		} else {
			return result(input, min, mid);
		}

	}

}
