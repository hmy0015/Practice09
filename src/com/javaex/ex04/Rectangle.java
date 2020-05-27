package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	private double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	 public double getArea() {
    	return width * height;
    }
    
    public double getPerimeter() {
    	return (width + height) * 2;
    }
    
    // 인터페이스 구현
	public void resize(double s) {
		width *= s;
		height *= s;
	}
}