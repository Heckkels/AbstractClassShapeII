package com.heck.abstractshapebuilders;
//A basic program to instantiate different shape measurements and record this data in an array. 

public class ShapeArray {

	public static void main(String[] args) {
		String[] shapeInstance = new String[3];
		
		int i;
		
		//Shape Instances
		Rectangle testRectangle = new Rectangle (12.0, 15.0);
		Circle testCircle = new Circle (13.5);
		Triangle testTriangle = new Triangle(13.0, 15.0, 12.0);
		
		//Initial Shape Instances
		//Rectangle
		System.out.println("Rectangle Data");
		System.out.println("Area: " + testRectangle.area());
		System.out.println("Perimeter: " + testRectangle.perimeter());
		System.out.println();
		
		//Circle
		System.out.println("Circle Data");
		System.out.println("Area: " + testCircle.area());
		System.out.println("Perimeter: " + testCircle.perimeter());
		System.out.println();
		
		//Triangle
		System.out.println("Triangle Data");
		System.out.println("Area: " + testTriangle.area());
		System.out.println("Perimeter: " + testTriangle.perimeter());
		System.out.println();
		
		//Storing Shape Instances
		shapeInstance[0] = testRectangle.toString();
		shapeInstance[1] = testCircle.toString();
		shapeInstance[2] = testTriangle.toString();
		
		System.out.println("Array List Output:");
		
		//Array Loop for Output
		for (i = 0; i < shapeInstance.length; ++i) {
			System.out.println(shapeInstance[i]);
		}

	}

}
