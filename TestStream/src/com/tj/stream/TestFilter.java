package com.tj.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class TestFilter {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("2");
		list.add("12");
		list.add("wws");
		list.add("ee");
		list.add("ee");
		list.add("huang");

		
		System.out.println(testMap(list));
	}
	//filter
	public static List<String> testFilter(List<String> list) {

		Stream<String> stream = list.stream();
		List<String> collect = stream.filter(String->String.length()>2).collect(Collectors.toList());

		return collect;
	}
	//去重distinct
	public static List<String> testDistinct(List<String> list) {

		Stream<String> stream = list.stream();
		List<String> collect = stream.distinct().collect(Collectors.toList());

		return collect;
	}
	//limit 截取前几个
	public static List<String> testLimit(List<String> list) {

		Stream<String> stream = list.stream();
		List<String> collect = stream.limit(3).collect(Collectors.toList());

		return collect;
	}
	//skip 跳过前几个
	public static List<String> testSkip(List<String> list) {

		Stream<String> stream = list.stream();
		List<String> collect = stream.skip(3).collect(Collectors.toList());

		return collect;
	}
	//map
	public static List<Boolean> testMap(List<String> list) {

		Stream<String> stream = list.stream();
		List<Boolean> collect = stream.map(String->String.length()>2).collect(Collectors.toList());

		return collect;
	}
}
