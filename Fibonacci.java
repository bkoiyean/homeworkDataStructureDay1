//		Complexity: O(n) time

package Day2;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 10;
		int last = 0;
		int current = 1;
		int temp;

		for (int i = 2; i <= num; i++) {
			temp = current;
			current = last + current;
			last = temp;
		}

		System.out.println("Fibonacci of number " + num + " is: " + current);
	}

}
