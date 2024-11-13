package com.heck.abstractshapebuilders;

public class Rectangle extends Shape {	
	double width; 
	double length;
	
	//Default Constructor
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double area() {
		double area = width * length;
		
		return (area);
	}
	
	@Override
	public double perimeter() {
		double perimeter = (width *2) + (length * 2);
		
		return (perimeter);
	}
	
	public String toString() {
		double area = width * length;
		double perimeter = (width *2) + (length * 2);
		
		return "The area of this rectangle is " + area + ", and the perimeter is " + perimeter + ".";
	}
}
