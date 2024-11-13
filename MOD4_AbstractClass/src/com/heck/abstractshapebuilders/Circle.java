package com.heck.abstractshapebuilders;

public class Circle extends Shape{
	double radius;
	
	//Default Constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		double area = 3.14 * Math.pow(radius, 2);
		
		return area;
	}
	
	@Override
	public double perimeter() {
		double perimeter = 2 * 3.14 * radius;
		
		return perimeter;
	}
	
	@Override 
	public String toString() {
		double area = 3.14 * Math.pow(radius, 2);
		double perimeter = 2 * 3.14 * radius;
		
		return "The area of this circle is " + area + ", and the perimeter is " + perimeter + ".";
	}

}
