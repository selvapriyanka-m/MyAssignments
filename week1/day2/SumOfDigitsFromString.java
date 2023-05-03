package week1.day2;

public class SumOfDigitsFromString {

	public int sumofDigits(String text) {
		int sum = 0;
		char ch[] = text.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				sum = sum + Character.getNumericValue(ch[i]);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		SumOfDigitsFromString s = new SumOfDigitsFromString();
		System.out.println("The sum of digits from the string " + text + " is " + s.sumofDigits(text));
	}

}
