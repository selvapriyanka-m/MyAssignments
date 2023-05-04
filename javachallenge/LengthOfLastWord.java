package javachallenge;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str="luffy is still joyboy";
		String s[]=str.split(" ");
		int len = s.length;
        System.out.println("Length of last word "+s[len-1]+" is "+s[len-1].length());
	}

}
