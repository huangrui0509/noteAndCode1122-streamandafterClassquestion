package com.tj.test;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
	public static void main(String[] args) {
		String[] str = {"file","soure","window","help"};
		//Arrays.sort(str, new Test1());
		Comparator<String> c1 = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
		Comparator<String> c2  = (String s1, String s2) -> s1.compareTo(s2);
		Comparator<String> c3  = (s1, s2) -> s2.compareTo(s1);
		Comparator<String> c4 = String::compareTo;
		Arrays.sort(str, c4);
		System.out.println(Arrays.toString(str));
	}

}
