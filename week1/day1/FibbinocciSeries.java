package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		int sum = 0;
		System.out.print(firstNumber + " ");
		System.out.print(secondNumber + " ");
		for (int i = 0; i < 11; i++) {
			sum = firstNumber + secondNumber;
			System.out.print(sum + " ");
			firstNumber = secondNumber;
			secondNumber = sum;

		}
	}

}
