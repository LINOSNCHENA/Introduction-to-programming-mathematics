package q7abInter;
// Java program to illustrate the concept of interface

import java.io.*;

interface Shape3 {
	// abstract method
	void draw();

	double area();
}
// ======================================================
class Rectangle3 implements Shape3 {
	int length, width;

	// constructor
	Rectangle3(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle has been drawn ");
	}

	@Override
	public double area() {
		return (double) (length * width);
	}
}
// ======================================================
class Circle3 implements Shape3 {
	double pi = 3.14;
	int radius;

	// constructor
	Circle3(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle has been drawn ");
	}

	@Override
	public double area() {
		return (double) ((pi * radius * radius) / 2);
	}
}

class interFaceExample2 {
	public static void main(String[] args) {
		System.out.print("\n =================|Rectangle_Vs_Cycle1|=====================");
		// creating the Object of Rectangle class and using shape interface reference.
		Shape3 rect = new Rectangle3(2, 3);
		System.out.println("\n Area of rectangle2: " + rect.area());

		// creating the Objects of circle class
		Shape3 circle = new Circle3(2);
		System.out.println("Area of circle2: " + circle.area());
		System.out.print("=================|Rectangle_Vs_Cycle2|=====================\n ");
	}
}
