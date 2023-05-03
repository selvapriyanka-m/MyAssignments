package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String name = "selvapriyanka";
		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 != 0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
			System.out.print(ch[i]);
		}
	}
}
