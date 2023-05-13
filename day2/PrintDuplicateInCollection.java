package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateInCollection {

	public static void main(String[] args) {
		int[] arr= {20,30,10,40,50,10,20,60,30};
		Set<Integer> num = new HashSet<Integer>();
		   for (Integer value : arr) {
		   if(!num.add(value)) {
			System.out.println(value);
		}
			}
	}
}
	


