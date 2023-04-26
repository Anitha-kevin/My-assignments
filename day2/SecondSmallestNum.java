package week1.day2;

import java.util.Arrays;

public class SecondSmallestNum {
public static void main(String[] args) {
	int[] mark=  {23,45,67,32,89,22 };
	Arrays.sort(mark);
	for (int i = 0; i < mark.length;) {
		System.out.println(mark[i=1]);
		break;
	}
}
}
