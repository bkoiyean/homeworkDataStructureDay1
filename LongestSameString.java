//		Complexity: O(n x log n) time

package Day1;

import java.util.Arrays;

public class LongestSameString {
	public static void main(String[] args) {
		String[] input = { "1floamento flou", "1flourist flo", "1flouwer" };

		Arrays.sort(input);

		String firstString = input[0];
		String lastString = input[input.length - 1];
		String result = "";

		for (int i = 0; i < firstString.length(); i++) {
			if (firstString.charAt(i) == (lastString.charAt(i))) {
				result += firstString.charAt(i);
			} else {
				break;
			}
		}

		System.out.println("The longest same string is: " + result);
	}

}
