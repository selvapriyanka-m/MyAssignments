package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String text = "I am a testleaf tester";
		String arr[] = text.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				char ch[] = arr[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					System.out.print(ch[j]);
				}
				System.out.print(" ");
			} else
				System.out.print(arr[i] + " ");
		}
	}

}
