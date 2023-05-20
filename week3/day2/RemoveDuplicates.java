package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="PayPal India";
        char ch[]=text.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        Set<Character> dupCharSet = new HashSet<Character>();
        for (int i = 0; i < ch.length; i++) {
			if(charSet.add(ch[i]))
			{}
			else
				dupCharSet.add(ch[i]);
		}
      
        System.out.println("The unique characters are ");
        for(Character c:charSet) {
        	if(c!=' ')
        		System.out.println(c);
		}
	}

}
