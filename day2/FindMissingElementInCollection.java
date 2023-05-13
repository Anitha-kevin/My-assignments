package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementInCollection {
    
	public static void main(String[] args) {
	int[] num = {1,2,3,4,7,6,8};
	List <Integer> element=new ArrayList<Integer>();
	for (int i= 0; i < num.length; i++) {	
	element.add(num[i]);
	Collections.sort(element);
	if (num[i]+1!=num[i+1]) {
		System.out.println(num[i]+1);
		break;
	}
	}
	}
	}

