package com.tj.test2;

public class TestTriangleArea {

	public static double getArea(TriangleArea ta,double x,double y) {
		return ta.getArea(x, y);
		
	}
	
	public static void main(String[] args) {
		double area = getArea((x,y)->(x*y)/2,10,10);
		System.out.println("area="+area);
	}
}
