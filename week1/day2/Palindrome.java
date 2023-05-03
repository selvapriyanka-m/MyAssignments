package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String name = "repaper";
		String reverse = "";
		char ch[] = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse = reverse + ch[i];
		}
		if (name.equalsIgnoreCase(reverse))
			System.out.println("Given string " + name + " is Palindrome");
		else
			System.out.println("Given string " + name + " is not Palindrome");
	}

}
