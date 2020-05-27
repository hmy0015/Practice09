package com.javaex.ex04;

public class RectTriangle extends Shape {
	private double width, height;
	
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 추상클래스에서 상속받은 메소드의 함수 몸체 구현하기
    public double getArea() {
    	return width * height * 0.5;
    }
    
    public double getPerimeter() {
    	double perimeter =  width + height + Math.sqrt(width * width + height * height);
    	return perimeter;
    }
}