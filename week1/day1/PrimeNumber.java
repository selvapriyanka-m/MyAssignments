package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 11;
		int c = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				c = 1;
				break;
			}
		}
		if (c == 1) {
			System.out.println("The number " + n + " is not prime");
		} else
			System.out.println("The number " + n + " is prime");

	}
}
