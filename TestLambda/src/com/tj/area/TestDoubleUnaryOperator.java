package com.tj.area;

import java.util.function.DoubleUnaryOperator;

public class TestDoubleUnaryOperator {

	public static double doubleUnaryOperatorTest(DoubleUnaryOperator func, double x1, double x2, int numSlices) {
		if (numSlices < 1) numSlices = 1;
		double delta = (x2 - x1) / numSlices;
		double start = x1 + delta / 2.0;
		double sum = 0.0;
		for (int i = 0; i <numSlices; i++) {
			
			sum += delta * func.applyAsDouble(start+delta * i);
			
		}
		return sum;
	}
	public static void main(String[] args) {
		//double d1 = integrate(x -> x, 10, 20, 1000);
		double d1 = doubleUnaryOperatorTest(x -> x*x, 10, 20, 1000);
		System.out.println(d1);
	}
	
	
}
