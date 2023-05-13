package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		/*String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)		
		d)split the words and have it in an array		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).				 
	*/
		String test = "I am a software tester";
		String input="";
		String output="";
		String[] even = test.split(" ");
        for (int i = 0; i < even.length; i++) {
			if(i%2==0) {
				input=input+even[i];
				//System.out.println(even[i]);
				for (int j = input.length()-1; j>=0; j--) {
					output=output+input.charAt(j);
				}
			}			
			}
        System.out.println(output);
		}
	}
