
public class LongestSameString {
	public static void main(String[] args) {
		String[] input = { "1floamento flo", "1flourist flo", "1flower" };

		String firstString = input[0];
		String sameString = "";
		int countString = input.length;
		int countCharacter = 0;
		while (countString == input.length) {
			countString = 0;
			countCharacter++;
			String test = firstString.substring(0, countCharacter);
			sameString = test.substring(0, countCharacter - 1);
			for (String i : input) {
				if (i.substring(0, countCharacter).equals(test)) {
					countString++;
				}
			}

		}
//		Complexity: O(n^n) time

		System.out.println("The longest same string is: " + sameString);
	}

}
