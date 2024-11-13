package com.heck.abstractshapebuilders;

public class Triangle extends Shape{
	double sideLengthA; 
	double sideLengthB; 
	double sideLengthC;
	
	//Default Constructor
	public Triangle(double sideLengthA, double sideLengthB, double sideLengthC) {
		super();
		this.sideLengthA = sideLengthA;
		this.sideLengthB = sideLengthB;
		this.sideLengthC = sideLengthC;
	}
	
	@Override
	public double area() {
		double s = (sideLengthA + sideLengthB + sideLengthC)/2;
		double areaCalc = ((s) * (s - sideLengthA) * (s - sideLengthB) * (s - sideLengthC));
		double area = Math.sqrt(areaCalc);
		
		return area;
		
	}
	
	@Override
	public double perimeter() {
		double perimeter = sideLengthA + sideLengthB + sideLengthC;
		
		return perimeter;
	}
	@Override
	public String toString() {
		double s = (sideLengthA + sideLengthB + sideLengthC) / 2;
		double area = Math.sqrt(s * (s - sideLengthA) * (s - sideLengthB) * (s - sideLengthC));
		
		double perimeter = sideLengthA + sideLengthB + sideLengthC;
		
		return "The area of this triangle is " + area + ", and the perimeter is " + perimeter + ".";
	}
}
