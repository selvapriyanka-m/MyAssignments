package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "Selvapriyanka";
		char ch[] = name.toCharArray();
		Set<Character> unique = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			unique.add(ch[i]);
		}
		System.out.println("The unique characters in the string "+name+" is "+ unique);
	}

}
