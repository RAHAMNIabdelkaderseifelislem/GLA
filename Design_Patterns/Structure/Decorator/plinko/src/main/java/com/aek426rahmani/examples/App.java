/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

// source : https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/

// Interface named Shape
public interface Shape {

	// Method inside interface
	void draw();
}

// Class 1
// Class 1 will be implementing the Shape interface

// Rectangle.java
public class Rectangle implements Shape {

	// Overriding the method
	@Override public void draw()
	{
		// /Print statement to execute when
		// draw() method of this class is called
		// later on in the main() method
		System.out.println("Shape: Rectangle");
	}
}

// Circle.java
public class Circle implements Shape {

	@Override
	public void draw()
	{
		System.out.println("Shape: Circle");
	}
}

// Class 2
// Abstract class
// ShapeDecorator.java
public abstract class ShapeDecorator implements Shape {

	// Protected variable
	protected Shape decoratedShape;

	// Method 1
	// Abstract class method
	public ShapeDecorator(Shape decoratedShape)
	{
		// This keywordd refers to current object itself
		this.decoratedShape = decoratedShape;
	}

	// Method 2 - draw()
	// Outside abstract class
	public void draw() { decoratedShape.draw(); }
}

// Class 3
// Concrete class extending the abstract class
// RedShapeDecorator.java
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape)
	{
		super(decoratedShape);
	}

	@Override public void draw()
	{
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape)
	{
	// Display message whenever function is called
		System.out.println("Border Color: Red");
	}
}

// DecoratorPatternDemo.java

// Class
// Main class
public class DecoratorPatternDemo {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of Shape interface
		// inside the main() method
		Shape circle = new Circle();

		Shape redCircle
			= new RedShapeDecorator(new Circle());

		Shape redRectangle
			= new RedShapeDecorator(new Rectangle());

		// Display message
		System.out.println("Circle with normal border");

		// Calling the draw method over the
		// object calls as created in
		// above classes

		// Call 1
		circle.draw();

		// Display message
		System.out.println("\nCircle of red border");

		// Call 2
		redCircle.draw();

		// Display message
		System.out.println("\nRectangle of red border");

		// Call 3
		redRectangle.draw();
	}
}

// Output
//Circle with normal border
//Shape: Circle

//Circle of red border
//Shape: Circle
//Border Color: Red

//Rectangle of red border
//Shape: Rectangle
//Border Color: Red
