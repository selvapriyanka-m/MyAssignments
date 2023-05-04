package javachallenge;

public class PalindromePhrase {

	public static void main(String[] args) {
		String phrase =   "A man, a plan, a canal: Panama";
		String reverse = "";
		phrase=phrase.toLowerCase().replaceAll("[^a-z0-9]", "");
		char ch[] = phrase.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse = reverse + ch[i];
		}
		if (phrase.equals(reverse))
			System.out.println("Phrase " + phrase + " is a Palindrome");
		else
			System.out.println("Phrase " + phrase + " is not a Palindrome");
	}

}
