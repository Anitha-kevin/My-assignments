package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
			String text1 = "stops";
			String text2 = "potss";
		int length = text1.length();
		int length2 = text2.length();
		if (length==length2) {
		System.out.println("yes");	
		}
		char[] charArray = text1.toCharArray();	
	    char[] charArray2 = text2.toCharArray();
	
	    Arrays.sort(charArray);
	    Arrays.sort(charArray2);
	System.out.println(charArray);
	System.out.println(charArray2);
	}
}