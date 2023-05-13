package week3.day2;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String input="Madam";
		String rev="";
		char[] Array = input.toCharArray();
		for (int i =Array.length-1; i>=0; i--) {
			rev=rev+Array[i];
		}
			if (rev.equalsIgnoreCase(input))
			   {
				System.out.println(input+" is a palindrome");
				}
	     else 
			{
			  System.out.println(input+" is not a palindrome");
		}
			}
	}
	



