/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

// source : https://www.tutorialspoint.com/design_pattern/facade_pattern.htm

public interface Shape {
    void draw();
 }

public class Rectangle implements Shape {

    @Override
    public void draw() {
       System.out.println("Rectangle::draw()");
    }
}

public class Square implements Shape {

    @Override
    public void draw() {
       System.out.println("Square::draw()");
    }
 }

public class Circle implements Shape {

    @Override
    public void draw() {
       System.out.println("Circle::draw()");
    }

}

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
       circle = new Circle();
       rectangle = new Rectangle();
       square = new Square();
    }

    public void drawCircle(){
       circle.draw();
    }
    public void drawRectangle(){
       rectangle.draw();
    }
    public void drawSquare(){
       square.draw();
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
       ShapeMaker shapeMaker = new ShapeMaker();

       shapeMaker.drawCircle();
       shapeMaker.drawRectangle();
       shapeMaker.drawSquare();
    }
}

// Output
// Circle::draw()
// Rectangle::draw()
// Square::draw()
