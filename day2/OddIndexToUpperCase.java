package week3.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
	
		  String test="changeme";
	char[] charArray = test.toCharArray();
     for (int i=0; i<charArray.length; i++) {
		if(i%2!=0){
		 char output = Character.toUpperCase(charArray[i]);
		 System.out.print(output);
		}
		 else {
			 char output=Character.toLowerCase(charArray[i]);
			System.out.print(output);
		}	
		}
		}
       }

