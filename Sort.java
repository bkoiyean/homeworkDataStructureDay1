//	Complexity: O(n) time

public class Sort {
	public static void main(String[] args) {
		int[] input = { 1, 2, 1, 2, 1, 0, 0, 2, 0, 1 };
		int count0 = 0;
		int count1 = 0;
		for (int i : input) {
			if (i == 0) {
				count0++;
			} else if (i == 1) {
				count1++;
			}
		}

		for (int i = 0; i < input.length; i++) {
			if (i < count0) {
				input[i] = 0;
			} else if (i < count0 + count1) {
				input[i] = 1;
			} else {
				input[i] = 2;
			}
		}
		for (int i : input) {
			System.out.println(i);
		}
	}

}
