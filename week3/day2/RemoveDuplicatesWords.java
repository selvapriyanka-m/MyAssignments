package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String array[]=text.split(" ");
		Set<String> unique = new LinkedHashSet<String>();
		for (int j = 0; j < array.length; j++) {
			unique.add(array[j]);
		}
		System.out.println(unique);

	}

}
