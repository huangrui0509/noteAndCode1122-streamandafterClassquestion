package com.tj.question;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 台阶问题
 * @author lenovo
 *
 */
public class Step {
	//普通版本
	public static Integer getSum(int i){
		
			if(i==1) {
				return 1;
			}else if(i==2) {
				return 2;
			}else{
				return getSum(i-1)+getSum(i-2);
			}

	}
	//Stream
	public static void collect(){

		List<Integer> collect = Stream.generate(() -> getSum(10)).limit(1).collect(Collectors.toList());
		System.out.println(collect);

	}

	public static void main(String[] args) {
		System.out.println(getSum(10));
		collect();
	}
}
