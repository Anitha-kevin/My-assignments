package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class SetIntersection {

	public static void main(String[] args) {
Set<Integer> set1=new TreeSet<Integer>();
set1.add(20);
set1.add(40);
set1.add(60);
set1.add(10);
Set<Integer> set2=new TreeSet<Integer>();
set2.add(10);
set2.add(50);
set2.add(30);
set2.add(20);
set2.addAll(set1);
System.out.println(set2);
	}
}
