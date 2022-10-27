//	Complexity: O(n^n) time

public class LongestSameString {
	public static void main(String[] args) {
		String[] input = { "1floamento flo", "1flourist 1floa", "1flower 1floa" };

		String firstElement = input[0];
		String result = "";
		int countElementHasSameString = input.length;
		int countSameCharacterOfString = 0;
		
		while (countElementHasSameString == input.length) {
			
			countElementHasSameString = 0;
			
			countSameCharacterOfString++;
			
			String currentSameString = firstElement.substring(0, countSameCharacterOfString);
			
			result = currentSameString.substring(0, countSameCharacterOfString - 1);
			
			for (String i : input) {
				if (i.substring(0, countSameCharacterOfString).equals(currentSameString)) {
					countElementHasSameString++;
				}
			}

		}
		System.out.println("The longest same string is: " + result);
	}

}
