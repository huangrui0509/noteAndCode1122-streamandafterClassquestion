package com.tj.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestGetStream {

	public static void main(String[] args) {
		//获取到stream
		//list
		List<String> strlist = new ArrayList();
		strlist.add("aaa");
		strlist.add("ccc");
		strlist.add("avv");
		Stream<String> stream = strlist.stream();
		//Array
		String[] str = {"ss","dd","ff"};
		Stream<String> stream2 = Arrays.stream(str);
		//直接通过值进行获取
		Stream<String> num = Stream.of("haung","rui");
		System.out.println();
		
		
	}
}
