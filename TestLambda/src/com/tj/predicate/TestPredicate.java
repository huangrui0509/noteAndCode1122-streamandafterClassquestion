package com.tj.predicate;

import java.util.ArrayList;
import java.util.List;

public class TestPredicate {

	public static List<Person> findMatchPerson(List<Person> list,Predicate<Person> pre){
		List<Person> newlist = new ArrayList<Person>();
		for (Person person : list) {
			if(pre.test(person)) {
				newlist.add(person);
			}
		}
	
		return newlist;
		
	}
	
	public static void main(String[] args) {
		Person p1 = new Person(100,"hhh",10000.01);
		Person p2 = new Person(101,"ww",20000.01);
		Person p3 = new Person(102,"rr",30000.01);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p3);
		list.add(p2);
		
		//List<Person> findMatchPerson = findMatchPerson(list,p -> p.getSalary() > 10400.0);
		List<Person> findMatchPerson = findMatchPerson(list,p -> p.getId() > 101);
		System.out.println(findMatchPerson);
	}
}
