package com.tj.afterclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStudent {

	public static List<Student> createStudent(){
		
		//System.out.println(num);
		List<Student> stulist = new ArrayList();
		//分数赋值
		List<Integer> scores = Stream.iterate(60, n -> n + 5).limit(9).collect(Collectors.toList());
		for(int i=1;i<=50;i++) {
			//随机分数
			int num = (int)(Math.random()*9);
			Student s = new Student(i,"s"+i,scores.get(num));
			stulist.add(s);
		}
		
		return stulist;
		
	}
	public static void main(String[] args) {
		List<Student> students = createStudent();
		Stream<Student> stream = students.stream();
		Map<Integer, List<Student>> collect = stream.collect(Collectors.groupingBy(Student::getScore));
		
		System.out.println(collect);
		 for (Integer in : collect.keySet()) {
	            
	            List<Student> list = collect.get(in);
	            System.out.println("分数为"+in +"的学生一共"+list.size()+"位:");
	            System.out.println(list);
	        }
	}
}
