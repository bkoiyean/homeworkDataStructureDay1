
public class RomanNumber {
	public static void main(String[] args) {
		String romanNumber = "II";
		int result = 0;
		while (romanNumber!="") {
			int i = 0;
			if (romanNumber.length()>1) {
				String letter1 = romanNumber.substring(i, i+1);
				String letter2 = romanNumber.substring(i+1, i+2);
				if (valueOfLetter(letter1)>=valueOfLetter(letter2)) {
					result +=valueOfLetter(letter1);
					romanNumber = romanNumber.substring(i+1);
				}
				else {
					result +=valueOfLetter(letter2)-valueOfLetter(letter1);
					romanNumber = romanNumber.substring(i+2);
				}
			}
			else {
				result +=valueOfLetter(romanNumber);
				romanNumber = romanNumber.substring(i+1);
			}
		}
		System.out.println(result);
		
//		Complexity: O(n) time

	}
	public static int valueOfLetter(String letter) {
		switch (letter) {
		case "I":
			return 1;
		case "V":
			return 5;
		case "X":
			return 10;
		case "L":
			return 50;
		case "C":
			return 100;
		case "D":
			return 500;
		case "M":
			return 1000;
		default:
			return 0;
		}
	}

}
