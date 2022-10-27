//	Complexity: O(n) time

public class RomanNumber {
	public static void main(String[] args) {
		String romanNumber = "MCMXCIV";

		int result = 0;
		int lastValue = 1001;

		while (romanNumber != "") {

			char currentLetter = romanNumber.charAt(0);

			if (valueOfLetter(currentLetter) <= lastValue) {
				result += valueOfLetter(currentLetter);
			} else {
				result += valueOfLetter(currentLetter) - 2 * lastValue;
			}

			lastValue = valueOfLetter(currentLetter);
			romanNumber = romanNumber.substring(1);
		}

		System.out.println(result);

	}

	public static int valueOfLetter(char letter) {
		switch (letter) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

}
